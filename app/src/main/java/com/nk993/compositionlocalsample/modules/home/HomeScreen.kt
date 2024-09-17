package com.nk993.compositionlocalsample.modules.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nk993.compositionlocalsample.LocalNavController
import com.nk993.compositionlocalsample.ui.theme.HomeColor

@Composable
fun HomeScreen() {
    val navController = LocalNavController.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Home Screen")
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { navController?.navigate("details") },
            colors = ButtonDefaults.buttonColors(containerColor = HomeColor)
        ) {
            Text(text = "Go to Details")
        }
    }
}