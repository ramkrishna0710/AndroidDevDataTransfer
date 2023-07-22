package com.example.passdataday_13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.passdataday_13.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    companion object {
        const val KEY_O = "com.example.passdataday_13.MainActivity.KEY_O"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOrder.setOnClickListener {
            val orderPlaced =
                binding.et2.text.toString() + " " + binding.et3.text.toString() + " " + binding.et4.text.toString() + " " + binding.et5.text.toString()

            intent = Intent(this, showOrder::class.java)
            intent.putExtra(KEY_O, orderPlaced)
            startActivity(intent)
        }

    }
}