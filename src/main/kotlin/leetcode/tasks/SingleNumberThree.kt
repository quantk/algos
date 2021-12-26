package main.leetcode.tasks

//https://leetcode.com/problems/single-number-iii/
fun singleNumber3(nums: IntArray): IntArray {
    val map = mutableMapOf<Int, Int>()

    for (num in nums) {
        map[num] = (map[num] ?: 0) + 1
    }

    val result = mutableListOf<Int>()
    for ((key, value) in map) {
        if (value == 1) {
            result.add(key)
        }
    }

    return result.toIntArray()
}
