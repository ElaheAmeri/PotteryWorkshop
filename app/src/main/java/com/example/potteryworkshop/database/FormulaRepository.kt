package com.example.potteryworkshop.database

import android.content.Context

object FormulaRepository {
    lateinit var db: AppDataBase
    lateinit var dao: FormulaDao
   fun initDB(context: Context){
       db= AppDataBase.getAppDataBase(context)
       dao=db.formulaDao()
   }
    fun insert(formulaEntity: FormulaEntity){
        dao.insert(formulaEntity)
    }
    fun insertAll(formols:List<FormulaEntity>){
        dao.insertAll(formols)
    }
    fun delet(formula: FormulaEntity){
        dao.delet(formula)
    }
    fun update(formula: FormulaEntity){
        dao.update(formula)
    }
    fun addTestData(){
        var formuls= arrayListOf<FormulaEntity>(
            FormulaEntity("sorb","1","1.5",""),
            FormulaEntity("jive","2","3.0",""),
            FormulaEntity("felez","3","6","")
        )
        dao.insertAll(formuls)
    }
}