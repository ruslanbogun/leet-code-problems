package problems

import helpers.ListNode

object p83 {
  //  def deleteDuplicates(head: ListNode): ListNode = {
  //    if (head == null || head.next == null) {
  //      return head
  //    }
  //    head.next = deleteDuplicates(head.next)
  //    if (head.next != null && head.x == head.next.x) {
  //      head.next = head.next.next
  //    }
  //    head
  //  }
  def deleteDuplicates(head: ListNode): ListNode = {
    head match {
      case h if h == null => h
      case h if h.next == null => h
      case h if h.next.x == h.x => deleteDuplicates(h.next)
      case h => new ListNode(h.x, deleteDuplicates(h.next))
    }
  }
}
