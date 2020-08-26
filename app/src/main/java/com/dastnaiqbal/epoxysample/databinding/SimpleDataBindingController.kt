package com.dastnaiqbal.epoxysample.databinding

import com.airbnb.epoxy.TypedEpoxyController
import com.dastnaiqbal.epoxysample.databinding

/**
 *
 * "Iqbal Ahmed" created on 11/07/2020
 */

class SimpleDataBindingController : TypedEpoxyController<List<String>>() {
    private val TAG = this::class.java.simpleName

    override fun buildModels(data: List<String>?) {
        data?.forEachIndexed { index, str ->
            databinding {
                id(index)
                title(str)
            }
        }
    }
}