package com.example.passdataday_13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.passdataday_13.databinding.ActivityShowOrderBinding

class showOrder : AppCompatActivity() {
    lateinit var binding: ActivityShowOrderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ordersOfCustomer = intent.getStringExtra(MainActivity.KEY_O)
        binding.tVorderd.text = "Order Placed " + ordersOfCustomer.toString()
    }
}