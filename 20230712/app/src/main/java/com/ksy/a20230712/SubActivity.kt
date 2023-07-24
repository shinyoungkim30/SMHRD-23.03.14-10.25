package com.ksy.a20230712

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

// 자료구조 : 값(Data), 작업(Process)을 저장하는 방식
// List, Stack, Queue, Map, Tree

class SubActivity : AppCompatActivity() {

    lateinit var listView: ListView
    lateinit var btn_finish : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        listView = findViewById(R.id.listView)
        btn_finish = findViewById(R.id.button)

        // Intent로 전달된 데이터 꺼내서 Button에 띄우기
        var myIntent : Intent = intent

        var email: String? = myIntent.getStringExtra("email")

        btn_finish.text = email + "님 종료하시겠습니까?"

        // 1. Data
        // 2. 템플릿 (Android에서 제공해주는 템플릿)
        // 3. Adapter (Data + 템플릿) - Android에서 제공해주는 Adapter
        var foods = arrayOf("참치회", "아구찜", "파지감자탕", "오돌뼈", "쏘맥")

        var adapter = ArrayAdapter<String>(applicationContext, android.R.layout.simple_list_item_1, foods)

        // listView에 adapter 연결
        listView.adapter = adapter

        findViewById<Button>(R.id.button).setOnClickListener {
//            var it_next : Intent = Intent(this, MainActivity::class.java)
//            startActivity(it_next)
            // Android는 멀티태스킹을 지원하는 OS(운영체제)이다!
            finish()
        }
    }
}