package com.ksy.fragment

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class BoardViewHolder(itemView: View) : ViewHolder(itemView) {

    lateinit var tvTitle: TextView
    lateinit var tvWriter: TextView
    lateinit var ivLikeClick: ImageView
    lateinit var tvLikeCnt: TextView

    init {
        tvTitle = itemView.findViewById(R.id.tvTitle)
        tvWriter = itemView.findViewById(R.id.tvWriter)
        ivLikeClick = itemView.findViewById(R.id.ivLikeClick)
        tvLikeCnt = itemView.findViewById(R.id.tvLikeCnt)
    }

}