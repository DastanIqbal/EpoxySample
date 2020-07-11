package com.dastnaiqbal.epoxysample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val controller by lazy {
        SimpleDataController()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv.adapter = controller.adapter

        controller.setData(ArrayList<String>().apply {
            repeat(10) {
                add("Item #$it")
            }
        })
    }
}