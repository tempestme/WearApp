package com.uselessoftware.wearapp.views

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.uselessoftware.wearapp.viewModels.OnBoardingViewModel
import com.uselessoftware.wearapp.R


class onBoardingFragment : Fragment() {

    companion object {
        fun newInstance() = onBoardingFragment()
    }

    private lateinit var viewModel: OnBoardingViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.on_boarding_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(OnBoardingViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
