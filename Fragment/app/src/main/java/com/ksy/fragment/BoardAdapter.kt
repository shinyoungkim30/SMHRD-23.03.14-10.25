package com.ksy.fragment

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.ksy.fragment.VO.BoardVO

class BoardAdapter(var context: Context, var data: ArrayList<BoardVO>) :
    RecyclerView.Adapter<BoardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoardViewHolder {
        return BoardViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.board_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: BoardViewHolder, position: Int) {
        holder.tvTitle.text = data.get(position).title
        holder.tvWriter.text = data.get(position).writer
        holder.tvLikeCnt.text = data.get(position).likecnt.toString()
        holder.ivLikeClick.setOnClickListener {

        }
    }
}