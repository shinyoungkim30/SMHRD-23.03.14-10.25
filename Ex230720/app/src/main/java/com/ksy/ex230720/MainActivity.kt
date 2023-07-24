package com.ksy.ex230720

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    // Custom RecyclerView : 데이터의 개수만큼 Template을 복사하여 RecyclerView 안에 배치
    // 1. Data
    // 2. Template
    // 3. Adapter
    //  - ViewHolder도 만들어야함

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var data = ArrayList<KakaoVO>()

        data.add(KakaoVO(R.drawable.img1, "이름1", "메시지1", "시간1"))
        data.add(KakaoVO(R.drawable.img2, "이름2", "메시지2", "시간2"))
        data.add(KakaoVO(R.drawable.img3, "이름3", "메시지3", "시간3"))
        data.add(KakaoVO(R.drawable.img4, "이름4", "메시지4", "시간4"))
        data.add(KakaoVO(R.drawable.img5, "이름5", "메시지5", "시간5"))
    }
}