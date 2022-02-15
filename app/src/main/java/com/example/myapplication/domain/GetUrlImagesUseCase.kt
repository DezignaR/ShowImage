package com.example.myapplication.domain

import com.example.myapplication.MainAPI
import com.example.myapplication.URLImage
import javax.inject.Inject

class GetUrlImagesUseCase @Inject constructor(private val mainAPI: MainAPI) {
    suspend operator fun invoke():List<URLImage> = mainAPI.getURL()
}