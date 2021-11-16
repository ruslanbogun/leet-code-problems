package problems

import helpers.ListNode

object p203 {
  def removeElements(head: ListNode, `val`: Int): ListNode = {
    if (head == null) null else {
      if (head.x == `val`) removeElements(head.next, `val`) else new ListNode(head.x, removeElements(head.next, `val`))
    }
  }
}

