package main.leetcode.tasks

//https://leetcode.com/problems/ransom-note/
fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val charMap = mutableMapOf<Char, Int>()
    for (char in magazine) {
        charMap[char] = (charMap[char] ?: 0) + 1
    }

    for (char in ransomNote) {
        if (charMap[char] == null || charMap[char] == 0) {
            return false
        }

        val delta = (charMap[char] ?: 0) - 1
        if (delta < 0) {
            return false
        }
        charMap[char] = delta
    }

    return true
}
