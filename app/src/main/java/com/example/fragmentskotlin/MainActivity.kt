package com.example.fragmentskotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Создаем фрагмент
        val citiesFragment: CitiesFragment  = CitiesFragment()
        // Вызываем FragmentManager
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, citiesFragment)
            .commit();
    }
}