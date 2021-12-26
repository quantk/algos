package main.leetcode.patterns

import main.leetcode.ListNode


//https://leetcode.com/problems/palindrome-linked-list/
fun isPalindrome(head: ListNode?): Boolean {
    var slow = head
    var prev: ListNode? = null
    var fast = head

    while (fast?.next != null) {
        prev = slow
        slow = slow?.next
        fast = fast.next?.next
    }

    prev?.next = null

    var l1 = head
    var l2 = _reverseList(slow)

    while (l1 != null && l2 != null) {
        if (l1.`val` != l2.`val`) {
            return false
        }
        l1 = l1.next
        l2 = l2.next
    }

    return true
}

fun _reverseList(head: ListNode?): ListNode? {
    if (head == null) {
        return null
    }
    if (head.next == null) {
        return head
    }

    val last = _reverseList(head.next)
    head.next?.next = head
    head.next = null

    return last
}
