package com.github.mattcreaser.widgetwarehouse.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.github.mattcreaser.widgetwarehouse.Widget
import com.github.mattcreaser.widgetwarehouse.widgets

@Composable
fun WidgetListScreen(
    navController: NavController
) {
    LazyColumn {
        items(widgets) { widget ->
            WidgetListItem(widget = widget, onItemClick = { widgetId ->
                navController.navigate("widget_detail/$widgetId")
            })
        }
    }
}

@Composable
fun WidgetListItem(widget: Widget, onItemClick: (Int) -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onItemClick(widget.id) }
    ) {
        Row {
            Image(
                modifier = Modifier.size(64.dp),
                painter = painterResource(widget.imageResId),
                contentDescription = null
            )

            Column(
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Text(
                    text = widget.name,
                    fontWeight = FontWeight.Bold
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Quantity in Stock"
                    )
                    Text(text = widget.quantity.toString())
                }
            }
        }
    }
}
