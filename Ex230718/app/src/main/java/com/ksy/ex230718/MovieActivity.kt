package com.ksy.ex230718

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

class MovieActivity : AppCompatActivity() {

    lateinit var listView: ListView
    lateinit var btn: Button

    lateinit var reqQueue: RequestQueue

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)

        // component 가져오기
        listView = findViewById(R.id.lvMovie)
        btn = findViewById(R.id.btnMovie)

        // RequestQueue 생성
        reqQueue = Volley.newRequestQueue(this@MovieActivity)

        val list = ArrayList<MovieVO>()

        // 버튼이 클릭되면 영화 API를 통해 20230717 영화 순위 데이터 요청 후 응답값(순위, 영화제목, 개봉날짜 -> MovieVO (data class)) 처리

        // 1. 전체 json 데이터 가져오기
        btn.setOnClickListener {
            val request = StringRequest(
                Request.Method.GET,
                "https://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=20230717",
                { response ->
                    Log.d("response", response)
                    val result = JSONObject(response).getJSONObject("boxOfficeResult")
                    Log.d("result", result.toString())
                    val movieList = result.getJSONArray("dailyBoxOfficeList")

                    for (i in 0 until movieList.length()) {
                        val movie = movieList.getJSONObject(i)

                        val rank = movie.getString("rank")
                        val movieNm = movie.getString("movieNm")
                        val openDt = movie.getString("openDt")

                        list.add(MovieVO(rank, movieNm, openDt))
                    }
                    val adapter = ArrayAdapter<MovieVO>(
                        applicationContext,
                        android.R.layout.simple_list_item_1,
                        list
                    )
                    listView.adapter = adapter

                },
                { error ->
                    Log.d("error", error.toString())
                    Toast.makeText(this, "error 발생", Toast.LENGTH_SHORT).show()
                }
            )
            // 여러번 요청할 경우 캐시 누적됨, 이전 결과가 있어도 새로 요청하여 응답을 보여주고 싶은 경우
            request.setShouldCache(false)
            reqQueue.add(request)
        }
    }
}