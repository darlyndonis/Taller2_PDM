package com.pdmtaller2.DarlynDonis_00083823

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.pdmtaller2.DarlynDonis_00083823.ui.layout.CustomScaffold
import com.pdmtaller2.DarlynDonis_00083823.ui.theme.FoodSpotByDdonisTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodSpotByDdonisTheme {
               CustomScaffold()
            }
        }
    }
}