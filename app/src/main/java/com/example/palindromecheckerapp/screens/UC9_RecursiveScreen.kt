package com.example.palindromecheckerapp.screens

import androidx.compose.runtime.Composable
import com.example.palindromecheckerapp.ResultTemplate

@Composable
fun UC9RecursiveScreen(onBack: () -> Unit) {
    val input = "deified"

    // Recursive function
    fun isPalRecursive(str: String): Boolean {
        // Base Condition: string of length 0 or 1 is always a palindrome
        if (str.length <= 1) return true
        // Compare first and last
        if (str.first() != str.last()) return false
        // Recursive Call with the middle substring
        return isPalRecursive(str.substring(1, str.length - 1))
    }

    val result = isPalRecursive(input)
    ResultTemplate("UC9: Recursion", input, result, onBack, "Base case check & recursive call stack used.")
}