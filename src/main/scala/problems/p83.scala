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
    def loop(l: ListNode, old: Int): ListNode = {
      l match {
        case h if h == null => h
        case h if h.next != null => new ListNode(h.x, if (old == h.next.x) loop(h.next.next, old) else loop(h.next, h.x))
        case h if h.next == null => h
        case h if h.x == old => null
      }
    }

    if (head != null) loop(head, head.x) else head
  }
}
