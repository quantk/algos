package main.leetcode.patterns

import main.leetcode.TreeNode

//https://leetcode.com/problems/same-tree/
fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    if (p == null && q == null) {
        return true
    }

    val result = p?.`val` == q?.`val`
    if (!result) {
        return false
    }
    val leftResult = isSameTree(p?.left, q?.left)
    val rightResult = isSameTree(p?.right, q?.right)

    return leftResult && rightResult
}
