package com.example.potteryworkshop.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.potteryworkshop.R
import com.example.potteryworkshop.database.FormulaEntity

class FormulaAdapter(var dataSet: List<FormulaEntity>) :
    RecyclerView.Adapter<FormulaAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textViewGlazeIngredients: TextView
        val textViewCode: TextView
        val textViewValue: TextView
        val textViewDescription: TextView

        init {
            textViewGlazeIngredients = view.findViewById(R.id.textViewGlazeIngredients)
            textViewCode = view.findViewById(R.id.textViewcode)
            textViewValue = view.findViewById(R.id.textViewValue)
            textViewDescription = view.findViewById(R.id.textViewDescription)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.formula_row_item, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
            viewHolder.textViewGlazeIngredients.text = dataSet[position].GlazeIngredients
            viewHolder.textViewCode.text=dataSet[position].code
            viewHolder.textViewValue.text=dataSet[position].value
            viewHolder.textViewDescription.text=dataSet[position].description

    }

    override fun getItemCount() = dataSet.size

}