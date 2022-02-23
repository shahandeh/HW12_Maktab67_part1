package com.example.hw12_maktab67_part1_version2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nhf = supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment
        val navController = nhf.navController

        findViewById<BottomNavigationView>(R.id.bnv).setupWithNavController(navController)

    }
}