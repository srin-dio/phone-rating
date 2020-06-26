package com.kotlin.dio.ratingapp.rating

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.bendoel.samsunguserexperience.database.RatingDatabaseDao

class RatingViewModel (val database: RatingDatabaseDao, application: Application): AndroidViewModel(application) {

}