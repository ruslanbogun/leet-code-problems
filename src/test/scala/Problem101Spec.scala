import helpers.TreeNode
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p101.isSymmetric

class Problem101Spec extends AnyFunSpec with Matchers {
  describe("Symmetric Tree") {
    it("[1,2,2,3,4,4,3]") {
      val root = TreeNode(1, TreeNode(2, TreeNode(3), TreeNode(4)), TreeNode(2, TreeNode(4), TreeNode(3)))
      isSymmetric(root) should be(true)
    }
  }
}
