package com.ksy.ex230719

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    lateinit var edt_id: EditText
    lateinit var edt_pw: EditText
    lateinit var btn_login2: Button

    lateinit var members: HashMap<String, String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edt_id = findViewById(R.id.edt_id)
        edt_pw = findViewById(R.id.edt_pw)
        btn_login2 = findViewById(R.id.btn_login2)

        members = HashMap()

        members.put("qwer", "qwer")
        members.put("qwer1", "qwer1")
        members.put("qwer2", "qwer2")
        members.put("qwer3", "qwer3")
        members.put("qwer4", "qwer4")

        btn_login2.setOnClickListener {
            var inputID: String = edt_id.text.toString()
            var inputPW: String = edt_pw.text.toString()

            if (members.containsKey(inputID)) {
                if (members.get(inputID).equals(inputPW)) {
                    var it_result = Intent()
                    it_result.putExtra("id", inputID)
                    setResult(RESULT_OK, it_result)
                    finish()
                } else {
                    Toast.makeText(this, "아이디 또는 비밀번호를 확인하세요.", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "존재하지 않는 아이디입니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}