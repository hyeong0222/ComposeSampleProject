package com.example.composesampleproject.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.example.composesampleproject.ui.MainContent
import com.example.composesampleproject.ui.theme.ComposeSampleProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeSampleProjectTheme {
                MainApp()
            }
        }
    }
}

@Composable
fun MainApp() {
    Scaffold (
        content = {
            MainContent()
        }
    )
}