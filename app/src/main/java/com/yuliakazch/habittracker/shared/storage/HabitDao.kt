package com.yuliakazch.habittracker.shared.storage

import androidx.room.*
import com.yuliakazch.habittracker.shared.dto.HabitDto

@Dao
interface HabitDao {

    @Query("select * from habit_table")
    suspend fun getAllHabits(): List<HabitDto>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertHabit(habit: HabitDto)

    @Update
    suspend fun updateCountSuccessDays(habit: HabitDto)
}