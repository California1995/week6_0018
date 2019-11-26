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
        "Kawachi Fuji Garden",
        "Happo Pond",
        "Motonosumi-inari Shrine",
        "Nachi Falls",
        "Zao Ski Resort",
        "Kintetsu Beppu Ropeway",
        "Matsumoto Castle",
        "Shiratani Unsuikyo Gorge",
        "Hitachi Seaside Park",
        "Sagano Bamboo Forest",
        "Otaru Snow Light Path Festival",
        "Usa Shrine",
        "Mt.Daisen"
    )
    var foodMenuImage = arrayOf<Int>(
        R.drawable.t1,
        R.drawable.t2,
        R.drawable.t3,
        R.drawable.t4,
        R.drawable.t5,
        R.drawable.t6,
        R.drawable.t7,
        R.drawable.t8,
        R.drawable.t9,
        R.drawable.t10,
        R.drawable.t11,
        R.drawable.t12,
        R.drawable.t13
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
