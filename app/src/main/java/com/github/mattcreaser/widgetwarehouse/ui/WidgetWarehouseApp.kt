package com.github.mattcreaser.widgetwarehouse.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.amplifyframework.ui.authenticator.SignedInState
import com.github.mattcreaser.widgetwarehouse.Tab
import kotlinx.coroutines.launch

@Composable
fun WidgetWarehouseApp(signedInState: SignedInState) {
    var currentTab by remember { mutableStateOf(Tab.WidgetList) }
    val navController = rememberNavController()

    val scope = rememberCoroutineScope()

    Scaffold(
        bottomBar = {
            NavigationBar {
                Tab.values().forEach { screen ->
                    NavigationBarItem(
                        selected = currentTab == screen,
                        onClick = {
                            currentTab = screen
                            navController.navigate(screen.route)
                        },
                        icon = {
                            Icon(
                                imageVector = screen.icon,
                                contentDescription = screen.title
                            )
                        },
                        label = { Text(screen.title) }
                    )
                }
            }
        }
    ) { innerPadding ->
        NavHost(
            modifier = Modifier.padding(innerPadding),
            navController = navController,
            startDestination = currentTab.route
        ) {
            composable(Tab.UserProfile.route) {
                UserProfileScreen(
                    onSignOut = {
                        scope.launch { signedInState.signOut() }
                    }
                )
            }
            composable(Tab.WidgetList.route) {
                WidgetListScreen(navController = navController)
            }
            composable(Tab.TimeSheet.route) {
                TimesheetScreen()
            }
            composable(
                route = "widget_detail/{widgetId}",
                arguments = listOf(navArgument("widgetId") { type = NavType.IntType })
            ) { backStackEntry ->
                val widgetId = backStackEntry.arguments?.getInt("widgetId")
                widgetId?.let { WidgetDetailScreen(it) }
            }
        }
    }
}
