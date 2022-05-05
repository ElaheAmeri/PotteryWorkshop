package com.example.potteryworkshop.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "FurmolaTable")
data class FormulaEntity(
                        @PrimaryKey(autoGenerate = true)
                        @ColumnInfo(name="GlazeIngredients")
                        val GlazeIngredients :String="",
                        @ColumnInfo(name="code")
                        val code :Int,
                        @ColumnInfo(name="value")
                        val value :Float,
                        @ColumnInfo(name="description")
                        val description :String="") {
}