package com.example.palindromecheckerapp.screens

import androidx.compose.runtime.Composable
import com.example.palindromecheckerapp.ResultTemplate
import java.util.ArrayDeque

@Composable
fun UC7DequeScreen(onBack: () -> Unit) {
    val input = "rotator"
    val deque = ArrayDeque<Char>()
    input.forEach { deque.addLast(it) }

    var isPalindrome = true
    while (deque.size > 1) {
        if (deque.removeFirst() != deque.removeLast()) {
            isPalindrome = false
            break
        }
    }

    ResultTemplate("UC7: Deque Optimized", input, isPalindrome, onBack)
}