package com.example.ex20230703

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class CaculatorActivity : AppCompatActivity() {
    // 클래스를 생성하면 onCreate라는 메서드가 생기는데 얘는 AppCompatActivity에서 상속받아 재정의한 메서드다
    override fun onCreate(savedInstanceState: Bundle?) {
        // 화면 구성 준비
        super.onCreate(savedInstanceState)
        // View를 세팅하기 이전에 findViewById를 하는건 불가능
        // NPE가 발생한다

        // xml과 코틀린파일을 연결
        setContentView(R.layout.activity_caculatoractivity)

        // btnPlus를 클릭했을 때, 이벤트가 일어나는지 확인
        // xml에 부여했던 id값을 class에서 바로 참조하는 건 불가능!
        // xml에 부여한 id --> R.id에 저장이 된다(16진수의 랜덤한 값
        // --> Class에서 findViewById()
        // ID값(16진수의 랜덤한 값)을 통해서 View를 찾아온다!
        // val btnPlus : Button = findViewById<Button>(R.id.btnPlus)

        // Button타입의 변수 btnPlus를 생성하고 R.id.btnPlus로 찾은 뷰를 저장해라
        val btnPlus : Button = findViewById(R.id.btnPlus)

        // : 변수의 자료형을 통해 추론이 가능하기 때문에
        //   <Button> 생략이 가능하다

        // TypeMismatchException : 내가 찾아오려는 View랑
        // 변수의 View 타입이 일치하지 않을 경우에 발생하는 예외사항

        // 1) Toast창을 Emulator에 띄워보자 (문구 : 클릭!)
        // 2) log를 통해 확인해보자


        btnPlus.setOnClickListener {
            // btnPlus를 클릭했을 때 실행시킬 코드
            Toast.makeText(this@CaculatorActivity,"클릭!!",Toast.LENGTH_SHORT).show()
            // 1) context : 화면정보(어디에 토스트를 보여지게 만들거니?)
            // this@CaculatorActivity
            // 2) text : CharSequence! --> String의 문구
            // Int 자료형을 띄울 수는 있음 단, View의 Id값만 가능!
            // 3) duration : 토스창의 지속시간(몇초동안 띄울거니?)
            // + show() : Toast창이 화면에 보임
        }

    }
}