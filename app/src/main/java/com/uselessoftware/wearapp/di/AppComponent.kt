package com.uselessoftware.wearapp.di

import com.uselessoftware.wearapp.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class
//    GithubApi::class,
//    WearappApi::class
])
interface AppComponent {
    fun inject(mainActivity: MainActivity)

}