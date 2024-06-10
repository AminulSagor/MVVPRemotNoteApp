package com.somadhan.remotenoteapp.di

import com.somadhan.remotenoteapp.api.userAPI
import com.somadhan.remotenoteapp.utils.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {

    @Singleton
    @Provides
    fun providesRetrofit(): Retrofit {
        return Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(BASE_URL)
            .build()
    }
    @Singleton
    @Provides
    fun providesUserAPI(retrofit: Retrofit): userAPI {
        return retrofit.create(userAPI::class.java)
    }
}