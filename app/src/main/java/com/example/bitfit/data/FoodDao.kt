package com.example.bitfit.data
import androidx.room.Dao
import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface FoodDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFood (food: Food)

    @Delete
    suspend fun deleteFood(food: Food)

    @Query( "SELECT * FROM food WHERE id =:id")
    suspend fun getFoodById (id: Int): Food?
    @Query("SELECT * FROM food")
    fun getFood (): Flow<List<Food>>


}