package com.example.hw12_maktab67_part1_version2

import android.graphics.Bitmap
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("profile_image")
fun ImageView.setProfileImage(bitmap: Bitmap?) {
    if (bitmap != null) setImageBitmap(bitmap)
}

@BindingAdapter("imageLoader")
fun ImageView.glide(url: String){
    Glide.with(this)
        .load(url)
        .placeholder(R.drawable.loading_animation)
        .into(this)
}