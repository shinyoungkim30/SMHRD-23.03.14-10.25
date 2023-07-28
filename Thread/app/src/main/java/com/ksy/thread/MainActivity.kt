package com.ksy.thread

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var tv_start1: TextView
    lateinit var btn_start1: Button
    lateinit var tv_start2: TextView
    lateinit var btn_start2: Button
    lateinit var edt_startNum: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_start1 = findViewById(R.id.tv_start1)
        btn_start1 = findViewById(R.id.btn_start1)
        tv_start2 = findViewById(R.id.tv_start2)
        btn_start2 = findViewById(R.id.btn_start2)
        edt_startNum = findViewById(R.id.edt_startNum)

        // Thread는 class로 설계한다
        // 객체를 생성해야한다

        btn_start1.setOnClickListener {
            var th1: cntThread = cntThread(tv_start1, edt_startNum.text.toString().toInt())
            th1.start()
        }

        btn_start2.setOnClickListener {
            var th1 = cntThread(tv_start2, edt_startNum.text.toString().toInt())
            th1.start()
        }
    }

    var cntHandler: Handler = object : Handler(Looper.getMainLooper()) {
        // override 단축키 : Alt + Insert
        override fun handleMessage(msg: Message) {
            super.handleMessage(msg)
            // 메시지를 받아서 처리하는 곳
            var tv: TextView = msg.obj as TextView
            tv.text = msg.arg1.toString()
        }
    }

    inner class cntThread(var tv: TextView, var startNum: Int) : Thread() {
        // 1. Thread 클래스 상속
        // 2. Runnable 인터페이스 구현 (implements)
        override fun run() {
            // super.메서드 이름
            // 삭제해도 되는 경우(매개변수 없으면), 안되는 경우(매개변수 있으면)

            // 10~1 까지 세기
            for (i in startNum downTo 1) {
                // 1. 메시지 생성
                var msg: Message = Message()
                // 2. 데이터 세팅
                msg.arg1 = i
                msg.obj = tv
                // 3. 핸들러한테 전송
                cntHandler.sendMessage(msg)

                Thread.sleep(500)
            }
            // Thread는 run 메서드가 끝나면 소멸
        }
    }
}