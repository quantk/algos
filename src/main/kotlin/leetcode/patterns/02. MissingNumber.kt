package main.leetcode.patterns

//https://leetcode.com/problems/missing-number/
fun missingNumber(nums: IntArray): Int {
    var sum = (((1.0 + nums.size) / 2.0) * nums.size).toInt()

    for (num in nums) {
        sum -= num
    }

    return sum
}

