package com.yuliakazch.habittracker.features.habitlist.domain

import com.yuliakazch.habittracker.shared.entities.Habit

interface HabitListRepository {

    suspend fun getHabitList(): List<Habit>
}