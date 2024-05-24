package com.ozman.composetutorial1.data.datasource.remote

import com.ozman.composetutorial1.data.datasource.remote.request.LoginRequest
import com.ozman.composetutorial1.data.datasource.remote.response.LoginResponse
import retrofit2.http.Body
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {

    @FormUrlEncoded
    @POST("/api/v1/login")
    suspend fun login(@Body loginModel: LoginRequest): LoginResponse
}