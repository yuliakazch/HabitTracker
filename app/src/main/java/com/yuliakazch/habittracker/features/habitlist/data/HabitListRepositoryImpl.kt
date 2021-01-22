package com.yuliakazch.habittracker.features.habitlist.data

import com.yuliakazch.habittracker.features.habitlist.domain.HabitListRepository
import com.yuliakazch.habittracker.shared.entities.Habit
import com.yuliakazch.habittracker.shared.mapper.toListEntity
import com.yuliakazch.habittracker.shared.storage.HabitDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HabitListRepositoryImpl @Inject constructor(
    private val dao: HabitDao
) : HabitListRepository {

    override suspend fun getHabitList(): List<Habit> =
        withContext(Dispatchers.IO) {
            dao.getAllHabits().toListEntity()
        }
}