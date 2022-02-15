package com.example.myapplication.di

import com.example.myapplication.MainAPI
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
interface AppModule {
    companion object {
        @Singleton
        @Provides
        fun provideRetrofit(): Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://dev-tasks.alef.im/task-m-001/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        @Singleton
        @Provides
        fun provideMainAPI(retrofit: Retrofit): MainAPI = retrofit.create(MainAPI::class.java)

    }





}