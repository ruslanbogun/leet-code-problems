package problems

import helpers.TreeNode

object p145 {
  def postorderTraversal(root: TreeNode): List[Int] = {
    if (root == null) Nil else postorderTraversal(root.left) ::: postorderTraversal(root.right) ::: List(root.value)
  }
}
