package main.leetcode.patterns

import main.leetcode.ListNode

//https://leetcode.com/problems/reverse-linked-list/
fun reverseList(head: ListNode?): ListNode? {
    if (head == null) {
        return null
    }
    if (head.next == null) {
        return head
    }

    val last = reverseList(head.next)
    head.next?.next = head
    head.next = null

    return last
}

fun reverseListIter(head: ListNode?): ListNode? {
    var iterHead: ListNode? = head ?: return null

    var prev: ListNode? = null
    var result: ListNode? = null
    while (iterHead != null) {
        val next = iterHead.next
        val nextnext = next?.next
        next?.next = iterHead
        iterHead.next = prev
        prev = next
        result = iterHead
        iterHead = nextnext
    }

    return prev ?: result
}
