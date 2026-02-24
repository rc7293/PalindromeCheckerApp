package com.example.palindromecheckerapp.screens

import androidx.compose.runtime.Composable
import com.example.palindromecheckerapp.ResultTemplate

@Composable
fun UC4CharArrayScreen(onBack: () -> Unit) {
    val input = "level"
    val charArray = input.toCharArray()
    var isPalindrome = true

    var start = 0
    var end = charArray.size - 1

    while (start < end) {
        if (charArray[start] != charArray[end]) {
            isPalindrome = false
            break
        }
        start++
        end--
    }

    ResultTemplate("UC4: Char Array (Two-Pointer)", input, isPalindrome, onBack)
}