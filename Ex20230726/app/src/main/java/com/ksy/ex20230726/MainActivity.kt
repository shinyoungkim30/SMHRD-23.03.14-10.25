package com.ksy.ex20230726

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var rv: RecyclerView
    lateinit var btn_add: Button

    var data = ArrayList<VO>()

    lateinit var adapter: DirectAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv = findViewById(R.id.rv)
        btn_add = findViewById(R.id.btn_add)

        data.add(VO("네이버", "https://www.naver.com"))
        data.add(VO("유튜브", "https://www.youtube.com"))
        data.add(VO("구글", "https://www.google.com"))

        adapter = DirectAdapter(applicationContext, R.layout.template, data)

        rv.layoutManager = LinearLayoutManager(applicationContext)
        rv.adapter = adapter

        btn_add.setOnClickListener {
            var intent = Intent(this, AddActivity::class.java)
            launcher.launch(intent)
        }
    }

    var launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        if (it.resultCode == RESULT_OK) {
            var title = it.data!!.getStringExtra("addTitle").toString()
            var url = it.data!!.getStringExtra("addUrl").toString()

            data.add(VO(title, url))

            // 어댑터 새로고침
            adapter.notifyDataSetChanged()
        }
    }
}