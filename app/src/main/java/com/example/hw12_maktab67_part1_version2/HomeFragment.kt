package com.example.hw12_maktab67_part1_version2


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.hw12_maktab67_part1_version2.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val vm: VM by activityViewModels()

    private lateinit var bind: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bind = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        bind.lifecycleOwner = this

        bind.vm = vm

        if (vm.isProfileSet.value == true) {
            bind.layoutOneMovieOne.setOnClickListener { vm.btnA() }
            bind.layoutOneMovieTwo.setOnClickListener { vm.btnB() }
            bind.layoutOneMovieThree.setOnClickListener { vm.btnC() }
            bind.layoutTwoMovieOne.setOnClickListener { vm.btnD() }
            bind.layoutTwoMovieTwo.setOnClickListener { vm.btnE() }
            bind.layoutTwoMovieThree.setOnClickListener { vm.btnF() }
            bind.layoutThreeMovieOne.setOnClickListener { vm.btnG() }
            bind.layoutThreeMovieTwo.setOnClickListener { vm.btnH() }
            bind.layoutThreeMovieThree.setOnClickListener { vm.btnI() }
            bind.layoutFourMovieOne.setOnClickListener { vm.btnJ() }
            bind.layoutFourMovieTwo.setOnClickListener { vm.btnK() }
            bind.layoutFourMovieThree.setOnClickListener { vm.btnL() }
            bind.layoutFiveMovieOne.setOnClickListener { vm.btnM() }
            bind.layoutFiveMovieTwo.setOnClickListener { vm.btnN() }
            bind.layoutFiveMovieThree.setOnClickListener { vm.btnO() }
            bind.layoutSixMovieOne.setOnClickListener { vm.btnP() }
            bind.layoutSixMovieTwo.setOnClickListener { vm.btnQ() }
            bind.layoutSixMovieThree.setOnClickListener { vm.btnR() }
            bind.layoutSevenMovieOne.setOnClickListener { vm.btnS() }
            bind.layoutSevenMovieTwo.setOnClickListener { vm.btnT() }
            bind.layoutSevenMovieThree.setOnClickListener { vm.btnU() }
        }
    }
}