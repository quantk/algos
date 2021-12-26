package main.leetcode.tasks

import main.leetcode.TreeNode

//https://leetcode.com/problems/sum-of-left-leaves/
fun sumOfLeftLeaves(root: TreeNode?): Int {
    if (root == null) {
        return 0
    }

    val leftSum =
        if (root.left?.left == null && root.left?.right == null)
            root.left?.`val` ?: 0
        else
            0

    return leftSum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right)
}
