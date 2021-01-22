package com.yuliakazch.habittracker.features.habitlist.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.yuliakazch.habittracker.R
import com.yuliakazch.habittracker.features.habitlist.presentation.HabitListViewModel
import com.yuliakazch.habittracker.shared.entities.Habit

class HabitListAdapter(private val viewModel: HabitListViewModel) :
    ListAdapter<Habit, HabitListViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitListViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_habit, parent, false)
        return HabitListViewHolder(view)
    }

    override fun onBindViewHolder(holder: HabitListViewHolder, position: Int) {
        val item = getItem(position)
        holder.apply {
            nameHabit.text = item.name
            countDays.text = item.countDays.toString()
            countSuccessDays.text = item.countSuccessDays.toString()
            /*checkBox.isChecked = item.isDoToday
            checkBox.setOnClickListener {
                viewModel.updateCountSuccessDays(item, checkBox.isChecked)
            }*/
        }
    }
}

class DiffCallback : DiffUtil.ItemCallback<Habit>() {

    override fun areItemsTheSame(oldItem: Habit, newItem: Habit) = oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Habit, newItem: Habit) = oldItem == newItem
}