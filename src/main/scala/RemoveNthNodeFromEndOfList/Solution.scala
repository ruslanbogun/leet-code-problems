package RemoveNthNodeFromEndOfList

/**
 * 19. Remove Nth Node From End of List
 *
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 *
 */

case class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x

  override def toString: String = s"[$x]->$next"
}

object Solution {
  def removeNthFromEnd(head: ListNode, n: Int): ListNode = {

    def size(h: ListNode) = {
      def loop(h: ListNode, idx: Int): Int = {
        if (h == null) idx else loop(h.next, idx + 1)
      }

      loop(h, 0)
    }

    def loop(h: ListNode, idx: Int): ListNode = {
      if (h == null) h else {
        if (idx == 0) h.next else ListNode(h.x, loop(h.next, idx - 1))
      }
    }

    loop(head, size(head) - n)
  }
}

object Main extends App {
  //val head = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
  val head = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5, ListNode(6))))))
  //val head = ListNode(1)
  println(Solution.removeNthFromEnd(head, 2))
}
