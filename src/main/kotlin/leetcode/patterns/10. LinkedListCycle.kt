package main.leetcode.patterns

import main.leetcode.ListNode

//https://leetcode.com/problems/linked-list-cycle/
fun hasCycle(head: ListNode?): Boolean {
    if (head?.next == null) {
        return false
    }

    var slow = head
    var fast = head

    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next

        if (slow == fast) {
            return true
        }
    }

    return false
}
