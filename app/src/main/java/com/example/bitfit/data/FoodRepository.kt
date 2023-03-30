package com.example.bitfit.data

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface FoodRepository {


    suspend fun insertFood (food: Food)


    suspend fun deleteFood(food: Food)


    suspend fun getFoodById (id: Int): Food?

    fun getFood (): Flow<List<Food>>
}