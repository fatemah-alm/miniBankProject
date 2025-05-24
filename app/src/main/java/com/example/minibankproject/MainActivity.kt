package com.example.minibankproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.minibankproject.navigation.BranchNavHost
import com.example.minibankproject.ui.theme.MiniBankProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiniBankProjectTheme{
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BranchNavHost(modifier = Modifier.padding(innerPadding))
                }
        }}
    }
}

