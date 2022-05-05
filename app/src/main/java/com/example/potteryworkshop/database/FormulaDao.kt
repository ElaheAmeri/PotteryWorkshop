package com.example.potteryworkshop.database

import androidx.room.*

@Dao
interface FormulaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(formula:FormulaEntity)

    @Delete
    fun delet(formula:FormulaEntity)

    @Update
    fun update(formula:FormulaEntity)

    @Query("SELECT * FROM furmolatable WHERE  IN(:ENGWord) ")
    fun getWord(ENGWord : String): Word


}