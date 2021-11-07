import helpers.ListNode
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p83.deleteDuplicates

class Problem83Spec extends AnyFunSpec with Matchers {
  describe("Remove Duplicates from Sorted List") {
    it("[1,1,2,3,3] -> [1,2,3]") {
      val head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))))
      deleteDuplicates(head) should be(new ListNode(1, new ListNode(2, new ListNode(3))))
    }
    it("[1,1,2]"){
      val head = new ListNode(1,new ListNode(1,new ListNode(2)))
      deleteDuplicates(head) should be (new ListNode(1, new ListNode(2)))
    }

    it("[1,1,1]"){
      val head = new ListNode(1,new ListNode(1,new ListNode(1)))
      deleteDuplicates(head) should be (new ListNode(1))
    }
    it("[]"){
      val head = new ListNode()
      deleteDuplicates(head) should be (new ListNode())
    }
    it("[1]"){
      val head = new ListNode(1)
      deleteDuplicates(head) should be (new ListNode(1))
    }
  }
}
