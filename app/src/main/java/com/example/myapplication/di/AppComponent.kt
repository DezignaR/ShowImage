package com.example.myapplication.di

import com.example.myapplication.MainActivity
import com.example.myapplication.feature.GeneralFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])

interface AppComponent {
    fun inject(activity: MainActivity)
    fun inject(fragment: GeneralFragment)
}