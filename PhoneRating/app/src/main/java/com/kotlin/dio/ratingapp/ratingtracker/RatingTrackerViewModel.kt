package com.example.bendoel.samsunguserexperience.ratingtracker

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.bendoel.samsunguserexperience.database.RatingDatabaseDao

class RatingTrackerViewModel(val database: RatingDatabaseDao,
                             application: Application) : AndroidViewModel(application) {

}