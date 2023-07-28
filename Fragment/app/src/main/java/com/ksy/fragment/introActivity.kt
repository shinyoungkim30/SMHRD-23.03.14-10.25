package com.ksy.fragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class introActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val handler = Handler()
        handler.postDelayed({
            // Intro 화면이 보이고 3초 뒤에 MainActivity 전환 -> Intent
            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }, 3000)
    }
}