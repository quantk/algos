package main.leetcode.tasks

//https://leetcode.com/problems/first-unique-character-in-a-string/
fun firstUniqChar(s: String): Int {
    val charMap = mutableMapOf<Char, Int>()

    for (char in s) {
        charMap[char] = (charMap[char] ?: 0) + 1
    }

    for ((index, char) in s.withIndex()) {
        if ((charMap[char] ?: 2) == 1) {
            return index
        }
    }

    return -1
}
