package com.example.realtime_obstacle_detection.ui.screens.homepage

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.realtime_obstacle_detection.ui.theme.primary

import androidx.navigation.compose.rememberNavController
import com.example.realtime_obstacle_detection.ui.model.actionBar.HomePageActionBar
import com.example.realtime_obstacle_detection.ui.model.navigation.HomePageNavGraph


@ExperimentalMaterialApi
@Composable
fun HomePageSetUp() {

    val navController = rememberNavController()

    Scaffold(
        topBar = {
            HomePageActionBar(
                title = "Real-time Obstacle Detector"
            )
        },
        backgroundColor = primary,

    ) { padding ->
        Box(
            modifier = Modifier
                .padding(padding)
        ) {
            HomePageNavGraph(navHostController = navController)
        }
    }
}