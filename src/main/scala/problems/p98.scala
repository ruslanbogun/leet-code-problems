package problems

import helpers.TreeNode

object p98 {
  def isValidBST(root: TreeNode): Boolean = {
    def loop(r: TreeNode, l: Long, h: Long): Boolean = {
      r match {
        case v if v == null => true
        case v if v.value <= l || v.value >= h => false
        case v => loop(v.right, v.value, h) && loop(v.left, l, v.value)
      }
    }

    loop(root, Long.MinValue, Long.MaxValue)
  }
}
