package main.leetcode.patterns

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
fun nextGreatestLetter(letters: CharArray, target: Char): Char {
    var left = 0
    var right = letters.size

    while (left < right) {
        val middle = (left + right) / 2

        if (letters[middle] <= target) {
            left = middle + 1
        } else {
            right = middle
        }
    }

    return letters[left % letters.size]
}
