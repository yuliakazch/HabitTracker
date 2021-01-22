package com.yuliakazch.habittracker.shared.entities

data class Habit(
    val id: Int = 0,
    val name: String,
    val countDays: Int,
    val countSuccessDays: Int = 0,
    val isDoToday: Boolean = false
)