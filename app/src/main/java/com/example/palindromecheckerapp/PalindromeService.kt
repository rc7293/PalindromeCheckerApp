package com.example.palindromecheckerapp

class PalindromeService {
    /**
     * Encapsulation: The logic is hidden inside this method.
     * The UI doesn't need to know we are using a loop or a stack internally.
     */
    fun checkPalindrome(text: String): Boolean {
        if (text.isEmpty()) return true

        val cleanText = text.lowercase()
        var left = 0
        var right = cleanText.length - 1

        while (left < right) {
            if (cleanText[left] != cleanText[right]) {
                return false
            }
            left++
            right--
        }
        return true
    }
}