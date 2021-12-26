package main.leetcode.patterns

//https://leetcode.com/problems/binary-search/
fun search(nums: IntArray, target: Int): Int {
    var left = -1
    var right = nums.size

    while (right - left > 1) {
        val middle: Int = (left + right) / 2
        if (nums[middle] == target) {
            return middle
        }

        if (nums[middle] >= target) {
            right = middle
        } else {
            left = middle
        }
    }

    return -1
}
