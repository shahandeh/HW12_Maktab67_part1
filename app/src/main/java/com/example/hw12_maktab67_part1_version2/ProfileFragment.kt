package com.example.hw12_maktab67_part1_version2

import android.graphics.Bitmap
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.hw12_maktab67_part1_version2.databinding.FragmentProfileBinding

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private lateinit var bind: FragmentProfileBinding

    private val vm: VM by activityViewModels()

    private lateinit var image: Bitmap

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bind = DataBindingUtil.inflate(inflater, R.layout.fragment_profile, container, false)
        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        bind.lifecycleOwner = this
        bind.vm = vm

        val image =
            registerForActivityResult(ActivityResultContracts.TakePicturePreview()) { Bitmap ->
                image = Bitmap
                bind.registerImage.setImageBitmap(Bitmap)
            }

        bind.registerImageBtn.setOnClickListener { image.launch(null) }

        bind.registerProfile.setOnClickListener { register() }

    }

    private fun register() {
        if (
            bind.registerImage.drawable != null &&
            bind.registerName.text.toString().isNotEmpty() &&
            bind.registerFamily.text.toString().isNotEmpty() &&
            bind.registerUsername.text.toString().isNotEmpty() &&
            bind.registerFamily.text.toString().isNotEmpty() &&
            bind.registerPhoneNumber.text.toString().isNotEmpty()
        ) {
            val profile = Profile(
                bind.registerName.text.toString(),
                bind.registerFamily.text.toString(),
                bind.registerUsername.text.toString(),
                bind.registerEmail.text.toString(),
                bind.registerPhoneNumber.text.toString(),
                image
            )
            vm.isProfileSet.value = true
            vm.user.value = profile
        }
    }
}