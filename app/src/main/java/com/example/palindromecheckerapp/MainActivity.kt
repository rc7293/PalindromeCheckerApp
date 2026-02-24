package com.example.palindromecheckerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.palindromecheckerapp.ui.theme.PalindromeCheckerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PalindromeCheckerAppTheme {
                var currentScreen by remember { mutableStateOf("init") }

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    if (currentScreen == "init") {
                        InitScreen(onNext = { currentScreen = "result" })
                    } else {
                        ResultScreen()
                    }
                }
            }
        }
    }
}

@Composable
fun InitScreen(onNext: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Palindrome Checker", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text("Management System", fontSize = 18.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Text("Version 1.0", style = MaterialTheme.typography.bodySmall)

        Spacer(modifier = Modifier.height(32.dp))

        CircularProgressIndicator(modifier = Modifier.size(30.dp)) // Visual feedback
        Text("System initialized successfully.", modifier = Modifier.padding(16.dp))

        Button(onClick = onNext) {
            Text("Check Hardcoded String")
        }
    }
}

@Composable
fun ResultScreen() {
    // Hardcoded Logic
    val testString = "Racecar"
    val isPalindrome = testString.lowercase() == testString.lowercase().reversed()

    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant
            )
        ) {
            Column(modifier = Modifier.padding(24.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                Text("Result for: \"$testString\"", style = MaterialTheme.typography.headlineSmall)
                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = if (isPalindrome) "IS A PALINDROME" else "NOT A PALINDROME",
                    color = if (isPalindrome) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.error,
                    fontWeight = FontWeight.Black,
                    fontSize = 20.sp
                )
            }
        }
    }
}