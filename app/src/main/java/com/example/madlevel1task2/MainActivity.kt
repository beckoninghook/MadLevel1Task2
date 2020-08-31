package com.example.madlevel1task2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.madlevel1task2.databinding.MainActivityBinding


class MainActivity : AppCompatActivity()  {
    private lateinit var binding: MainActivityBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
    }
}