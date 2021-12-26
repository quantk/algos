package main.leetcode.patterns

import main.leetcode.TreeNode

//https://leetcode.com/problems/minimum-depth-of-binary-tree/
fun minDepth(root: TreeNode?): Int {
    if (root == null) {
        return 0
    }

    return rec(root, 1)
}

fun rec(root: TreeNode?, depth: Int): Int {
    if (root == null) {
        return Int.MAX_VALUE
    }

    if (root.left == null && root.right == null) {
        return depth
    }

    return minOf(rec(root.left, depth + 1), rec(root.right, depth + 1))
}
