package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sumButton.setOnClickListener {
            val number1: Int = binding.number1EditText.text.toString().toInt()
            val number2: Int = binding.number2EditText.text.toString().toInt()

            val sum = number1 + number2

            binding.sumTextView.text = sum.toString()
        }
    }
}