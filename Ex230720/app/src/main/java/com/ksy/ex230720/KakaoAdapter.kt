package com.ksy.ex230720

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter

class KakaoAdapter(var context: Context, var template: Int, var data: ArrayList<KakaoVO>) :
    Adapter<KakaoViewHolder>() { // :표시 -> '상속', Adapter에서 상속받는다.
    // <> 안에는 ViewHolder계열만 들어갈 수 있다! (KakaoViewHolder)

    // 상위클래스인 Adapter 클래스가 추상클래스이기 때문이다.
    // 추상클래스를 상속받는 하위클래스는 반드시 추상메서드를 오버라이딩(재정의) 해야한다!
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KakaoViewHolder {
        // ViewHolder를 생성하는 곳 => RecyclerView 만들때 한번만 호출
        // 최초 1번만 실행되고, onBindViewHolder에서 이전에 쓰던 View를 꺼내서 사용

        // xml => kt(java)객체로 만드는 작업을 Inflater라고 부른다. 대표적으로 findViewById

        // ViewHolder를 생성할 때 Template.xml을 View타입으로 변환해서 전달
        var template_View: View = LayoutInflater.from(context).inflate(template, parent, false)

        var VH: KakaoViewHolder = KakaoViewHolder(template_View)

        return VH
    }

    override fun getItemCount(): Int {
        // 전체 아이템의 개수를 리턴하는 곳
        return data.size // 전체 메세지의 개수
    }

    // 제네릭 <> 기법 : 설계할 때 자료형을 결정하지 않고 개발자가 구현(사용)할 때 결정
    override fun onBindViewHolder(holder: KakaoViewHolder, position: Int) {
        // 이전에 쓰던 ViewHolder에서 View들 꺼내다가 ArrayList에 저장된 데이터들로 꾸미는 곳
        // getItemCount에 적힌 숫자만큼 호출

        // Ver1.
        var img:ImageView = holder.img
        var tv_msg:TextView = holder.tv_msg

        var KakaoMessage:KakaoVO = data.get(position)

        img.setImageResource(KakaoMessage.imgID!!)
        tv_msg.text = KakaoMessage.msg

        // Ver2.
        holder.tv_name.text = data.get(position).name
        holder.tv_time.text = data.get(position).time
    }

}