package com.example.counterapps.repository

class CounterRepository {

    fun increment (current: Int) : Int {
        return current + 1
    }

    fun decrement (current: Int) : Int {
        return current - 1
    }
}