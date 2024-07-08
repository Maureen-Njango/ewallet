package com.example.ewallettwo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ewallettwo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.rvview.layoutManager = LinearLayoutManager(this)
        walletDisplay()

    }
    fun walletDisplay(){
        val wallet1 = wallet("salary","40,000")
        val wallet2 = wallet("salary","70,000")
        val wallet3 = wallet("salary","5,000")
        val wallet4 = wallet("salary","40,000")
        var cashwallet = listOf(wallet1,wallet2,wallet3,wallet4)




    }
}