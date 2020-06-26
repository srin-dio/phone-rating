package com.example.bendoel.samsunguserexperience.ratingtracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.kotlin.dio.ratingapp.R
import com.kotlin.dio.ratingapp.databinding.FragmentRatingTrackerBinding


class RatingTrackerFragment : Fragment() {

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle? ): View? {

        val binding: FragmentRatingTrackerBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_rating_tracker, container, false)

        return binding.root
    }

}