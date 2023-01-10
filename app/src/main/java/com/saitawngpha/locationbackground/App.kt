package com.saitawngpha.locationbackground

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 1/9/23
 */
class App: Application() {

    override fun onCreate() {
        super.onCreate()

        //set noti for sdk O
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val channel = NotificationChannel(
                "location",
                "Location",
                NotificationManager.IMPORTANCE_LOW
            )
            val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }
}