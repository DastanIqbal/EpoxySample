package com.dastnaiqbal.epoxysample.dataclass

import android.widget.TextView
import com.dastanapps.dastanlib.utils.ViewUtils
import com.dastnaiqbal.epoxysample.R
import com.dastnaiqbal.epoxysample.helper.KotlinModel

/**
 *
 * "Iqbal Ahmed" created on 11/07/2020
 */

class ItemDataClass(val text: String) : KotlinModel(R.layout.itemdataclass) {

    val tv by bind<TextView>(R.id.tv)

    override fun bind() {
        tv.text = text
        tv.setOnClickListener {
            ViewUtils.showToast(it.context, text)
        }
    }

}