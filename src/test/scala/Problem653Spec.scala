import helpers.TreeNode
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p653.findTarget

class Problem653Spec extends AnyFunSpec with Matchers {
  describe("Two Sum IV - Input is a BST") {
    it("[2,1,3] 4") {
      val root = TreeNode(2, TreeNode(1), TreeNode(3))
      findTarget(root, 4)
    }
  }
}
