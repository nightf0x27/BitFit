package com.example.bitfit.data

import kotlinx.coroutines.flow.Flow

class FoodRepositoryImpl(
    private val dao: FoodDao
): FoodRepository {
    override suspend fun insertFood(food: Food) {
        dao.insertFood(food)
    }

    override suspend fun deleteFood(food: Food) {
        dao.deleteFood(food)
    }

    override suspend fun getFoodById(id: Int): Food? {
       return dao.getFoodById(id)
    }

    override fun getFood(): Flow<List<Food>> {
        return dao.getFood()
    }
}