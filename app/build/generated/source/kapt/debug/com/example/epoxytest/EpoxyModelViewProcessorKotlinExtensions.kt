@file:Suppress("DEPRECATION")

package com.example.epoxytest

import com.airbnb.epoxy.ModelCollector
import kotlin.Suppress
import kotlin.Unit

public inline fun ModelCollector.itemModel(modelInitializer: ItemModelModelBuilder.() -> Unit):
    Unit {
  add(
  ItemModelModel_().apply {
    modelInitializer()
  }
  )
}
