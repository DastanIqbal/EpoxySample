package com.dastnaiqbal.epoxysample.viewholder

import com.airbnb.epoxy.TypedEpoxyController

/**
 *
 * "Iqbal Ahmed" created on 22/08/2020
 */

class SimpleViewHolderController : TypedEpoxyController<List<String>>() {

    override fun buildModels(data: List<String>?) {
        data?.forEachIndexed { index, s ->
            itemViewHolder {
                id(index)
                title(s)
            }
        }
    }
}