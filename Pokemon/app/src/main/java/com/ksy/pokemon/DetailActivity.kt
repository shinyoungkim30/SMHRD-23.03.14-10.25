package com.ksy.pokemon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.bumptech.glide.Glide
import org.json.JSONObject

class DetailActivity : AppCompatActivity() {

    lateinit var imgPokemon: ImageView
    lateinit var tvPokemonNm: TextView
    lateinit var tvType1: TextView
    lateinit var tvType2: TextView
    lateinit var tvWeight: TextView
    lateinit var tvHeight: TextView

    lateinit var reqQueue: RequestQueue

    var list = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // component 가져오기 -> 이미지, 텍스트
        imgPokemon = findViewById(R.id.imgPokemon)
        tvPokemonNm = findViewById(R.id.tvPokemonNm)
        tvType1 = findViewById(R.id.tvType1)
        tvType2 = findViewById(R.id.tvType2)
        tvWeight = findViewById(R.id.tvWeight)
        tvHeight = findViewById(R.id.tvHeight)

        reqQueue = Volley.newRequestQueue(this@DetailActivity)

        // intent -> 이름, 이미지 경로(Glide), id(상세정보 가져올 때 사용)
        val id = intent.getIntExtra("pokemonID", 0)
        val name = intent.getStringExtra("pokemonNm")
        val imgPath = intent.getStringExtra("pokemonImgPath")

        Log.d("img", imgPath.toString())
        Log.d("name", name.toString())

        // 포켓몬 이름
        tvPokemonNm.text = name

        // 포켓몬 이미지
        Glide.with(this@DetailActivity).load(imgPath).into(imgPokemon)

        // 타입
        // response -> JSONObject -> result
        // type = result.getJSONArray("types")
        // type.getJSONObject(index).getJSONObject("type").getString("name")
        // index -> 0,1 (1번째 없을수도 있음)

        // result.getDouble("Weight")
        // result.getDouble("height")
        var url = "https://pokeapi.co/api/v2/pokemon/$id"

        val request = object : StringRequest(
            Request.Method.GET,
            url,
            { response ->
                val result = JSONObject(response)
                Log.d("result", result.toString())
                val types = result.getJSONArray("types")

                var type1 = types.getJSONObject(0).getJSONObject("type").getString("name")
                var type2 = "none"
                if (types.length() > 1) {
                    type2 = types.getJSONObject(1).getJSONObject("type").getString("name")
                }

                tvType1.text = type1
                tvType2.text = type2

                val weight = result.getDouble("weight")
                val height = result.getDouble("height")

                tvWeight.text = weight.toString()
                tvHeight.text = height.toString()

                Log.d("weight", weight.toString())
            },
            { error ->
                Log.d("error", error.toString())
                Toast.makeText(this, "error 발생", Toast.LENGTH_SHORT).show()
            }
        ) {}
        reqQueue.add(request)
    }
}