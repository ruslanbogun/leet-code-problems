package problems

import helpers.TreeNode

object p701 {
  def insertIntoBST(root: TreeNode, `val`: Int): TreeNode = {
    if (root == null) TreeNode(`val`) else {
      TreeNode(root.value,
        if(root.value >= `val`) insertIntoBST(root.left, `val`) else root.left,
        if(root.value < `val` ) insertIntoBST(root.right, `val`) else root.right)
    }
  }
}
