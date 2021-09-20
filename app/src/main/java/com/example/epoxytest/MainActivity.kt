package com.example.epoxytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.epoxy.EpoxyRecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var epoxyRecyclerView: EpoxyRecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        epoxyRecyclerView = findViewById(R.id.EpoxyRecyclerView)

        val controller = MainController()
        controller.setData(getItemsList())
        epoxyRecyclerView.setController(controller)



    }
}