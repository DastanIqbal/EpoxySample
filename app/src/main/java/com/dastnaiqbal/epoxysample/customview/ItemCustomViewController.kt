package com.dastnaiqbal.epoxysample.customview

import com.airbnb.epoxy.TypedEpoxyController

/**
 *
 * "Iqbal Ahmed" created on 05/09/2020
 */
class ItemCustomViewController : TypedEpoxyController<List<String>>() {
    private val TAG = this::class.java.simpleName

    override fun buildModels(data: List<String>?) {
        data?.forEachIndexed { index, s ->
            itemCustomView {
                id(index)
                text(s)
            }
        }
    }
}