package com.example.potteryworkshop.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.potteryworkshop.database.FormulaRepository

class FormulaViewModel(app: Application): AndroidViewModel(app) {
    init {
        FormulaRepository.initDB(app)
    }
}