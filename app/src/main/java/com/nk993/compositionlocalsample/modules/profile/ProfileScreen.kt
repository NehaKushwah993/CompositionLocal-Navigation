package com.nk993.compositionlocalsample.modules.profile

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
import com.nk993.compositionlocalsample.ui.theme.DetailColor
import com.nk993.compositionlocalsample.ui.theme.ProfileColor

@Composable
fun ProfileScreen() {
    val navController = LocalNavController.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Profile Screen")
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { navController?.navigate("details") },
            colors = ButtonDefaults.buttonColors(containerColor = ProfileColor)
        ) {
            Text(text = "Go to Details")
        }
    }
}