package com.example.bitfit.data
import android.app.Application


class FoodApp: Application() {
    val db by lazy {FoodDatabase.getInstance(this)}
}