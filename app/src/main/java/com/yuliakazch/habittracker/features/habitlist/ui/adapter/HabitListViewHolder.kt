package com.yuliakazch.habittracker.features.habitlist.ui.adapter

import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.yuliakazch.habittracker.R

class HabitListViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val nameHabit: TextView = view.findViewById(R.id.nameTextView)
    val countDays: TextView = view.findViewById(R.id.countDaysTextView)
    val countSuccessDays: TextView = view.findViewById(R.id.countSuccessDaysTextView)
    val checkBox: CheckBox = view.findViewById(R.id.checkbox)
}