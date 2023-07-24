package com.ksy.ex230718

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley

class WeatherActivity : AppCompatActivity() {

    lateinit var listView: ListView
    lateinit var btn: Button

    lateinit var reqQueue: RequestQueue

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        // Component
        listView = findViewById(R.id.lvWeather)
        btn = findViewById(R.id.btnWeather)

        // RequestQueue 생성
        reqQueue = Volley.newRequestQueue(this)
    }
}