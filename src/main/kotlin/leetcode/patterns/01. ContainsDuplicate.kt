package main.leetcode.patterns

//https://leetcode.com/problems/contains-duplicate/
fun containsDuplicate(nums: IntArray): Boolean {
    val digitMap = mutableMapOf<Int, Boolean>()

    for (num in nums) {
        if (digitMap.contains(num)) {
            return true;
        }

        digitMap[num] = true;
    }

    return false;
}
