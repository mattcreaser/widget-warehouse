package com.github.mattcreaser.widgetwarehouse

data class Widget(
    val id: Int,
    val name: String,
    val quantity: Int,
    val imageResId: Int
)

val widgets = listOf(
    Widget(
        id = 0,
        name = "MegaGizmo",
        quantity = 65,
        imageResId = R.drawable.widget1
    ),
    Widget(
        id = 1,
        name = "TurboTech",
        quantity = 643,
        imageResId = R.drawable.widget2
    ),
    Widget(
        id = 2,
        name = "Quantum Pulse",
        quantity = 137,
        imageResId = R.drawable.widget3
    ),
    Widget(
        id = 3,
        name = "GigaGadget XL",
        quantity = 220,
        imageResId = R.drawable.widget4
    ),
    Widget(
        id = 4,
        name = "Tech Tornado",
        quantity = 442,
        imageResId = R.drawable.widget1
    ),
    Widget(
        id = 5,
        name = "Electra Byte",
        quantity = 96,
        imageResId = R.drawable.widget2
    ),
    Widget(
        id = 6,
        name = "Mega Morph v3",
        quantity = 17,
        imageResId = R.drawable.widget3
    ),
    Widget(
        id = 7,
        name = "Zephyr Widget",
        quantity = 311,
        imageResId = R.drawable.widget4
    ),
    Widget(
        id = 8,
        name = "DynaPlex",
        quantity = 35,
        imageResId = R.drawable.widget1
    ),
    Widget(
        id = 9,
        name = "OmniTool",
        quantity = 290,
        imageResId = R.drawable.widget2
    ),
    Widget(
        id = 10,
        name = "Pulse Master Ultra",
        quantity = 103,
        imageResId = R.drawable.widget3
    ),
    Widget(
        id = 11,
        name = "Wonder Widget",
        quantity = 856,
        imageResId = R.drawable.widget4
    )
)
