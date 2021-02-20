package com.yuliakazch.habittracker.features.habitlist.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.yuliakazch.habittracker.R
import com.yuliakazch.habittracker.features.habitlist.presentation.HabitListViewModel
import com.yuliakazch.habittracker.features.habitlist.ui.adapter.HabitListAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_habit_list.view.*
import javax.inject.Inject

@AndroidEntryPoint
class HabitListFragment : Fragment() {

    @Inject
    lateinit var viewModel: HabitListViewModel

    private lateinit var fragmentLayout: View
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentLayout = inflater.inflate(R.layout.fragment_habit_list, container, false)
        navController = NavHostFragment.findNavController(this)
        setAdapter()
        setListeners()
        initHabitList()
        return fragmentLayout
    }

    private fun setAdapter() {
        val adapter = HabitListAdapter(viewModel)
        fragmentLayout.listHabits.adapter = adapter
        viewModel.listHabits.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }
    }

    private fun setListeners() {
        fragmentLayout.addButton.setOnClickListener {
            navController.navigate(R.id.action_habitListFragment_to_habitAddFragment)
        }
        fragmentLayout.swipeRefresh.setOnRefreshListener {
            viewModel.getListHabits()
            fragmentLayout.swipeRefresh.isRefreshing = false
        }
    }

    private fun initHabitList() {
        viewModel.getListHabits()
    }
}