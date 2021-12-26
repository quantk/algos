package main.leetcode.patterns


//https://leetcode.com/problems/peak-index-in-a-mountain-array/
fun peakIndexInMountainArray(arr: IntArray): Int {
    var left = 0
    var right = arr.size

    while (right - left > 1) {
        val middle = (left + right) / 2
        val fromLeft = arr[middle - 1]
        if (arr[middle] > fromLeft) {
            left = middle
        } else {
            right = middle
        }
    }

    return left
}
