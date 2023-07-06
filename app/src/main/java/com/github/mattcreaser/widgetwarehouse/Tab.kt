package com.github.mattcreaser.widgetwarehouse

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

enum class Tab(val route: String, val icon: ImageVector, val title: String) {
    WidgetList("widget_list", Icons.Filled.List, "Widgets"),
    UserProfile("profile", Icons.Filled.Person, "Profile"),
    TimeSheet("cart", Icons.Filled.DateRange, "Time Sheet")
}
