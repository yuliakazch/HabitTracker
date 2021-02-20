package com.yuliakazch.habittracker.features.habitadd.data

import com.yuliakazch.habittracker.features.habitadd.domain.HabitAddRepository
import com.yuliakazch.habittracker.shared.entities.Habit
import com.yuliakazch.habittracker.shared.mapper.toDto
import com.yuliakazch.habittracker.shared.storage.HabitDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HabitAddRepositoryImpl @Inject constructor(
    private val dao: HabitDao
) : HabitAddRepository {

    override suspend fun addHabit(habit: Habit) {
        withContext(Dispatchers.IO) {
            dao.insertHabit(habit.toDto())
        }
    }
}