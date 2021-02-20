package com.yuliakazch.habittracker.features.habitadd.di

import com.yuliakazch.habittracker.features.habitadd.data.HabitAddRepositoryImpl
import com.yuliakazch.habittracker.features.habitadd.domain.HabitAddRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@InstallIn(FragmentComponent::class)
@Module
abstract class HabitAddModule {

    @Binds
    abstract fun bindHabitAddRepository(
        habitAddRepositoryImpl: HabitAddRepositoryImpl
    ): HabitAddRepository
}