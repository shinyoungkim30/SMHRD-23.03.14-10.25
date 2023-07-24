package com.ksy.ex20230718

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView

class ColorActivity : AppCompatActivity() {

    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)

        listView = findViewById(R.id.lv_color)

        var colors = arrayOf("Red", "Green", "Blue")

        var adapter = ArrayAdapter<String>(applicationContext, android.R.layout.simple_list_item_1, colors)
        listView.adapter = adapter

        listView.setOnItemClickListener(OnItemClickListener { adapterView, view, i, l ->
            // 1. 데이터 담을 빈 Intent 생성
            var it_result = Intent()
            // 2. Intent에 값 담기 (index)
            it_result.putExtra("color", i)
            // 3. 다시 돌려주기
            setResult(RESULT_OK, it_result)
            // 4. 종료
            finish()
        })
    }
}