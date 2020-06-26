package com.kotlin.dio.ratingapp.ratingtracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.kotlin.dio.ratingapp.R
import com.kotlin.dio.ratingapp.databinding.FragmentRatingTrackerBinding


class RatingTrackerFragment : Fragment() {

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle? ): View? {

        val binding: FragmentRatingTrackerBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_rating_tracker, container, false)

        binding.btnAdd.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_ratingTrackerFragment_to_ratingFragment)
        }

        return binding.root
    }

}