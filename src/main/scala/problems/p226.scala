package problems

import helpers.TreeNode

object p226 {
  def invertTree(root: TreeNode): TreeNode = {
    if (root == null) null else {
      TreeNode(root.value, invertTree(root.right), invertTree(root.left))
    }
  }
}
