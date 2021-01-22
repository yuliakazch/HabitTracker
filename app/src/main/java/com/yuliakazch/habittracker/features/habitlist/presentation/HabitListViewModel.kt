package com.yuliakazch.habittracker.features.habitlist.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yuliakazch.habittracker.features.habitlist.domain.GetHabitListUseCase
import com.yuliakazch.habittracker.shared.entities.Habit
import kotlinx.coroutines.launch
import javax.inject.Inject

class HabitListViewModel @Inject constructor(
    private val getHabitListUseCase: GetHabitListUseCase
) : ViewModel() {

    private val _listHabits = MutableLiveData<List<Habit>>()
    val listHabits: LiveData<List<Habit>>
        get() = _listHabits

    init {
        getListHabits()
    }

    fun getListHabits() {
        viewModelScope.launch {
            _listHabits.value = getHabitListUseCase()
        }
    }
}