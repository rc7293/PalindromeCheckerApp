package com.example.palindromecheckerapp.screens
// UC5_StackScreen.kt
import androidx.compose.runtime.Composable
import com.example.palindromecheckerapp.ResultTemplate
import java.util.Stack

@Composable
fun UC5StackScreen(onBack: () -> Unit) {
    val input = "noon"
    val stack = Stack<Char>()

    for (c in input) { stack.push(c) }

    var reversed = ""
    while (!stack.isEmpty()) {
        reversed += stack.pop()
    }

    val isPalindrome = input == reversed
    ResultTemplate("UC5: Stack-Based (LIFO)", input, isPalindrome, onBack, "Reversed via Pop: $reversed")
}