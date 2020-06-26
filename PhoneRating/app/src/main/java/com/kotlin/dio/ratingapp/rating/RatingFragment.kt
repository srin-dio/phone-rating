package com.kotlin.dio.ratingapp.rating
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.kotlin.dio.ratingapp.R
import com.kotlin.dio.ratingapp.databinding.FragmentRatingBinding

class RatingFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val binding: FragmentRatingBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_rating, container, false
        )
        return binding.root
    }

}