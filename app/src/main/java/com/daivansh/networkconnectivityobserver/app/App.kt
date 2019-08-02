package com.daivansh.networkconnectivityobserver.app

import android.app.Application
import com.daivansh.networkconnectivityobserver.utils.NetworkConnectivityObserver

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        NetworkConnectivityObserver.init(this)
    }
}