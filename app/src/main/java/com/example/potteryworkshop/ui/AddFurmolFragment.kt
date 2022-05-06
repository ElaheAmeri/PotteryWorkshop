package com.example.potteryworkshop.ui

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import com.example.potteryworkshop.R
import com.example.potteryworkshop.databinding.FragmentHomeBinding


class AddFurmolFragment : Fragment() {

    var binding: FragmentHomeBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding!!.root
        return view

    }

     override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    fun setDialog(view: ViewGroup){
        val view = LayoutInflater.from(view.context)
            .inflate(R.layout.dialog, view, false)
        var textViewGlazeIngredients = view.findViewById<TextureView>(R.id.textViewGlazeIngredients)
        var textViewCode = view.findViewById<TextureView>(R.id.textViewcode)
        var textViewValue = view.findViewById<TextureView>(R.id.textViewValue)
        var textViewDescription = view.findViewById<TextureView>(R.id.textViewDescription)
        var alert =AlertDialog.Builder(view.context).setView(view)
            .setCancelable(false)
            .create()
            alert.show()
    }
}
