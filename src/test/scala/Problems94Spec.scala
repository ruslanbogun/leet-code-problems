import helpers.TreeNode
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p94.inorderTraversal

class Problems94Spec extends AnyFunSpec with Matchers {
  describe("Binary Tree Inorder Traversal") {
    it("[1,null,2,3]") {
      val root = TreeNode(1, null, TreeNode(2, TreeNode(3)))
      inorderTraversal(root) should be(List(1, 3, 2))
    }
  }
}
