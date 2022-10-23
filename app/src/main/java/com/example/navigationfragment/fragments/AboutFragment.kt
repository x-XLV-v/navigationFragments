package com.example.navigationfragment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.BuildConfig
import com.example.navigationfragment.R
import com.example.navigationfragment.contract.HasCustomTitle
import com.example.navigationfragment.contract.navigator
import com.example.navigationfragment.databinding.FragmentAboutBinding

class AboutFragment: Fragment(), HasCustomTitle {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = FragmentAboutBinding.inflate(inflater, container, false).apply {
        versionNameTextView.text
        versionCodeTextView.text
        okButton.setOnClickListener { onOkPressed() }
    }.root

    override fun getTitleRes(): Int = R.string.about

    private fun onOkPressed() {
        navigator().goBack()
    }
}