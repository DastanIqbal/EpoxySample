package com.dastnaiqbal.epoxysample.dataclass

import com.airbnb.epoxy.TypedEpoxyController

/**
 *
 * "Iqbal Ahmed" created on 11/07/2020
 */

class SimpleDataController : TypedEpoxyController<List<String>>() {
    private val TAG = this::class.java.simpleName

    override fun buildModels(data: List<String>?) {
        data?.forEachIndexed { index, str ->
            ItemDataClass(str).id(index).addTo(this)
        }
    }
}