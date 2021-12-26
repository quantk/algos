package main.leetcode.tasks

import main.leetcode.TreeNode

//https://leetcode.com/problems/cousins-in-binary-tree/
fun isCousins(root: TreeNode?, x: Int, y: Int): Boolean {
    val resultMap = mutableMapOf<Int, Pair<Int, TreeNode?>>()
    rec(root, null, x, y, 0, resultMap)

    return resultMap[x]?.first == resultMap[y]?.first && resultMap[x]?.second != resultMap[y]?.second
}

fun rec(root: TreeNode?, parent: TreeNode?, x: Int, y: Int, depth: Int, map: MutableMap<Int, Pair<Int, TreeNode?>>) {
    if (root == null) {
        return
    }

    if (root.`val` == x) {
        map[x] = depth to parent
    }
    if (root.`val` == y) {
        map[y] = depth to parent
    }

    rec(root.left, root, x,y, depth + 1, map)
    rec(root.right, root, x,y, depth + 1, map)

    return
}
