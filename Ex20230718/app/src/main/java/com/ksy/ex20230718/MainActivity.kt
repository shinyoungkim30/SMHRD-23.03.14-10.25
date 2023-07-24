package com.ksy.ex20230718

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    lateinit var btn_click: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_click = findViewById(R.id.button)

        btn_click.setOnClickListener {
            // startActivity => 편도
            // ForResultLauncher => 왕복
            var it_color = Intent(this, ColorActivity::class.java)
            frLauncher.launch(it_color)
        }
    }

    var frLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        // it : 갔다가 돌아왔을 때 담아준 데이터!

        // 1. 이상없이 돌아왔는지
        if (it.resultCode == RESULT_OK) {
            // 2. 담아준 데이터가 있는지
            var result: Int = it.data!!.getIntExtra("color", -1)
        }
    }
}