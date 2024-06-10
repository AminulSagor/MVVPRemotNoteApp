package com.somadhan.remotenoteapp.api

import com.somadhan.remotenoteapp.models.userRequest
import com.somadhan.remotenoteapp.models.userResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface userAPI {

    @POST("/user/signup")
    suspend fun signup(@Body userRequest: userRequest) : Response<userResponse>

    @POST("/user/signin")
    suspend fun signin(@Body userRequest: userRequest) : Response<userResponse>
}