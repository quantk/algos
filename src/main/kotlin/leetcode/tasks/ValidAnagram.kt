package main.leetcode.tasks

//https://leetcode.com/problems/valid-anagram/

fun naiveIsAnagram(s: String, t: String) = s.toList().sorted().toString() == t.toList().sorted().toString()

fun isAnagram(s: String, t: String): Boolean {
    val charMap = mutableMapOf<Char, Int>()
    for (char in s) {
        charMap[char] = (charMap[char] ?: 0) + 1
    }

    for (char in t) {
        if (charMap[char] == null || charMap[char] == 0) {
            return false
        }

        val delta = (charMap[char] ?: 0) - 1
        if (delta < 0) {
            return false
        }
        if (delta == 0) {
            charMap.remove(char)
        } else {
            charMap[char] = delta
        }
    }

    return charMap.isEmpty()
}
