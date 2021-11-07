package problems

import helpers.ListNode

object p141 {
  def hasCycle(head: ListNode): Boolean = {
    def loop(slow: ListNode, fast: ListNode): Boolean = {
      (slow, fast) match {
        case (s, f) if s == null || f == null || f.next == null => false
        case (s, f) if s == f => true
        case (s, f) => loop(s.next, f.next.next)
      }
    }

    if (head != null) loop(head, head.next) else false
  }
}
