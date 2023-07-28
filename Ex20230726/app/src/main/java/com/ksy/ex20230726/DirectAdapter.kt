package com.ksy.ex20230726

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter

class DirectAdapter(var context: Context, var template: Int, var data: ArrayList<VO>) :
    Adapter<DirectHolder>() {
    // ViewHolder 생성
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DirectHolder {
        return DirectHolder(
            LayoutInflater.from(context).inflate(template, parent, false)
        )
    }

    // 아이템 갯수 지정
    override fun getItemCount(): Int {
        return data.size
    }

    // 이전에 사용하던 View 가져다가 재사용
    override fun onBindViewHolder(holder: DirectHolder, position: Int) {
        holder.tv_title.text = data.get(position).title
        holder.tv_url.text = data[position].url

        holder.btn_go.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(data.get(position).url))
            // Activity가 아닌 곳에서 Intent를 실행시키고 싶다?
            // 새로운 task를 생성해야 함!
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            // MainActivity 화면 정보를 생성자의 context 변수로 전달받았음
            context.startActivity(intent!!)
        }
    }
}