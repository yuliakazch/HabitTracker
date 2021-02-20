package com.yuliakazch.habittracker.features.habitadd.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.yuliakazch.habittracker.R
import com.yuliakazch.habittracker.features.habitadd.presentation.HabitAddViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_habit_add.view.*
import javax.inject.Inject

@AndroidEntryPoint
class HabitAddFragment : Fragment() {

    @Inject
    lateinit var viewModel: HabitAddViewModel

    private lateinit var fragmentLayout: View
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentLayout = inflater.inflate(R.layout.fragment_habit_add, container, false)
        navController = NavHostFragment.findNavController(this)
        setListeners()
        return fragmentLayout
    }

    private fun setListeners() {
        fragmentLayout.cancelButton.setOnClickListener {
            goToHabitList()
        }
        fragmentLayout.addHabitButton.setOnClickListener {
            viewModel.addHabit(
                fragmentLayout.nameEditText.text.toString(),
                fragmentLayout.countDaysEditText.text.toString()
            )
            goToHabitList()
        }
    }

    private fun goToHabitList() {
        navController.popBackStack()
    }
}