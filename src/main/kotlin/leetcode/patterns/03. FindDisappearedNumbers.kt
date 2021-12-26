package main.leetcode.patterns

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
fun findDisappearedNumbers(nums: IntArray): List<Int> {
    val map = mutableMapOf<Int, Boolean>()

    for (num in nums) {
        map[num] = true
    }

    val result = mutableListOf<Int>()
    for (i in 1..nums.size) {
        if (!map.contains(i)) {
            result.add(i)
        }
    }

    return result
}

fun sort(nums: IntArray): IntArray {
    var i = 0
    while (i < nums.size) {
        if (nums[i] != nums[nums[i] - 1]) {
            val t = nums[nums[i] - 1]
            nums[nums[i] - 1] = nums[i]
            nums[i] = t
        } else {
            i++
        }
    }

    return nums
}
