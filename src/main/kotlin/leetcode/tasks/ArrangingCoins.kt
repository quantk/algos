package main.leetcode.tasks

//https://leetcode.com/problems/arranging-coins/
fun arrangeCoins(n: Int): Int {
    var left: Long = 0
    var right = n.toLong()
    var k: Long
    var curr: Long
    while (left <= right) {
        k = left + (right - left) / 2
        curr = k * (k + 1) / 2
        if (curr.toInt() == n) return k.toInt()
        if (n < curr) {
            right = k - 1
        } else {
            left = k + 1
        }
    }
    return right.toInt()
}
