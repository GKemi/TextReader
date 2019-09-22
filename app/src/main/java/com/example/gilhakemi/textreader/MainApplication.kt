package com.example.gilhakemi.textreader

import android.app.Application
import com.example.gilhakemi.textreader.core.CoreInteractor
import com.example.gilhakemi.textreader.core.Interactor

/**
 * Created by work on 22/09/2019.
 */
class MainApplication : Application() { //make an interface for this to conform to, which is what the presenter will communicate with

    companion object {
        lateinit var coreInteractor: CoreInteractor
        fun getInteractor(): CoreInteractor {
            return coreInteractor
        }
    }

    override fun onCreate() {
        super.onCreate()
        coreInteractor = CoreInteractor(applicationContext)
    }
}