package com.example.scca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Просто показываем что интерфейс загружен
        Toast.makeText(this, "Калькулятор сборки Stalcraft загружен", Toast.LENGTH_SHORT).show()
    }
}