import helpers.TreeNode
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p102.levelOrder

class Problem102Spec extends AnyFunSpec with Matchers {
  describe("Binary Tree Level Order Traversal") {
    it("[3,9,20,null,null,15,7]") {
      val root = TreeNode(3, TreeNode(9), TreeNode(20, TreeNode(15), TreeNode(7)))
      levelOrder(root) should be(List(List(3), List(9, 20), List(15, 7)))
    }

    it("test") {
      val root = TreeNode(3, TreeNode(8, TreeNode(6), TreeNode(5, TreeNode(1), TreeNode(0))), TreeNode(7, TreeNode(9), TreeNode(4)))
      levelOrder(root) should be(List(List(3), List(8, 7), List(6, 5, 9, 4), List(1, 0)))
    }

    it("[2,5,6]") {
      val root = TreeNode(2, TreeNode(5), TreeNode(6))
      levelOrder(root) should be(List(List(2), List(5, 6)))
    }
  }
}
