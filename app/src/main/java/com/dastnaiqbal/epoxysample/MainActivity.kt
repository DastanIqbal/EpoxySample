package com.dastnaiqbal.epoxysample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dastnaiqbal.epoxysample.dataclass.SimpleDataController
import com.dastnaiqbal.epoxysample.viewholder.SimpleViewHolderController
import kotlinx.android.synthetic.main.activity_main.*

/**
 *
 * "Iqbal Ahmed" created on 22/08/2020
 */

class MainActivity : AppCompatActivity() {
    private val dataClassController by lazy {
        SimpleDataController()
    }

    private val viewHolderController by lazy {
        SimpleViewHolderController()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Listing using Data Clas
         */
//        rv.adapter = dataClassController.adapter
//        dataClassController.setData(ArrayList<String>().apply {
//            repeat(10) {
//                add("Item Data Class #$it")
//            }
//        })

        /**
         * Listing using ViewHolder
         */
        rv.adapter = viewHolderController.adapter
        viewHolderController.setData(ArrayList<String>().apply {
            repeat(10) {
                add("Item View Holder #$it")
            }
        })
    }
}