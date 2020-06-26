package com.example.bendoel.samsunguserexperience.ratingtracker

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.bendoel.samsunguserexperience.database.RatingDatabaseDao
import java.lang.IllegalArgumentException

class RatingTrackerViewModelFactory (
    private val dataSource: RatingDatabaseDao,
    private val application: Application ) : ViewModelProvider.Factory {

    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(RatingTrackerViewModel::class.java)){
            return RatingTrackerViewModel(dataSource, application) as T;
        }
        throw IllegalArgumentException("Unknown view model class")
    }
}
