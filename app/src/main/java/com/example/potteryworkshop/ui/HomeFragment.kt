package com.example.potteryworkshop.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.potteryworkshop.R
import com.example.potteryworkshop.adapter.FormulaAdapter
import com.example.potteryworkshop.database.FormulaRepository
import com.example.potteryworkshop.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    var binding: FragmentHomeBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding!!.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding!!.btnAdd.setOnClickListener(){
            findNavController().navigate(R.id.action_homeFragment_to_addFurmolFragment)
        }
        initList()
    }
    fun initList(){
        var adapter=FormulaAdapter(listOf())
        binding!!.recycleViewHomeFragment.adapter=adapter
        adapter.dataSet=FormulaRepository.formuls
        adapter.notifyDataSetChanged()
    }
}