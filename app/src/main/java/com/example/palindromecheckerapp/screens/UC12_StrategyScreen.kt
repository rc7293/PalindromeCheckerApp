package com.example.palindromecheckerapp.screens

import androidx.compose.runtime.Composable
import com.example.palindromecheckerapp.ResultTemplate

interface PalindromeStrategy {
    fun check(text: String): Boolean
}

class StackStrategy : PalindromeStrategy {
    override fun check(text: String): Boolean = text == text.reversed() // Simplified for demo
}

@Composable
fun UC12StrategyScreen(onBack: () -> Unit) {
    val input = "refer"

    // 3. Injecting the strategy at runtime
    val strategy: PalindromeStrategy = StackStrategy()
    val result = strategy.check(input)

    ResultTemplate("UC12: Strategy Pattern", input, result, onBack, "Strategy: ${strategy::class.simpleName}")
}