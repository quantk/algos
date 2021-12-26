package main.leetcode.patterns

//https://leetcode.com/problems/range-sum-query-immutable/
class NumArray(nums: IntArray) {
    private val sumCache = mutableMapOf<Int, Int>()

    init {

        var sum = 0
        for ((index, num) in nums.withIndex()) {
            sum += num
            sumCache[index] = sum
        }
    }

    fun sumRange(left: Int, right: Int): Int {
        return if (left == 0) (sumCache[right] ?: 0) else (sumCache[right] ?: 0) - (sumCache[left - 1] ?: 0)
    }
}
