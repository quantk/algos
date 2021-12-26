package main.leetcode.tasks

//https://leetcode.com/problems/min-stack/
data class Node(val value: Int, var next: Node?)
class MinStack() {
    private var head: Node? = null;
    private var minHead: Node? = null

    fun push(`val`: Int) {
        val newHead = Node(`val`, head)
        val newMinHead = Node(minOf(`val`, minHead?.value ?: Int.MAX_VALUE), minHead)
        head = newHead
        minHead = newMinHead
    }

    fun pop() {
        head = head?.next
        minHead = minHead?.next
    }

    fun top(): Int = head?.value!!
    fun getMin(): Int = minHead?.value!!
}
