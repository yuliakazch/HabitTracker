package com.yuliakazch.habittracker.features.habitlist.domain

import com.yuliakazch.habittracker.shared.entities.Habit
import javax.inject.Inject

class GetHabitListUseCase @Inject constructor(private val repository: HabitListRepository) {

    suspend operator fun invoke(): List<Habit> = repository.getHabitList()
}