package main.leetcode.tasks

//https://leetcode.com/problems/reverse-words-in-a-string/
fun reverseWords(s: String) =
    s.split(" ")
        .filter { it != "" }
        .asReversed()
        .joinToString(" ")
