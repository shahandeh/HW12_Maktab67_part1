package com.example.hw12_maktab67_part1_version2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.hw12_maktab67_part1_version2.databinding.FragmentComingSoonBinding

class ComingSoonFragment : Fragment(R.layout.fragment_coming_soon) {

    lateinit var bind: FragmentComingSoonBinding

    val vm: VM by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bind = DataBindingUtil.inflate(inflater, R.layout.fragment_coming_soon, container, false)
        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        bind.vm = vm

        bind.shareMovieOne.setOnClickListener {
            startActivity(vm.shareMovieOne())
        }

        bind.shareMovieTwo.setOnClickListener {
            startActivity(vm.shareMovieTwo())
        }

        bind.shareMovieThree.setOnClickListener {
            startActivity(vm.shareMovieThree())
        }

    }


}