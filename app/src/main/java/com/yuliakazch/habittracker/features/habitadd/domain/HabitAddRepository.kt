package com.yuliakazch.habittracker.features.habitadd.domain

import com.yuliakazch.habittracker.shared.entities.Habit

interface HabitAddRepository {

    suspend fun addHabit(habit: Habit)
}