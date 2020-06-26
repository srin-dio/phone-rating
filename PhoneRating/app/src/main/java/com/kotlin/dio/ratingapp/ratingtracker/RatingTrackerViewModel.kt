package com.kotlin.dio.ratingapp.ratingtracker

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.kotlin.dio.ratingapp.database.RatingDatabaseDao


class RatingTrackerViewModel(val database: RatingDatabaseDao,
                             application: Application) : AndroidViewModel(application) {

}