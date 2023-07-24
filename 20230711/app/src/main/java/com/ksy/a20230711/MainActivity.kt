package com.ksy.a20230711

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Chronometer

class MainActivity : AppCompatActivity() {

    // 1. Button 25개 findViewById => 배열, for문
    // - 변수로 생성하면 노가다, 순서도 없어서 for문도 못돌림
    // 2. 1~25까지 저장된 배열 생성! 랜덤으로 섞기!
    // 3. Button에 숫자 띄우기
    // 4. ClickEvent 처리하기
    // - 사라지기
    // - 순서에 맞는지 확인하기
    //      버튼 누를때마다 카운트를 세고 카운트와 버튼의 숫자가 같다면 사라지게
    // - 25버튼 눌렀으면 멈춤

    // 배열 생성 예시) var temp = arrayOf(1, 2, 3)
    // Java) Button btns = new Button[25]
    var btns = arrayOfNulls<Button>(25)
    var nums = Array(25) { i -> i + 1 } // 람다식
    var cnt: Int = 1

    lateinit var time : Chronometer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 1. 규약이 하나도 없으면 화면의 맨 왼쪽 맨 위로 가버린다
        // 2. 좌/우(택1), 상/하(택1)라도 규약을 맺어줘야 함
        // 3. 좌/우(택1), 상/하(택1) 중 하나만 규약을 맺으면 => 여백, 실선으로 표현
        // 4. 좌/우(모두) 상/하(모두) 규약을 맺으면 => 비율로 위치, 용수철 모양으로 표현
        // 5. 규약은 화면과 맺을 수도 있고 다른 View랑 맺을 수도 있다!

//        setContentView(R.layout.activity_main)
//        setContentView(R.layout.login)
        setContentView(R.layout.gamelayout)

        time = findViewById(R.id.tv_time)
        time.start()

        // Kotlin for문 예시
        // for (x in 0..24) {}
        // for ((x, data) in btns.withIndex()) {}
        // x : 인덱스, data : 값

        nums.shuffle() // 배열 섞임

        for (index in 0 until 25) {
            // id명(String)으로 주소값(int) 알아내기
            var id: Int = resources.getIdentifier("btn" + (index + 1), "id", packageName)
            // 배열에 저장
            btns[index] = findViewById(id)

            btns[index]!!.text = nums[index].toString()

            // !! => null값이 아닐때만 메서드 호출
            btns[index]!!.setOnClickListener {
                if (cnt.toString() == btns[index]!!.text) {
                    btns[index]!!.visibility = View.INVISIBLE // view를 화면에서 안보이게 만드는 코드
                    cnt++

                    if (cnt == 26) {
                        time.stop()
                    }
                }
            }
        }
    }
}