package com.example.potteryworkshop.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [FormulaEntity::class],version = 1)
abstract class AppDataBase:RoomDatabase() {
    abstract fun formulaDao():FormulaDao

    companion object{
        var INCTANCE:AppDataBase?=null
        fun getAppDataBase(context: Context):AppDataBase{
            val _Inctance= INCTANCE
            if (_Inctance!=null)
                return _Inctance
            synchronized(AppDataBase::class){
                val inctance=Room.databaseBuilder(
                    context.applicationContext,
                    AppDataBase::class.java,
                    "myDB"
                ).allowMainThreadQueries()
                    .build()
                INCTANCE=inctance
                return inctance
            }
        }
    }
}