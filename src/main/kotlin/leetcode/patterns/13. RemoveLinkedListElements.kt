package main.leetcode.patterns

import main.leetcode.ListNode

//https://leetcode.com/problems/remove-linked-list-elements/
fun removeElements(head: ListNode?, `val`: Int): ListNode? {
    var initialHead = head
    var iterHead = head
    var prev: ListNode? = null
    while (iterHead != null) {
        if (iterHead.`val` == `val` && prev == null) {
            initialHead = iterHead.next
        } else if (iterHead.`val` == `val`) {
            prev?.next = iterHead.next
        } else {
            prev = iterHead
        }

        iterHead = iterHead.next
    }

    return initialHead
}
