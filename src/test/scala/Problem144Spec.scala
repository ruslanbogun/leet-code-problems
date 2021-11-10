import helpers.TreeNode
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p144.preorderTraversal

class Problem144Spec extends AnyFunSpec with Matchers {
  describe("Binary Tree Preorder Traversal") {
    it("root = [1,null,2,3]") {
      val root = TreeNode(1, null, TreeNode(2, TreeNode(3)))
      preorderTraversal(root) should be(List(1, 2, 3))
    }
  }
}
