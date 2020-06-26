package com.kotlin.dio.ratingapp.rating

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.bendoel.samsunguserexperience.database.RatingDatabaseDao
import java.lang.IllegalArgumentException

class RatingViewModelFactory(
    val dataSource: RatingDatabaseDao,
    val application: Application) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(RatingViewModel::class.java)){
            return RatingViewModel(dataSource, application) as T
        }
        throw IllegalArgumentException("Unknown view model class")
    }


}