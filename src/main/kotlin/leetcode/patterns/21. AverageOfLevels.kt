package main.leetcode.patterns

import main.leetcode.TreeNode

//https://leetcode.com/problems/average-of-levels-in-binary-tree/
fun averageOfLevels(root: TreeNode?): DoubleArray {
    val levelCount = mutableMapOf<Long, Long>()
    val levelSum = mutableMapOf<Long, Long>()

    val tmp = rec(root, levelSum, levelCount, 0)

    val lSum = tmp.first
    val lCount = tmp.second

    val result = mutableListOf<Double>()
    for ((level, sum) in lSum) {
        result.add((sum.toDouble() / (lCount[level]?:1)))
    }

    return result.toDoubleArray()
}

fun rec(root: TreeNode?, levelSum: MutableMap<Long, Long>, levelCount: MutableMap<Long, Long>, depth: Long): Pair<MutableMap<Long,Long>, MutableMap<Long,Long>> {
    if (root == null) {
        return levelSum to levelCount
    }

    levelSum[depth] = root.`val` + (levelSum[depth] ?: 0)
    levelCount[depth] = 1 + (levelCount[depth] ?: 0)


    rec(root.left, levelSum, levelCount, depth + 1)
    rec(root.right, levelSum, levelCount, depth + 1)

    return levelSum to levelCount
}
