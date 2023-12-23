package com.example.dailyflow.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Menu() {
    val items = listOf("Home", "Profile", "Settings")
    val selectedIndex = remember { mutableIntStateOf(0) }

    NavigationBar {
        items.forEachIndexed { index, title ->
            NavigationBarItem(
                icon = { Icon(Icons.Filled.Favorite, contentDescription = null) },
                label = { Text(title) },
                selected = selectedIndex.intValue == index,
                onClick = { selectedIndex.intValue = index },
                alwaysShowLabel = true, // Shows label even when not selected
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MenuPreview() {
    Menu()
}
