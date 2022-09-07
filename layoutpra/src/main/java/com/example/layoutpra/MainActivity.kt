package com.example.layoutpra

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.layoutpra.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Btn.setOnClickListener {
            binding.Btn.visibility = View.INVISIBLE
            binding.img.visibility = View.VISIBLE
        }
        binding.img.setOnClickListener {
            binding.Btn.visibility = View.VISIBLE
            binding.img.visibility = View.INVISIBLE
        }
    }
}