package com.uselessoftware.wearapp.di

import com.uselessoftware.wearapp.utils.constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideGithubRetrofitInstance(): Retrofit? {
        return Retrofit.Builder()
            .baseUrl(constants.github_url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideWearappRetrofitInstance(): Retrofit? {
        return Retrofit.Builder()
            .baseUrl(constants.wearapp_url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}