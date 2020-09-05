package com.dastnaiqbal.epoxysample.customview

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import android.widget.TextView
import com.airbnb.epoxy.ModelView
import com.airbnb.epoxy.TextProp
import com.dastnaiqbal.epoxysample.R

/**
 *
 * "Iqbal Ahmed" created on 05/09/2020
 */

@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
class ItemCustomView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {
    private val TAG = this::class.java.simpleName

    val textView: TextView

    init {
        val view = inflate(context, R.layout.itemcustomview, this)
        textView = view.findViewById(R.id.tv)
    }

    @TextProp
    fun setText(charSequence: CharSequence) {
        textView.text = charSequence
    }
}