package com.example.myapplication

object Common {
    private const val BASE_URL = "https://dev-tasks.alef.im/task-m-001/"
    val mainAPI:MainAPI
    get()=NetworkService.getClient(BASE_URL).create(MainAPI::class.java)

}