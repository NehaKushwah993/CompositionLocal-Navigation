package com.nk993.compositionlocalsample

import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.nk993.compositionlocalsample.LocalNavController
import com.nk993.compositionlocalsample.modules.home.HomeNavGraph
import com.nk993.compositionlocalsample.modules.profile.ProfileNavGraph

@Composable
fun MainScreen() {
    val bottomNavController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomNavigationBar(bottomNavController = bottomNavController)
        }
    ) { innerPadding ->
        NavHost(
            navController = bottomNavController,
            startDestination = "home",
            Modifier.padding(innerPadding)
        ) {
            composable("home") {
                val homeNavController = rememberNavController()
                CompositionLocalProvider(LocalNavController provides homeNavController) {
                    HomeNavGraph()
                }
            }
            composable("profile") {
                val profileNavController = rememberNavController()
                CompositionLocalProvider(LocalNavController provides profileNavController) {
                    ProfileNavGraph()
                }
            }
        }
    }
}

@Composable
fun BottomNavigationBar(bottomNavController: NavHostController) {
    BottomNavigation {
        BottomNavigationItem(
            icon = { Icon(Icons.Filled.Home, contentDescription = "Home") },
            label = { Text("Home") },
            selected = false,
            onClick = { bottomNavController.navigate("home") }
        )
        BottomNavigationItem(
            icon = { Icon(Icons.Filled.Person, contentDescription = "Profile") },
            label = { Text("Profile") },
            selected = false,
            onClick = { bottomNavController.navigate("profile") }
        )
    }
}

