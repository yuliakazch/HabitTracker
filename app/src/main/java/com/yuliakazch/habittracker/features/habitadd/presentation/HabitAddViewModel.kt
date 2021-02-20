package com.yuliakazch.habittracker.features.habitadd.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yuliakazch.habittracker.features.habitadd.domain.AddHabitUseCase
import com.yuliakazch.habittracker.shared.entities.Habit
import kotlinx.coroutines.launch
import javax.inject.Inject

class HabitAddViewModel @Inject constructor(
    private val addHabitUseCase: AddHabitUseCase
) : ViewModel() {

    fun addHabit(nameHabit: String, countDays: String) {
        viewModelScope.launch {
            val habit = createHabit(nameHabit, countDays)
            addHabitUseCase(habit)
        }
    }

    private fun createHabit(nameHabit: String, countDays: String): Habit = Habit(
        name = nameHabit,
        countDays = countDays.toInt()
    )
}