package com.example.palindromecheckerapp.screens

import androidx.compose.runtime.Composable
import com.example.palindromecheckerapp.ResultTemplate

@Composable
fun UC10NormalizationScreen(onBack: () -> Unit) {
    val input = "A man a plan a canal Panama"

    // Step 1: Normalize using Regex (keep only letters/digits, convert to lowercase)
    val normalized = input.replace(Regex("[^A-Za-z0-9]"), "").lowercase()

    // Step 2: Check (using simple reverse)
    val result = normalized == normalized.reversed()

    ResultTemplate("UC10: Normalization", input, result, onBack, "Cleaned: $normalized")
}