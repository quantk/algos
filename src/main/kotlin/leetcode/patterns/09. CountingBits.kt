package main.leetcode.patterns

//https://leetcode.com/problems/counting-bits/
fun countBitsInNumber(n: Int): Int {
    // 0001
    var count = 0
    var nForIterate = n
    while (nForIterate > 0) {
        nForIterate = nForIterate and (nForIterate - 1)
        count++
    }

    return count
}

fun countBits(n: Int): IntArray {
    val result = mutableListOf<Int>()

    for (i in 0..n) {
        result.add(countBitsInNumber(i))
    }

    return result.toIntArray()
}
