package problems

import helpers.TreeNode

object p94 {
  def inorderTraversal(root: TreeNode): List[Int] = {
    def loop(r: TreeNode, acc: List[Int]): List[Int] = {
      if (r == null) acc else {
        loop(r.right, loop(r.left, acc):+r.value)
      }
    }

    loop(root, Nil)
  }
}
