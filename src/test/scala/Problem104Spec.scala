import helpers.TreeNode
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p104.maxDepth

class Problem104Spec extends AnyFunSpec with Matchers {
  describe("") {
    it("[3,9,20,null,null,15,7]") {
      val root = TreeNode(3, TreeNode(9), TreeNode(20, TreeNode(15), TreeNode(7)))
      maxDepth(root) should be(3)
    }
  }
}
