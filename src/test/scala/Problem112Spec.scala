import helpers.TreeNode
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p112._

class Problem112Spec extends AnyFunSpec with Matchers {
  describe("Path Sum") {
    it("root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22") {
      val root = TreeNode(5, TreeNode(4, TreeNode(11, TreeNode(7), TreeNode(2))), TreeNode(8, TreeNode(13), TreeNode(4, null, TreeNode(1))))
      hasPathSum(root, 22) should be(true)
    }
  }
}
