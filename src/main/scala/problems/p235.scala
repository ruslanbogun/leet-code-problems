package problems

import helpers.TreeNode

object p235 {
  def lowestCommonAncestor(root: TreeNode, p: TreeNode, q: TreeNode): TreeNode = {
    root match {
      case r if p.value < r.value && q.value < r.value => lowestCommonAncestor(r.left, p, q)
      case r if p.value > r.value && q.value > r.value => lowestCommonAncestor(r.right, p, q)
      case r => r
    }
  }
}
