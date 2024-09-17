package com.nk993.compositionlocalsample

import androidx.compose.runtime.CompositionLocal
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.navigation.NavHostController

val LocalNavController: ProvidableCompositionLocal<NavHostController?> = staticCompositionLocalOf { null }
