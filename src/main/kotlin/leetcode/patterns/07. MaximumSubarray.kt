package main.leetcode.patterns

//https://leetcode.com/problems/maximum-subarray/
fun maxSubArray(nums: IntArray): Int {
    var sum = 0
    var max = Int.MIN_VALUE
    for (num in nums) {
        if (sum + num < num) {
            sum = num
        } else {
            sum += num
        }

        max = maxOf(max, sum)
    }

    return max
}
