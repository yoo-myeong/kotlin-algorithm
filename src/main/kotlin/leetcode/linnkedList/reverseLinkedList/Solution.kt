package leetcode.linnkedList.reverseLinkedList

class ListNode(
    var `val`: Int,
) {
    var next: ListNode? = null
}

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var node = head

        while (node != null) {
            val next = node.next
            node.next = prev
            prev = node
            node = next
        }

        return prev
    }
}
