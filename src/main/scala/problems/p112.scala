package problems

import helpers.TreeNode

object p112 {
  def hasPathSum(root: TreeNode, targetSum: Int): Boolean = {
    def loop(r: TreeNode, acc: Int): Boolean = {
      (r.value, r.left, r.right) match {
        case (v, null, null) => if (acc-v == 0) true else false
        case (v, null, right) => loop(right, acc - v)
        case (v, left, null) => loop(left, acc - v)
        case (v, left, right) => loop(left, acc - v) || loop(right, acc - v)
      }
    }

    if (root != null) loop(root, targetSum) else false
  }
}
