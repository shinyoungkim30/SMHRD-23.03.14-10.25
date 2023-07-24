package com.ksy.andserver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson

class LoginActivity : AppCompatActivity() {

    lateinit var etId: EditText
    lateinit var etPw: EditText
    lateinit var btnLogin: Button

    lateinit var reqQueue: RequestQueue

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etId = findViewById(R.id.etId)
        etPw = findViewById(R.id.etPw)
        btnLogin = findViewById(R.id.btnLogin)

        reqQueue = Volley.newRequestQueue(this@LoginActivity)

        btnLogin.setOnClickListener {
            var inputId = etId.text.toString()
            var inputPw = etPw.text.toString()

            val request = object : StringRequest(
                Request.Method.POST,
                "http://172.30.1.55:8089/login",
                { response ->
                    Log.d("response", response.toString())
                    if (response == "Success") {
                        Toast.makeText(this, "로그인 성공!", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
                    }
                },
                { error ->
                    Log.d("error", error.toString())
                }
            ) {
                override fun getParams(): MutableMap<String, String> {
                    val params: MutableMap<String, String> = HashMap<String, String>()

                    val amv = AndMemberVO(inputId, inputPw, null, null)

                    params.put("LoginMember", Gson().toJson(amv))

                    return params
                }
            }
            request.setShouldCache(false)
            reqQueue.add(request)
        }
    }
}