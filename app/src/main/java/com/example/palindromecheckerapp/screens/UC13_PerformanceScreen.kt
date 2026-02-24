package com.example.palindromecheckerapp.screens

import androidx.compose.runtime.Composable
import com.example.palindromecheckerapp.ResultTemplate

@Composable
fun UC13PerformanceScreen(onBack: () -> Unit) {
    val input = "racecar".repeat(100)

    val startLoop = System.nanoTime()
    input == input.reversed()
    val endLoop = System.nanoTime()

    val loopTime = endLoop - startLoop

    ResultTemplate(
        title = "UC13: Performance",
        input = "Long String (700 chars)",
        result = true,
        onBack = onBack,
        details = "Loop Time: $loopTime ns\n(Measured via System.nanoTime())"
    )
}