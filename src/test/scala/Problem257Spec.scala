import helpers.TreeNode
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p257.binaryTreePaths

class Problem257Spec extends AnyFunSpec with Matchers {
  describe("257. Binary Tree Paths") {
    it("root = [1,2,3,null,5] should be [\"1->2->5\",\"1->3\"]") {
      val root = TreeNode(1, TreeNode(2, null, TreeNode(5)), TreeNode(3))
      binaryTreePaths(root) should be(List("1->2->5", "1->3"))
    }
  }
}
