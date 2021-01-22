package com.yuliakazch.habittracker.shared.dto

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "habit_table")
class HabitDto(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val id: Int = 0,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "count") val countDays: Int,
    @ColumnInfo(name = "countSuccess") val countSuccessDays: Int = 0,
    @ColumnInfo(name = "isDoToday") val isDoToday: Boolean = false
)