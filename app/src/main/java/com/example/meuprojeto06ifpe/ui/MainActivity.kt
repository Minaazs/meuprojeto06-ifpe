package com.example.meuprojeto06ifpe.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.meuprojeto06ifpe.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_nav)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            replaceFragment(ProductListFragment())
        }
        bottomNav.setOnItemSelectedListener { item ->
            val fragment: Fragment = when (item.itemId) {
                R.id.nav_home -> ProductListFragment()
                R.id.nav_products -> ProductListFragment()
                R.id.nav_users -> UserListFragment()

                else -> ProductListFragment()
            }
            replaceFragment(fragment)
            true
        }
    }
    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}
