// hari tanggal pengerjaan : 28 Mei 2025
// nim                     : 10122362
// nama lengkap            : Louis Jonathan Susanto Putra
// kelas                   : PA 4


package com.example.counterapps.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.counterapps.R
import com.example.counterapps.databinding.ActivityMainBinding
import com.example.counterapps.viewmodel.CounterViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private val viewModel : CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.counter.observe(this) { count ->
            binding.txtViewCounter.text = count.toString()
        }

        binding.btnIncrement.setOnClickListener{
            viewModel.increment()
        }

        binding.btnDecrement.setOnClickListener{
            viewModel.decrement()
        }
    }
}