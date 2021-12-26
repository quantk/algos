package main.leetcode.tasks

//https://leetcode.com/problems/search-insert-position/
fun searchInsert(nums: IntArray, target: Int): Int {
    var left = -1
    var right = nums.size

    while (right - left > 1) {
        val middle = (left + right) / 2
        if (nums[middle] == target) {
            return middle
        }
        if (nums[middle] <= target) {
            left = middle
        } else {
            right = middle
        }
    }

    return right
}
