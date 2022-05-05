package com.example.potteryworkshop.database

import androidx.room.*

@Dao
interface FormulaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(formula:FormulaEntity)

    @Insert
    fun insertAll(vararg formuls :List<FormulaEntity>)

    @Delete
    fun delet(formula:FormulaEntity)

    @Update
    fun update(formula:FormulaEntity)



}