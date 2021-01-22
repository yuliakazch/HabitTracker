package com.yuliakazch.habittracker.features.habitlist.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.components.FragmentComponent

@InstallIn(FragmentComponent::class)
@Module
object HabitListModule {

    @Provides
    fun provideHabitListRepository()
}