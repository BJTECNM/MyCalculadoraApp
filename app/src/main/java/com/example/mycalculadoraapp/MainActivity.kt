package com.example.mycalculadoraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.lifecycle.Observer
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

        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        viewModel.resultado.observe(this, Observer {
            binding.resultado.text = "Resultado "+ it.toString()
        })

        findViewById<ImageView>(R.id.restore).setOnClickListener {

            binding.num1.text=null
            binding.num2.text=null
            binding.resultado.text="Resultado"

            //viewModel.run { resetNums() }
        }

        findViewById<ImageView>(R.id.historyList).setOnClickListener {
            Toast.makeText(this, "Aún no implementado", Toast.LENGTH_SHORT).show()
        }

    }
}