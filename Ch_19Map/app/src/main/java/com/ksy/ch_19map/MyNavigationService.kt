package com.ksy.ch_19map

import android.annotation.SuppressLint
import android.app.Service
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationManager
import android.os.IBinder
import android.util.Log
import androidx.core.content.ContextCompat

@SuppressLint("ServiceCast")
class MyNavigationService : Service() {

    lateinit var manager: LocationManager

    override fun onCreate() {
        super.onCreate()
        manager = getSystemService(LOCATION_SERVICE) as LocationManager

        var result = "Enabled Providers : "
        val enabledProviders = manager.getProviders(true)
        for (provider in enabledProviders) {
            result += "$provider, "
        }
        Log.d("kkang", result)

        if (ContextCompat.checkSelfPermission(
                this, Manifest.permission.ACCESS_FINE_LOCATION
        ) === PackageManager.PERMISSION_GRANTED) {
            val location:Location? = manager.getLastKnownLocation(LocationManager.GPS_PROVIDER)
            location?.let {
                val latitude = location.latitude
                val longitude = location.longitude
                val accuracy = location.accuracy
                val time = location.time

                Log.d("kkang", "$latitude, $longitude, $accuracy, $time")
            }
        }
    }

    override fun onBind(intent: Intent): IBinder? {
        // 이 부분에 바인딩 로직을 구현해야합니다.
        return null
    }
}
