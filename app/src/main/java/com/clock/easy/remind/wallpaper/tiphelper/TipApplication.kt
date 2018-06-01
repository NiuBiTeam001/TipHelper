package com.clock.easy.remind.wallpaper.tiphelper

import android.app.Application
import android.content.Context

/**
 * application
 */
class TipApplication : Application() {

    companion object {
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = this.applicationContext
    }

}