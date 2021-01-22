package com.yuliakazch.habittracker.shared.storage.di

import android.content.Context
import androidx.room.Room
import com.yuliakazch.habittracker.shared.storage.HabitDao
import com.yuliakazch.habittracker.shared.storage.HabitDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object DatabaseModule {

    @Provides
    @Singleton
    fun provideHabitDatabase(@ApplicationContext appContext: Context): HabitDatabase =
        Room.databaseBuilder(
            appContext,
            HabitDatabase::class.java,
            "habit_database"
        ).build()

    @Provides
    fun provideHabitDao(database: HabitDatabase): HabitDao = database.habitDao()
}