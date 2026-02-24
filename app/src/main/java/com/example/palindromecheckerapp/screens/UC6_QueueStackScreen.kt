package com.example.palindromecheckerapp.screens

import androidx.compose.runtime.Composable
import com.example.palindromecheckerapp.ResultTemplate
import java.util.*

@Composable
fun UC6QueueStackScreen(onBack: () -> Unit) {
    val input = "radar"
    val stack = Stack<Char>()
    val queue: Queue<Char> = LinkedList()

    input.forEach {
        stack.push(it)
        queue.add(it)
    }

    var isPalindrome = true
    while (!stack.isEmpty()) {
        // Compare Dequeue (Front) with Pop (Back)
        if (stack.pop() != queue.remove()) {
            isPalindrome = false
            break
        }
    }

    ResultTemplate("UC6: Queue + Stack", input, isPalindrome, onBack)
}