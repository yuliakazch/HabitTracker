package com.yuliakazch.habittracker.shared.mapper

import com.yuliakazch.habittracker.shared.dto.HabitDto
import com.yuliakazch.habittracker.shared.entities.Habit

fun Habit.toDto() = HabitDto(id, name, countDays, countSuccessDays, isDoToday)

fun HabitDto.toEntity() = Habit(id, name, countDays, countSuccessDays, isDoToday)

fun List<Habit>.toListDto() = map { it.toDto() }

fun List<HabitDto>.toListEntity() = map { it.toEntity() }