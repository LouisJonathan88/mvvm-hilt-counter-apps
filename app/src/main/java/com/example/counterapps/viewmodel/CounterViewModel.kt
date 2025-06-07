package com.example.counterapps.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.counterapps.repository.CounterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject

@HiltViewModel
class CounterViewModel @Inject constructor(
    private val counterRepository: CounterRepository) : ViewModel()
{
        private var _counter = MutableLiveData(0)
    val counter : LiveData<Int> get () = _counter

    fun increment() {
       val newValue = counterRepository.increment(_counter.value ?: 0)
        _counter.value = newValue
    }
    fun decrement() {
        val newValue = counterRepository.decrement(_counter.value ?: 0)
        _counter.value = newValue
    }
}