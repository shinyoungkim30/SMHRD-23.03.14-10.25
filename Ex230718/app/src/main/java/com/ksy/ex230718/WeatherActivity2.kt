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

class WeatherActivity2 : AppCompatActivity() {

    lateinit var listView: ListView
    lateinit var btn: Button

    lateinit var reqQueue: RequestQueue

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather2)

        // Component
        listView = findViewById(R.id.lvWeather)
        btn = findViewById(R.id.btnWeather)

        // RequestQueue 생성
        reqQueue = Volley.newRequestQueue(this@WeatherActivity2)

        // 날씨 데이터 가지고 오고 싶은 도시 정의(배열)
        val cityList = arrayOf("Gwangju", "Seoul", "Jeju-do", "London", "New York")

        val weatherList = ArrayList<WeatherVO>()

        // 버튼이 클릭되면 OpenWeatherAPI를 통해 현재 날씨 데이터 요청 (도시이름 배열에 저장) 응답 값 처리
        btn.setOnClickListener {
            for (i in 0 until cityList.size) {
                val request = StringRequest(
                    Request.Method.GET,
                    "https://api.openweathermap.org/data/2.5/weather?q=${cityList.get(i)}&appid=32a17a085208f424f95c600bb4e930d5",
                    { response ->
                        Log.d("response", response.toString())
                        val result = JSONObject(response)
                        val weather = result.getJSONArray("weather").get(0) as JSONObject
                        val state = weather.getString("main")
                        val main = result.getJSONObject("main")
                        val temp = main.getInt("temp")

                        // 데이터
                        weatherList.add(WeatherVO(cityList.get(i), state, temp - 273))

                        // view에 data(가지고온 날씨 데이터) 적용
                        val adapter = ArrayAdapter<WeatherVO>(applicationContext, android.R.layout.simple_list_item_1, weatherList)
                        listView.adapter = adapter
                    },
                    { error ->
                        Log.d("error", error.toString())
                        Toast.makeText(this, "error 발생", Toast.LENGTH_SHORT).show()
                    }
                )
                reqQueue.add(request)
            }
        }
    }
}