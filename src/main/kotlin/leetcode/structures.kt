package main.leetcode

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class RandomizedSet() {
    private val hashMap: MutableMap<Int, Int> = mutableMapOf()

    fun insert(`val`: Int) = hashMap.put(`val`, `val`) == null

    fun remove(`val`: Int) = hashMap.remove(`val`, `val`)

    fun getRandom() = hashMap.values.random()
}
