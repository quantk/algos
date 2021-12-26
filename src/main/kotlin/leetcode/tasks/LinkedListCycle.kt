package main.leetcode.tasks

import main.leetcode.ListNode

//https://leetcode.com/problems/linked-list-cycle/
fun hasCycle(head: ListNode?): Boolean {
    if (head?.next == null) {
        return false
    }

    var fast = head
    var slow = head

    while (fast?.next != null) {
        fast = fast.next?.next
        slow = slow?.next

        if (fast == slow) {
            return true
        }
    }

    return false
}
