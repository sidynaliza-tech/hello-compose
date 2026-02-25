package com.example.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hellocompose.ui.theme.HelloComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloComposeTheme {
                HelloComposeApp()
            }
        }
    }
}

@Composable
fun HelloComposeApp() {
    var name by remember { mutableStateOf("Студент") }

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Привіт, $name!",
                style = MaterialTheme.typography.headlineMedium
            )

            Button(
                onClick = { name = "Світ" },
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text("Натисни")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHello() {
    HelloComposeTheme {
        HelloComposeApp()
    }
}