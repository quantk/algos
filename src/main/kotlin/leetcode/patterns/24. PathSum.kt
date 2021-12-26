package main.leetcode.patterns

import main.leetcode.TreeNode

//https://leetcode.com/problems/path-sum/
fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
    return rec(root, targetSum, root?.`val` ?: 0)
}

fun rec(root: TreeNode?, targetSum: Int, sum: Int): Boolean {
    if (root == null) {
        return false
    }

    if (root.left == null && root.right == null && sum == targetSum) {
        return true
    }
    if (root.left == null && root.right == null && sum != targetSum) {
        return false
    }

    return rec(root.left, targetSum, sum + (root.left?.`val` ?: 0))
            || rec(root.right, targetSum, sum + (root.right?.`val` ?: 0))
}
