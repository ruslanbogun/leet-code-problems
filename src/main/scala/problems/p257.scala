package problems

import helpers.TreeNode

object p257 {
  def binaryTreePaths(root: TreeNode): List[String] = {
    def loop(r: TreeNode, acc: List[String]): List[String] = {
      if (r.left == null && r.right == null) List(r.value.toString) else {
        val left = if (r.left != null) loop(r.left, acc).map(p => r.value + "->" + p) else acc
        val right = if (r.right != null) loop(r.right, acc).map(p => r.value + "->" + p) else acc
        left ++ right
      }
    }

    loop(root, Nil)
  }
}
