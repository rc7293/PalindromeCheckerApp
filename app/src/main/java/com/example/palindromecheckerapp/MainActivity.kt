package com.example.palindromecheckerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
// Make sure these imports match your actual filenames in the screens package
import com.example.palindromecheckerapp.screens.* import com.example.palindromecheckerapp.ui.theme.PalindromeCheckerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PalindromeCheckerAppTheme {
                // Tracking which use case is currently active
                var currentScreen by remember { mutableStateOf("menu") }

                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    when (currentScreen) {
                        "menu" -> MenuScreen(onNavigate = { screenName -> currentScreen = screenName })

                        // Map each string to the corresponding file/function you created
                        "uc1" -> UC2HardcodedString { currentScreen = "menu" }
                        "uc2" -> UC3ReverseString { currentScreen = "menu" }
                        "uc4" -> UC4CharArrayScreen { currentScreen = "menu" }
                        "uc5" -> UC5StackScreen { currentScreen = "menu" }
                        "uc6" -> UC6QueueStackScreen { currentScreen = "menu" }
                        "uc7" -> UC7DequeScreen { currentScreen = "menu" }
                        "uc8" -> UC8LinkedListScreen { currentScreen = "menu" }
                        "uc9" -> UC9RecursiveScreen { currentScreen = "menu" }
                        "uc10" -> UC10NormalizationScreen { currentScreen = "menu" }
                        "uc11" -> UC11ObjectOrientedScreen { currentScreen = "menu" }
                        "uc12" -> UC12StrategyScreen { currentScreen = "menu" }
                        "uc13" -> UC13PerformanceScreen { currentScreen = "menu" }
                    }
                }
            }
        }
    }
}

@Composable
fun MenuScreen(onNavigate: (String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()) // Crucial for long lists
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Text(
            "Palindrome Management",
            fontSize = 26.sp,
            fontWeight = FontWeight.ExtraBold,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(top = 24.dp)
        )
        Text("Select an implementation to test", fontSize = 14.sp, color = Color.Gray)

        Spacer(modifier = Modifier.height(20.dp))

        // --- BASIC APPROACHES ---
        SectionHeader("Basic Implementation")
        MenuButton("UC1: Hardcoded String") { onNavigate("uc1") }
        MenuButton("UC2: String Reverse Loop") { onNavigate("uc2") }
        MenuButton("UC4: Character Array (2-Pointer)") { onNavigate("uc4") }

        // --- DATA STRUCTURES ---
        SectionHeader("Data Structures")
        MenuButton("UC5: Stack (LIFO)") { onNavigate("uc5") }
        MenuButton("UC6: Queue + Stack") { onNavigate("uc6") }
        MenuButton("UC7: Deque (Double Ended)") { onNavigate("uc7") }
        MenuButton("UC8: Linked List (In-Place)") { onNavigate("uc8") }

        // --- ADVANCED LOGIC ---
        SectionHeader("Advanced & Patterns")
        MenuButton("UC9: Recursion (Call Stack)") { onNavigate("uc9") }
        MenuButton("UC10: Normalization (Regex)") { onNavigate("uc10") }
        MenuButton("UC11: OOP Encapsulation") { onNavigate("uc11") }
        MenuButton("UC12: Strategy Design Pattern") { onNavigate("uc12") }

        // --- ANALYSIS ---
        SectionHeader("Analysis")
        MenuButton("UC13: Performance Benchmarking") { onNavigate("uc13") }

        Spacer(modifier = Modifier.height(40.dp))
    }
}

@Composable
fun SectionHeader(title: String) {
    Text(
        text = title,
        modifier = Modifier.fillMaxWidth().padding(start = 32.dp, top = 12.dp, bottom = 4.dp),
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        color = MaterialTheme.colorScheme.secondary
    )
}

@Composable
fun MenuButton(label: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth(0.85f),
        shape = MaterialTheme.shapes.medium
    ) {
        Text(label)
    }
}