package main.leetcode.tasks

import main.leetcode.TreeNode

//https://leetcode.com/problems/invert-binary-tree/
fun invertTree(root: TreeNode?): TreeNode? {
    if (root == null) {
        return root
    }

    helper(root)

    return root
}

fun helper(root: TreeNode?): TreeNode? {
    if (root == null) {
        return root
    }

    val tmpLeft = root.left
    root.left = root.right
    root.right = tmpLeft

    helper(root.left)
    helper(root.right)

    return root
}
