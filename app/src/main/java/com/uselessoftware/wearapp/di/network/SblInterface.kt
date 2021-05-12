package com.uselessoftware.wearapp.di.network

import retrofit2.http.GET

interface SblInterface {
    @GET
    fun getTestData()
}