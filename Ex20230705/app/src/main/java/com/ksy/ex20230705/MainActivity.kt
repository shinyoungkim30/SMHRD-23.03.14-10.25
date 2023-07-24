package com.ksy.ex20230705

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // 준비
        setContentView(R.layout.activity_main) // xml + kt 연결

        // 1. Button 찾기
        var btn1 : Button = findViewById(R.id.button)
        var btn2 : Button = findViewById(R.id.button2)
        // 2. TextView 찾기
        var tv1 : TextView = findViewById(R.id.textView)
        // 3. Button 눌렀을 때를 감지(Event)할 Listener 달아주기
        btn1.setOnClickListener {
            // 4. Listener 안에서 TextView의 text 속성 바꾸기
//            tv1.setText("안녕하세요!")
            tv1.text = "안녕!" // public 변수 접근
            tv1.setTextColor(Color.BLACK) // 메서드로 접근
//            tv1.setTextColor(Color.parseColor("#FF7F50"))
        }
        btn2.setOnClickListener {
            tv1.text = "안녕하세요"
            tv1.setTextColor(Color.RED)
        }
    }
}