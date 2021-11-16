package problems

import helpers.TreeNode

class p700 {
  def searchBST(root: TreeNode, `val`: Int): TreeNode = {
    if (root == null) root else {
      if (root.value == `val`) root else if (root.value < `val`) searchBST(root.right, `val`) else searchBST(root.left, `val`)
    }
  }
}
