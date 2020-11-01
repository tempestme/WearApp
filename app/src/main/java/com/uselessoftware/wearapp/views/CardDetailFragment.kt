package com.uselessoftware.wearapp.views

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.uselessoftware.wearapp.viewModels.CardDetailViewModel
import com.uselessoftware.wearapp.R


class CardDetailFragment : Fragment() {

    companion object {
        fun newInstance() = CardDetailFragment()
    }

    private lateinit var viewModel: CardDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.card_detail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CardDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
