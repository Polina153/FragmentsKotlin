package com.example.fragmentskotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment


class CitiesFragment : Fragment() {
    // При создании фрагмента укажем его макет
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cities, container, false)
    }

    // Этот метод вызывается, когда макет экрана создан и готов к отображению информации. Создаем список городов
    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initList(view)
    }

    // создаём список городов на экране из массива в ресурсах
    private fun initList(view: View) {
        val layoutView = view as LinearLayout
        val cities = resources.getStringArray(R.array.cities)

        // В этом цикле создаём элемент TextView,
        // заполняем его значениями,
        // и добавляем на экран.
        for (city in cities) {
            val tv = TextView(context)
            tv.text = city
            tv.textSize = 30f
            layoutView.addView(tv)
        }
    }
}
