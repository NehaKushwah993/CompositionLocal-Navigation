package com.nk993.compositionlocalsample.modules.profile

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.nk993.compositionlocalsample.LocalNavController
import com.nk993.compositionlocalsample.modules.details.DetailsScreen

@Composable
fun ProfileNavGraph() {
    val navController = LocalNavController.current
    NavHost(navController = navController!!, startDestination = "profile") {
        composable("profile") {
            ProfileScreen()
        }
        composable("details") {
            DetailsScreen()
        }
    }
}