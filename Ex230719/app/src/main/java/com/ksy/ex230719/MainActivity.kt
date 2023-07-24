package com.ksy.ex230719

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    lateinit var tv_id: TextView
    lateinit var listView: ListView
    lateinit var btn_write: Button
    lateinit var btn_login: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_id = findViewById(R.id.tv_id)
        listView = findViewById(R.id.listView)
        btn_write = findViewById(R.id.btn_write)
        btn_login = findViewById(R.id.btn_login)

        var data = arrayOf("1. 게시글 내용 1", "2. 게시글 내용 2", "3. 게시글 내용 3", "4. 게시글 내용 4")

        var adapter =
            ArrayAdapter<String>(applicationContext, android.R.layout.simple_list_item_1, data)
        listView.adapter = adapter

        btn_login.setOnClickListener {
            var it_login = Intent(this, LoginActivity::class.java)
            login_launcher.launch(it_login)
        }
    }

    var login_launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        if (it.resultCode == RESULT_OK) {
            var result = it.data!!.getStringExtra("id")
            tv_id.text = result + "님 환영합니다."
            btn_write.isVisible = true
            btn_login.text = "로그아웃"
        }
    }
}