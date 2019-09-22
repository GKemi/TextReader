package com.example.gilhakemi.textreader.core

import android.app.Application
import android.content.res.Configuration
import com.example.gilhakemi.textreader.MainPresenter
import com.example.gilhakemi.textreader.TextAdapter
import com.example.gilhakemi.textreader.TextPort

/**
 * Created by work on 22/09/2019.
 */
class MainApplication : Application() { //make an interface for this to conform to, which is what the presenter will communicate with

    companion object {
        lateinit var coreCoordinator: CoreCoordinator
        fun getCore(): CoreCoordinator {
            return coreCoordinator
        }
    }

    override fun onCreate() {
        super.onCreate()
        coreCoordinator = CoreCoordinator(applicationContext)
    }
}