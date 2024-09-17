package com.nk993.compositionlocalsample.modules.home

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.nk993.compositionlocalsample.LocalNavController
import com.nk993.compositionlocalsample.modules.details.DetailsScreen


@Composable
fun HomeNavGraph() {
    val navController = LocalNavController.current
    NavHost(navController = navController!!, startDestination = "home") {
        composable("home") {
            HomeScreen()
        }
        composable("details") {
            DetailsScreen()
        }
    }
}


