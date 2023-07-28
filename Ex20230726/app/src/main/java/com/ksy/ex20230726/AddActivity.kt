package com.ksy.ex20230726

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class AddActivity : AppCompatActivity() {

    lateinit var edt_title: EditText
    lateinit var edt_url: EditText
    lateinit var btn_add2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        edt_title = findViewById(R.id.edt_title)
        edt_url = findViewById(R.id.edt_url)
        btn_add2 = findViewById(R.id.btn_add2)

        btn_add2.setOnClickListener {
            var inputTitle = edt_title.text.toString()
            var inputUrl = edt_url.text.toString()

            var intent = Intent()
            intent.putExtra("addTitle", inputTitle)
            intent.putExtra("addUrl", inputUrl)

            // title과 url이 비어있지 않은지 검사하고 보내면 더 좋음
            setResult(RESULT_OK, intent)

            finish()
        }
    }
}