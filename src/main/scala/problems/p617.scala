package problems

import helpers.TreeNode

object p617 {
  def mergeTrees(root1: TreeNode, root2: TreeNode): TreeNode = {
    (root1, root2) match {
      case (null, r2) => r2
      case (r1, null) => r1
      case (r1, r2) => TreeNode(r1.value + r2.value, mergeTrees(r1.left, r2.left), mergeTrees(r1.right, r2.right))
    }
  }
}
