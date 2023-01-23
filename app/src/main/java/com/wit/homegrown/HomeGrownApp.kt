package com.wit.homegrown

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.Application
import timber.log.Timber

class HomeGrownApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        Timber.i("Starting HomeGrown Application")
    }
}