package com.yuliakazch.habittracker.features.habitadd.domain

import com.yuliakazch.habittracker.shared.entities.Habit
import javax.inject.Inject

class AddHabitUseCase @Inject constructor(private val repository: HabitAddRepository) {

    suspend operator fun invoke(habit: Habit) = repository.addHabit(habit)
}