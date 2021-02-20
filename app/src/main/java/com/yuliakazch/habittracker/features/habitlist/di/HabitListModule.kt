package com.yuliakazch.habittracker.features.habitlist.di

import com.yuliakazch.habittracker.features.habitlist.data.HabitListRepositoryImpl
import com.yuliakazch.habittracker.features.habitlist.domain.HabitListRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@InstallIn(FragmentComponent::class)
@Module
abstract class HabitListModule {

    @Binds
    abstract fun bindHabitListRepository(
        habitListRepositoryImpl: HabitListRepositoryImpl
    ): HabitListRepository
}