package main.leetcode.patterns

import main.leetcode.ListNode

//https://leetcode.com/problems/merge-two-sorted-lists/
fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    if (l1 == null) {
        return l2
    }
    if (l2 == null) {
        return l1
    }
    var list1 = l1
    var list2 = l2

    var result: ListNode? = null

    if (list1.`val` > list2.`val`) {
        result = list2
        list2 = list2.next
    } else {
        result = list1
        list1 = list1.next
    }

    val head = result

    while (list1 != null || list2 != null) {
        if (list1 != null && list2 != null) {
            if (list1.`val` > list2.`val`) {
                result?.next = list2
                result = list2
                list2 = list2.next
            } else {
                result?.next = list1
                result = list1
                list1 = list1.next
            }
        } else if (list1 != null) {
            result?.next = list1
            result = list1
            list1 = list1.next
        } else if (list2 != null) {
            result?.next = list2
            result = list2
            list2 = list2.next
        }
    }

    return head
}
