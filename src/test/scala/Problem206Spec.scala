import helpers.ListNode
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p206.reverseList

class Problem206Spec extends AnyFunSpec with Matchers {
  describe("Reverse Linked List") {
    it("[1,2,3,4,5] to [5,4,3,2,1]") {
      val head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))
      println(reverseList(head).toString) // should be(new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1))))))
    }
  }
}
