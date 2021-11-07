package problems

import helpers.ListNode

object p21 {
  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    (l1, l2) match {
      case (x1, null) => x1
      case (null, x2) => x2
      case (x1, x2) => if (x1.x > x2.x) new ListNode(x2.x, mergeTwoLists(x1, x2.next)) else new ListNode(x1.x, mergeTwoLists(x1.next, x2))
    }
  }
}