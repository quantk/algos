package main.leetcode.tasks

//https://leetcode.com/problems/sort-colors/
fun sortColors(nums: IntArray): Unit {
    var i = 0
    var left = 0
    var right = nums.size - 1

    while (i <= right) {
        if (nums[i] == 0) {
            nums[i] = nums[left]
            nums[left] = 0
            left++
        }
        if (nums[i] == 2) {
            nums[i] = nums[right]
            nums[right] = 2
            right--
            i--
        }
        i++
    }
}

