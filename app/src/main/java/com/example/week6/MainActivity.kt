package com.example.week6

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var recycleView : RecyclerView? = null

    var foodMenuText = arrayOf(
        "Kale",
        "tomato",
        "morning glory",
        "chilli",
        "lemon",
        "eggplant",
        "Lettuce",
        "celery",
        "carrot",
        "pumpkin",
        "cucumber",
        "papaya",
        "Bergamot"
    )
    var foodMenuImage = arrayOf<Int>(
        R.drawable.v1,
        R.drawable.v2,
        R.drawable.v3,
        R.drawable.v4,
        R.drawable.v5,
        R.drawable.v6,
        R.drawable.v7,
        R.drawable.v8,
        R.drawable.v9,
        R.drawable.v10,
        R.drawable.v11,
        R.drawable.v12,
        R.drawable.v13
    )
    var context : Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleView = findViewById(R.id.menuRecycleview) as RecyclerView
        recycleView!!.layoutManager = LinearLayoutManager( context)
        recycleView!!.setLayoutManager(GridLayoutManager(context,2))
        var myAdapter = MyAdapterRecycleView(foodMenuText,foodMenuImage,context)
        recycleView!!.adapter = myAdapter
    }
}
