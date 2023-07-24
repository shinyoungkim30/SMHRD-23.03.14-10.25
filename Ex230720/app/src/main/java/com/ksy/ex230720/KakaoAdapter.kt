package com.ksy.ex230720

import android.content.Context
import androidx.recyclerview.widget.RecyclerView.Adapter

class KakaoAdapter(var context: Context, var template: Int, var data: ArrayList<KakaoVO>) :
    Adapter<KakaoViewHolder>() {

        // 상위클래스인 Adapter 클래스가 추상클래스이기 때문이다.
        // 추상클래스를 상속받는 하위클래스는 반드시 추상메서드를 오버라이딩(재정의) 해야한다!
        // 추상메서드 :

}