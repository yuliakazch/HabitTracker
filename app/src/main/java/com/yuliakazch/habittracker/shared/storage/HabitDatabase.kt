package com.yuliakazch.habittracker.shared.storage

import androidx.room.Database
import androidx.room.RoomDatabase
import com.yuliakazch.habittracker.shared.dto.HabitDto

@Database(entities = [HabitDto::class], version = 1, exportSchema = false)
abstract class HabitDatabase : RoomDatabase() {
    abstract fun habitDao(): HabitDao
}