package main.leetcode.tasks

//https://leetcode.com/problems/intersection-of-two-arrays-ii/
fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val map = mutableMapOf<Int, Int>()
    val result = mutableListOf<Int>()
    val longest: IntArray
    val shortest: IntArray
    if (nums1.size > nums2.size) {
        longest = nums1
        shortest = nums2
    } else {
        shortest = nums2
        longest = nums1
    }

    for (i in shortest.indices) {
        map[shortest[i]] = (map[shortest[i]] ?: 0) + 1
    }
    for (i in longest.indices) {
        val curVal = map[longest[i]] ?: 0
        if (curVal <= 0) {
            continue
        }

        result.add(longest[i])
        map[longest[i]] = (map[longest[i]] ?: 0) - 1
    }


    return result.toIntArray()
}
