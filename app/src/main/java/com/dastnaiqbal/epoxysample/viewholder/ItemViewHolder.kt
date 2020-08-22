package com.dastnaiqbal.epoxysample.viewholder

import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.dastnaiqbal.epoxysample.R
import com.dastnaiqbal.epoxysample.helper.KotlinEpoxyHolder

/**
 *
 * "Iqbal Ahmed" created on 22/08/2020
 */


@EpoxyModelClass(layout = R.layout.itemdataclass)
abstract class ItemViewHolder : EpoxyModelWithHolder<ItemVH>() {
    private val TAG = this::class.java.simpleName

    @EpoxyAttribute
    lateinit var title: String

    override fun bind(view: ItemVH) {
        super.bind(view)
        view.tv.text = title
    }
}

class ItemVH : KotlinEpoxyHolder() {
    val tv by bind<TextView>(R.id.tv)
}