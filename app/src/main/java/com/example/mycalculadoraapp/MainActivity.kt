package com.example.mycalculadoraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.lifecycle.ViewModelProvider
import com.example.mycalculadoraapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var viewModel : MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        setupButtons()
    }

    private fun setupButtons() {
        binding.btnSuma.setOnClickListener {

        }

        binding.btnResta.setOnClickListener {

        }

        binding.btnMultiplicacion.setOnClickListener {

        }

        binding.btnDivision.setOnClickListener {

        }

        findViewById<ImageView>(R.id.restore).setOnClickListener {
            binding.num1.text=null
            binding.num2.text=null
        }

        findViewById<ImageView>(R.id.historyList).setOnClickListener {

        }
    }
}