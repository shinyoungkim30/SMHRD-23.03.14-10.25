package com.ksy.ex20230707

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    var cnt: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)

        textView.text = cnt.toString()
    }

    // 버튼이 늘어날 때마다 메서드를 하나씩 계속 추가해야 하나...
//    fun plusClick(currentClick: View) {
//        cnt++
//        textView.text = cnt.toString()
//    }
//
//    fun minusClick(currentClick: View) {
//        if (cnt > 0) {
//            cnt--
//        }
//        textView.text = cnt.toString()
//    }

    // click 메서드 하나로 여러개의 Event를 처리할 수 있음
    // 매개변수 currentClick => 사용자가 클릭한 View (Button)
    fun btnClick(currentClick: View) {
        if (currentClick.id == R.id.btn_minus) { // -버튼 클릭
            if (cnt > 0) {
                cnt--
            }
        } else if (currentClick.id == R.id.btn_plus) { // +버튼 클릭
            cnt++
        }
        textView.text = cnt.toString()
    }

}