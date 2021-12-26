package main.leetcode.tasks

//https://leetcode.com/problems/next-greater-element-i/
fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
    val nums2Poses: MutableMap<Int, Int> = mutableMapOf()

    for ((index, num) in nums2.withIndex()) {
        nums2Poses[num] = index
    }

    val result = mutableListOf<Int>()

    for (num in nums1) {
        var i = (nums2Poses[num] ?: nums2.size) + 1
        while (true) {
            if (i >= nums2.size) {
                result.add(-1)
                break
            }
            val currentNum = nums2[i]
            if (currentNum > num) {
                result.add(currentNum)
                break
            } else {
                i += 1
            }
        }
    }

    return result.toIntArray()
}
