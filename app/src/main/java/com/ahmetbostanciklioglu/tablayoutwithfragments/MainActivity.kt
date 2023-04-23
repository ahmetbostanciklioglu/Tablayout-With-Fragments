package com.ahmetbostanciklioglu.tablayoutwithfragments

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var viewPager2: ViewPager2
    private lateinit var adapter: myViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.setBackgroundDrawable(ColorDrawable(getColor(R.color.purple)))

        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)

        viewPager2 = findViewById(R.id.view)

        adapter = myViewAdapter(supportFragmentManager, lifecycle)
        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Add Icon"
                }
                1 -> {
                    tab.text = "5G"
                }
                2 -> {
                    tab.text = "baseball"
                }
            }
        }.attach()
    }
}