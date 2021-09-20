package com.example.epoxytest

import com.airbnb.epoxy.TypedEpoxyController

class MainController: TypedEpoxyController<List<ItemDto>>() {
    override fun buildModels(data: List<ItemDto>?) {
        data?.forEach {
            itemModel {
                id(it.hashCode())
                name(it.name)
                image(it.image)
            }
        }
    }
}