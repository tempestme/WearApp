package com.uselessoftware.wearapp.di.hilt

import com.uselessoftware.wearapp.di.network.SblApi
import com.uselessoftware.wearapp.di.network.SblInterface
import com.uselessoftware.wearapp.utils.constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {

    @Provides
    fun providesBaseUrl():String{
        return constants.wearapp_url
    }

    @Provides
    fun providesLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    @Provides
    fun providesOkHttpClient(logger:HttpLoggingInterceptor):OkHttpClient{
        val client = OkHttpClient.Builder()
        client.addInterceptor(logger)
        client.callTimeout(60,TimeUnit.SECONDS)
        client.connectTimeout(60,TimeUnit.SECONDS)
        client.writeTimeout(60,TimeUnit.SECONDS)
        client.readTimeout(60,TimeUnit.SECONDS)
        return client.build()
    }

    @Provides
    fun providesConverterFactory():GsonConverterFactory{
        return GsonConverterFactory.create()
    }

    @Provides
    fun providesRetrofit(baseurl:String,colverFactory: Converter.Factory,okHttpClient: OkHttpClient):Retrofit{
        return Retrofit.Builder()
            .baseUrl(baseurl)
            .client(okHttpClient)
            .addConverterFactory(colverFactory)
            .build()
    }

    @Provides
    fun providesApiService(retrofit: Retrofit):SblInterface{
        return retrofit.create(SblInterface::class.java)
    }
}