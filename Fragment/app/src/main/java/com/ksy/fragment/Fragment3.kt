package com.ksy.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import com.ksy.fragment.VO.BoardVO
import org.json.JSONArray

class Fragment3 : Fragment() {

    lateinit var rc: RecyclerView
    lateinit var btnWriteAct: Button

    lateinit var reqQueue: RequestQueue

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_3, container, false)

        rc = view.findViewById(R.id.rcBoard)
        btnWriteAct = view.findViewById(R.id.btnWriteAct)

        reqQueue = Volley.newRequestQueue(requireActivity())

        btnWriteAct.setOnClickListener {
            var intent = Intent(requireActivity(), BoardWriteActivity::class.java)
            startActivity(intent)
        }

        var boardList = ArrayList<BoardVO>()

        val request = object : StringRequest(
            Request.Method.GET,
            "http://172.30.1.55:8888/board",
            { response ->
                Log.d("response", response.toString())

                var result = JSONArray(response)

                for (i in 0 until result.length()) {
                    val board = Gson().fromJson(result.get(i).toString(), BoardVO::class.java)
                    boardList.add(board)
                }
                var adapter = BoardAdapter(requireActivity(), boardList)

                rc.layoutManager = LinearLayoutManager(requireActivity())
                rc.adapter = adapter
            },
            { error ->
                Log.d("error", error.toString())
            }
        ) {}
        reqQueue.add(request)

        return view
    }
}