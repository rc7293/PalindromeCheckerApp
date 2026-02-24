package com.example.palindromecheckerapp.screens

import androidx.compose.runtime.Composable
import com.example.palindromecheckerapp.ResultTemplate

@Composable
fun UC3ReverseString(onBack: () -> Unit) {
    val original = "racecar"

    var reversed = ""
    for (i in original.length - 1 downTo 0) {
        reversed += original[i]
    }
    val isPalindrome = original.equals(reversed, ignoreCase = true)

    ResultTemplate(title = "UC2: Manual Loop Reverse", input = original, details = reversed, result = isPalindrome, onBack = onBack)
}