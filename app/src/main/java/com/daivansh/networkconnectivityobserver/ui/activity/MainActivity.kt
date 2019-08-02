package com.daivansh.networkconnectivityobserver.ui.activity

import android.arch.lifecycle.Observer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.daivansh.networkconnectivityobserver.R
import com.daivansh.networkconnectivityobserver.utils.NetworkConnectivityObserver

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NetworkConnectivityObserver.internetAvailable.observe(this, Observer {
            it?.let {
              Toast.makeText(this@MainActivity,"Connectivity = $it",Toast.LENGTH_LONG).show()
            }
        })
    }
}
