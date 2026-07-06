package com.tamnd.suzume.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.People
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.tamnd.suzume.R

enum class TopLevelDestination(
    val route: String,
    @StringRes val labelRes: Int,
    val icon: ImageVector,
    val selectedIcon: ImageVector,
) {
    Home("home", R.string.tab_home, Icons.Outlined.Home, Icons.Filled.Home),
    Search("search", R.string.tab_search, Icons.Outlined.Search, Icons.Filled.Search),
    Subscriptions("subscriptions", R.string.tab_subscriptions, Icons.Outlined.People, Icons.Filled.People),
    Settings("settings", R.string.tab_settings, Icons.Outlined.Settings, Icons.Filled.Settings),
}
