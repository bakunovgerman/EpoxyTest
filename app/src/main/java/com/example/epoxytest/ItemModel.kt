package com.example.epoxytest

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.annotation.LayoutRes
import com.airbnb.epoxy.ModelView
import com.airbnb.epoxy.TextProp
import com.example.epoxytest.databinding.ItemCarBinding
import com.squareup.picasso.Picasso

@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
class ItemModel : LinearLayout {
    constructor(context: Context): super(context)
    constructor(context: Context, attrRes: AttributeSet): super(context, attrRes)

    private val itemCarBinding: ItemCarBinding

    init {
        inflateSelf(R.layout.item_car)
        itemCarBinding = ItemCarBinding.bind(this)
    }

    @TextProp
    fun setImage(url: CharSequence) {
        Picasso.get().load(url.toString()).into(itemCarBinding.imgCar)
    }

    @TextProp
    fun setName(nameCar: CharSequence) {
        itemCarBinding.tvCarName.text = nameCar
    }

}

fun ViewGroup.inflateSelf(@LayoutRes res: Int): View = View.inflate(context, res, this)