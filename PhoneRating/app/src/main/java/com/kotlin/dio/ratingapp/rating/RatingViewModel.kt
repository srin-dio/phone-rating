package com.kotlin.dio.ratingapp.rating

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.kotlin.dio.ratingapp.database.RatingDatabaseDao


class RatingViewModel (val database: RatingDatabaseDao, application: Application): AndroidViewModel(application) {

}