package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.di.AppComponent
import com.example.myapplication.di.DaggerAppComponent

class MainActivity : AppCompatActivity() {

    private val appComponent: AppComponent by lazy { DaggerAppComponent.builder().build() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appComponent.inject(this)
        setContentView(R.layout.activity_main)
    }


}
