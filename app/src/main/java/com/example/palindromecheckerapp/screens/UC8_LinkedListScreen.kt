package com.example.palindromecheckerapp.screens

import androidx.compose.runtime.Composable
import com.example.palindromecheckerapp.ResultTemplate
import java.util.LinkedList

@Composable
fun UC8LinkedListScreen(onBack: () -> Unit) {
    val input = "racecar"
    val list = LinkedList<Char>()
    input.forEach { list.add(it) }

    val middle = list.size / 2
    val firstHalf = list.subList(0, middle)
    val secondHalf = list.subList(if (list.size % 2 == 0) middle else middle + 1, list.size).reversed()

    val isPalindrome = firstHalf == secondHalf

    ResultTemplate("UC8: Linked List (Half-Reverse)", input, isPalindrome, onBack)
}