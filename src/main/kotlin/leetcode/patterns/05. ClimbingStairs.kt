package main.leetcode.patterns

//https://leetcode.com/problems/climbing-stairs/
fun climbStairs(n: Int): Int {
    if (n == 1) {
        return 1
    }

    var first = 1
    var second = 2

    for (i in 3..n) {
        val tmpSecond = second
        second += first
        first = tmpSecond
    }

    return second
}
