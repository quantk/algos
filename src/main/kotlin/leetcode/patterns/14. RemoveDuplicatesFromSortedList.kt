package main.leetcode.patterns

import main.leetcode.ListNode

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
fun deleteDuplicates(head: ListNode?): ListNode? {
    var iterHead = head
    while (iterHead != null) {
        while (iterHead.next?.`val` == iterHead.`val`) {
            iterHead.next = iterHead.next?.next
        }

        iterHead = iterHead.next
    }

    return head
}
