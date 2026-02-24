package com.example.palindromecheckerapp.screens

import androidx.compose.runtime.Composable
import com.example.palindromecheckerapp.ResultTemplate

@Composable
fun UC2HardcodedString(onBack: () -> Unit) {
    val word = "madam"
    val isPalindrome = word == "madam"

    ResultTemplate(title = "UC1: Hardcoded Check", input = word, result = isPalindrome, onBack = onBack)
}