package problems

import helpers.ListNode

/**
 * 206. Reverse Linked List
 */

object p206 {
  def reverseList(head: ListNode): ListNode = {
    def loop(h: ListNode, acc: ListNode): ListNode = {
      h match {
        case null => acc
        case _ => loop(h.next, new ListNode(h.x, acc))
      }
    }

    loop(head, null)
  }
}
