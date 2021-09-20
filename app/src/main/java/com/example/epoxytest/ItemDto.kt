package com.example.epoxytest

data class ItemDto(
    val image: String,
    val name: String
)
fun getItemsList() = listOf(
    ItemDto(
        "https://www.aracvizyon.com/img/2013/01/ferrari-berlinetta-f12berlinetta-16.jpg",
        "Ferrari"
    ),
    ItemDto(
        "https://img3.goodfon.ru/original/1024x768/5/ad/ford-mustang-ford-mustang-1594.jpg",
        "Mustang"
    ),
    ItemDto(
        "https://cdn.bimmertoday.de/wp-content/uploads/2017/04/2017-BMW-4er-Facelift-2017-440i-F32-LCI-Snapper-Rocks-Blue-27-1024x683.jpg",
        "BMW"
    ),
    ItemDto(
        "https://automobile-zip.ru/wp-content/uploads/e/2/e/e2ed3e3fee5646181fa0c3e08b2b70ad.jpg",
        "Mercedes"
    )
)