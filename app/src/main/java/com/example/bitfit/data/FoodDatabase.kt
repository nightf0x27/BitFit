package com.example.bitfit.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(

entities = [Food::class],
version =1
)
abstract class FoodDatabase: RoomDatabase() {

    abstract fun foodDao(): FoodDao

    companion object {

        @Volatile
        private var INSTANCE: FoodDatabase? = null

        fun getInstance(context: Context): FoodDatabase=
            INSTANCE ?: synchronized(this){
                INSTANCE ?: buildDatabase(context).also { INSTANCE = it}
            }
        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,FoodDatabase::class.java,"Food-db"
            ).build()

    }
}