package com.example.hw12_maktab67_part1_version2

import androidx.lifecycle.MutableLiveData

data class Movie(
    val name: MutableLiveData<String>,
    val likeId: MutableLiveData<String>,
    var isLiked: MutableLiveData<Boolean>,
    val favoriteId: MutableLiveData<String>,
    val imageUrl: MutableLiveData<String>
)