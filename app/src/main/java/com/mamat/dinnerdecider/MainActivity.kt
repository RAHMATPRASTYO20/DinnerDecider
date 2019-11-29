package com.mamat.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Nasi Goreng", "Ayam Goreng", "Mie Goreng", "Telur Goreng")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_decide.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            tv_selected_food.text = foodList[randomFood]
        }

        btn_add_food.setOnClickListener {
            val newFood = et_add_food.text.toString()
            foodList.add(newFood)
            et_add_food.text.clear()
        }

    }
}
