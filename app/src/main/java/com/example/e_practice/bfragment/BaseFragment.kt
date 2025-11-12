package com.example.e_practice.bfragment

import android.app.ProgressDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import androidx.loader.app.LoaderManager
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB: ViewBinding>(private val layoutinflate:(inflate: LayoutInflater)->VB): Fragment() {

     private var _binding:VB? = null

    val binding:VB get() = _binding as VB

    lateinit var loading: ProgressDialog

        override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = layoutinflate.invoke(inflater)

        oncreateuser()

        respons()

        loading = ProgressDialog(requireContext())

        return binding.root
    }

    abstract fun oncreateuser()

    abstract fun respons()




}