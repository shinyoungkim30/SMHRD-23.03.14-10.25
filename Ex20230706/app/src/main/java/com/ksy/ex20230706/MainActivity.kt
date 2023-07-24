package com.ksy.ex20230706

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // field에서는 변수 생성만
    lateinit var btn_click : Button
    lateinit var tv_result : TextView
    lateinit var btn_change : Button
    lateinit var edt_input : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // wrap_content : 컨텐츠 크기에 맞게
        // 0dp (match constraint) : 제약조건 크기에 딱 맞게
        // ??dp 절대값 : 설정한 크기 부분만 보여줌

        // Toggle Event 실습!

        // 1. findView를 하면 setContentView에서 찾는다
        // 2. 그래서 setContentView 하기 전에 find 하면 찾을 수 없다고 한다
        // 3. 그렇기 때문에 반드시 setContentView 아래에 findview를 적어야 한다.

        // 이미 생성된 변수에 find 한 값 저장
        btn_click = findViewById(R.id.btn_click)
        tv_result = findViewById(R.id.tv_result)
        btn_change = findViewById(R.id.btn_change)
        edt_input = findViewById(R.id.edt_input)

        var cnt : Int = 0
        var isEng : Boolean = true

        // xml에서 Hello라고 정확하게 적어놓지 않으면 click 안에 있는 if문 원하는 결과X
        // 그래서 검사하기 전에 미리 값을 확실하게 해놓는다
        tv_result.text = "Hello"

        btn_click.setOnClickListener {
            // 1) 버튼 눌렀을 때 textView에 뭐라고 적혀있는지 검사!
//            if (tv_result.text == "안녕") {
//                tv_result.text = "Hello"
//            } else {
//                tv_result.text = "안녕"
//            }
            // 2) 버튼 누를 때마다 cnt 값을 1증가, 홀/짝 구분
//            cnt++
//            if (cnt % 2 == 1) {
//                tv_result.text = "안녕"
//            } else {
//                tv_result.text = "Hello"
//            }
            // 3) true/false 구분
            // isEng가 false면 실행되게 바꿔보세요
            if (!isEng) { // not 연산자
                tv_result.text = "안녕"
            } else {
                tv_result.text = "Hello"
            }
            isEng = !isEng
        }

        // xml에서 event 처리하는 코드로 고치기!
//        btn_change.setOnClickListener {
//            tv_result.text = edt_input.text
//            edt_input.text.clear()
//        }

        // 방법
        // 1. 버튼을 클릭했을 때 실행될 메서드 정의 (.kt)
        // ** 매개변수를 반드시 View 타입으로 생성
        // 2. xml 파일을 열어서 버튼 선택 후 onClick 속성에 메서드 연결
    }

    // public void btnClick(View currentClick) {

    fun btnClick(currentClick : View) {
        tv_result.text = edt_input.text
        edt_input.text.clear()
    }

}