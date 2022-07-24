package com.devgeek.sharedviewmodelbasicsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /** Retrieve NavController from the NavHostFragment
         *  `setupActionBarWithNavController`여기에 인자를 넣기 위해서
         *  `navHostFragment`를 생성하여서 `navController`에 할당하는 건가???
         *  다른 `Fragment`에서는 어떻게 `navController`를 불러서 사용할까??
         * */

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        /** Set up the action bar for use with the NavController */
        setupActionBarWithNavController(navController)
    }

    /**
     * Handle Navigation when the suer chooses Up from the action bar
     */
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}