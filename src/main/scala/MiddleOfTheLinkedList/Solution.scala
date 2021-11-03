package MiddleOfTheLinkedList

/**
 * 876. Middle of the Linked List
 *
 * Given the head of a singly linked list, return the middle node of the linked list.
 * If there are two middle nodes, return the second middle node.
 */

import scala.annotation.tailrec
import scala.util.Try

case class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x
}

object Solution {
  def size(head: ListNode): Int = {
    @tailrec
    def loop(h: ListNode, a: Int): Int = {
      if (h.next != null) {
        loop(h.next, a + 1)
      } else a
    }

    loop(head, 1)
  }

  //  def middleNode(head: ListNode): ListNode = {
  //    val m = (size(head) / 2) + 1
  //
  //    @tailrec
  //    def loop(h: ListNode, s: Int, i: Int): ListNode = {
  //      if (i < s) {
  //        loop(h.next, s, i + 1)
  //      } else {
  //        h
  //      }
  //    }
  //
  //    loop(head, m, 1)
  //  }
  def middleNode(head: ListNode): ListNode = {
    @annotation.tailrec
    def go(slow: ListNode, fast: ListNode): ListNode = {
      println(s"slow=${Try(slow.x).toOption} fast=${Try(fast.x).toOption}")
      if (fast != null && fast.next != null) go(slow.next, fast.next.next)
      else slow
    }

    go(head, head)
  }
}

object Main extends App {
  //val head = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
  val head = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5, ListNode(6))))))
  //val head = ListNode(1)
  println(Solution.middleNode(head))
}