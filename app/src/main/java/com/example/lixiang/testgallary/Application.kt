package com.example.lixiang.testgallary

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco

/**
 * Created by lixiang on 2017/12/6.
 */

class Application : Application() {

    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(this)
    }
}
