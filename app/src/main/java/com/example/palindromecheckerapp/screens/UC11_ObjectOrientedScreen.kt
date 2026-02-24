package com.example.palindromecheckerapp.screens

import androidx.compose.runtime.Composable
import com.example.palindromecheckerapp.PalindromeService
import com.example.palindromecheckerapp.ResultTemplate

@Composable
fun UC11ObjectOrientedScreen(onBack: () -> Unit) {
    val input = "civic"

    val service = PalindromeService()
    val result = service.checkPalindrome(input)

    ResultTemplate(
        title = "UC11: OOP Service",
        input = input,
        result = result,
        onBack = onBack,
        details = "Logic encapsulated within PalindromeService class."
    )
}