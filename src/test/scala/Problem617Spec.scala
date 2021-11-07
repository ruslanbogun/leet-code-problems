import helpers.TreeNode
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p617.mergeTrees

class Problem617Spec extends AnyFunSpec with Matchers {
  describe("Merge Two Binary Trees") {
    it("root1 = [1,3,2,5], root2 = [2,1,3,null,4,null,7] should be [3,4,5,5,4,null,7]") {
      val root1 = TreeNode(1, TreeNode(3, TreeNode(5)), TreeNode(2))
      val root2 = TreeNode(2, TreeNode(1, null, TreeNode(4)), TreeNode(3, null, TreeNode(7)))
      println(mergeTrees(root1, root2))
    }
  }
}
