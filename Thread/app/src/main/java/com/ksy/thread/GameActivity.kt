package com.ksy.thread

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.widget.ImageView
import android.widget.TextView
import java.util.Random

class GameActivity : AppCompatActivity() {
    // ImageView 타입의 배열 9칸 생성하고 null로 초기화
    var imgs = arrayOfNulls<ImageView>(9)
    var threads = arrayOfNulls<dodoThread>(9)

    lateinit var tv_score: TextView
    lateinit var tv_time: TextView

    var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        tv_score = findViewById(R.id.tv_score)
        tv_time = findViewById(R.id.tv_time)

        cntThread(tv_time, 30).start()

        for (i in 0 until 9) {
            // imageView 1 ~ 9 id를 가진 view 주소 알아내는 코드
            var id = resources.getIdentifier("imageView" + (i + 1), "id", packageName)
            imgs[i] = findViewById(id)
            imgs[i]!!.tag = "off"

            // 배열에 생성된 Thread 누적
            threads[i] = dodoThread(imgs[i]!!)
            threads[i]!!.start()
            // Thread 종료시키는 방법
            // 1. interrupt를 발생시킨다
            // 2. Thread 내부에서는 interrupt exception이 발생
            // 3. 이걸 이용해서 try-catch를 활용하여 run 메서드를 종료 => Thread 클래스 안에서

            // 두더지 클릭했을 때 on off 판단
            // R.drawable. 주소로 이미지 변경했었음
            // Android에서 이미지끼리 비교하는 방법은 Drawable이라는 객체로 변경 후 이미지 처리
            // 일이 커짐 => View에 tag라는 변수가 있음! 얘를 활용
            imgs[i]!!.setOnClickListener {
                if (imgs[i]!!.tag.toString() == "on") {
                    score++
                } else {
                    score--
                }
                tv_score.text = score.toString()
                imgs[i]!!.tag = "off"
            }
        }
    }

    // Handler
    var dodoHandler: Handler = object : Handler(Looper.getMainLooper()) {
        override fun handleMessage(msg: Message) {
            super.handleMessage(msg)

            // 업캐스팅 되어있는 상태에서 하위 클래스로 형변환
            (msg.obj as ImageView).setImageResource(msg.arg1)

            (msg.obj as ImageView).tag = if (msg.arg1 == R.drawable.on) "on" else "off"
        }
    }

    // Thread
    inner class dodoThread(var dodo: ImageView) : Thread() {
        override fun run() {
            try {
                while (true) {
                    // 두더지마다 랜덤한 offTime 부여
                    var offTime = Random().nextInt(5000) + 500 // 0.5 ~ 5.5 사이
                    Thread.sleep(offTime.toLong())

                    // 올라가는 이미지로 변경
                    var msg = Message()
                    msg.obj = dodo // ImageView 타입의 객체가 Object 타입으로 형변환(업캐스팅)
                    msg.arg1 = R.drawable.on

                    dodoHandler.sendMessage(msg)

                    var onTime = Random().nextInt(1000) + 500 // 0.5 ~ 1.5 사이
                    Thread.sleep(onTime.toLong())

                    // 내려가는 이미지로 변경
                    // Message 객체는 일회성 => 한번 보낸 메시지 객체는 재사용이 불가능
                    msg = Message()
                    msg.obj = dodo
                    msg.arg1 = R.drawable.off

                    dodoHandler.sendMessage(msg)
                }
            } catch (e: InterruptedException) {
                return // 메서드 종료
                // 메서드는 return 키워드를 만나는 그 즉시 호출한 곳으로 돌아간다
            }
        }
    }

    var cntHandler: Handler = object : Handler(Looper.getMainLooper()) {
        // override 단축키 : Alt + Insert
        override fun handleMessage(msg: Message) {
            super.handleMessage(msg)
            // 메시지를 받아서 처리하는 곳
            var tv: TextView = msg.obj as TextView
            tv.text = msg.arg1.toString()

            // Thread 중지
            if (msg.arg1 == 0) {
                for (temp in threads) {
                    // in 오른쪽에 적힌 배열에서 순서대로 하나씩 꺼내 temp에 저장
                    temp!!.interrupt()
                }
            }
        }
    }

    inner class cntThread(var tv: TextView, var startNum: Int) : Thread() {
        // 1. Thread 클래스 상속
        // 2. Runnable 인터페이스 구현 (implements)
        override fun run() {
            // super.메서드 이름
            // 삭제해도 되는 경우(매개변수 없으면), 안되는 경우(매개변수 있으면)

            // 10~1 까지 세기
            for (i in startNum downTo 0) {
                // 1. 메시지 생성
                var msg: Message = Message()
                // 2. 데이터 세팅
                msg.arg1 = i
                msg.obj = tv
                // 3. 핸들러한테 전송
                cntHandler.sendMessage(msg)

                Thread.sleep(1000)
            }
            // Thread는 run 메서드가 끝나면 소멸
        }
    }
}