package com.ksy.ex20230707_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // R파일에 등록된 리소스는 int타입 (주소)

    lateinit var iv: ImageView
    var index: Int = 0
    var imgs = arrayOf(R.drawable.img1, R.drawable.img2, R.drawable.img3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. btnClick 메서드 만들기
        // 2. ImageView 찾기 ImageResource 변경
        // 3. 클릭이 일어난 버튼의 id 값에 따라 ImageView의 ImageResource를 바꿔주면 됨
        // 이미지뷰.setImageResource(R.drawable.파일명)

        iv = findViewById(R.id.imageView)
    }

    fun btnClick(currentView : View) {
        // 알고리즘과 UI 바꾸는 부분을 분리해서 코드 작성하면 편하다
        if (currentView.id == R.id.btn1) {
            index = 0
        } else if (currentView.id == R.id.btn2) {
            index = 1
        } else if (currentView.id == R.id.btn3) {
            index = 2
        } else if (currentView.id == R.id.btn_next) {
            // 알고리즘의 궁극적인 목적
            // : 특정 리소스에 국한되지 않는 코드
            if (index < imgs.size - 1) {
                index++
            } else {
                Toast.makeText(applicationContext, "마지막 사진입니다.", Toast.LENGTH_SHORT).show()
            }
        } else if (currentView.id == R.id.btn_pre) {
            if (index > 0) {
                index--
            } else {
                Toast.makeText(applicationContext, "첫번째 사진입니다.", Toast.LENGTH_SHORT).show()
            }
        }
        println("인덱스 값 : " + index)

        // UI 바꾸는 부분
        iv.setImageResource(imgs[index])
    }
}