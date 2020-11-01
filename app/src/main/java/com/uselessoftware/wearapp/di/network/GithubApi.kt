package com.uselessoftware.wearapp.di.network

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
public class GithubApi {
//
//    @Singleton
//    @Provides
//    fun provideRetrofit(): Retrofit{
//        val retrofit = Retrofit.Builder()
//            .addConverterFactory(
//                GsonConverterFactory.create())
//            .baseUrl("https://en.wikipedia.org/w/")
//            .build()
//        return retrofit
//    }
}