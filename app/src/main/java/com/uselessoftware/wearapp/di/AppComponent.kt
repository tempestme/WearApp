package com.uselessoftware.wearapp.di

import com.uselessoftware.wearapp.di.network.GithubApi
import com.uselessoftware.wearapp.di.network.WearappApi
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    GithubApi::class,
    WearappApi::class
])
interface AppComponent {

}