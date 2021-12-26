package main.leetcode.patterns

//https://leetcode.com/problems/single-number/
fun singleNumber(nums: IntArray): Int {
    return nums.fold(0) { acc, num -> acc xor num }
}
