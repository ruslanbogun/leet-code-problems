package problems

import helpers.TreeNode

/**
 * 653. Two Sum IV - Input is a BST
 */

object p653 {
  def findTarget(root: TreeNode, k: Int): Boolean = {
    var list = collection.mutable.Set[Int]()

    def loop(r: TreeNode): Boolean = {
      if (list.contains(k - r.value)) true else {
        list += r.value
        (if (r.left != null) loop(r.left) else false) || (if (r.right != null) loop(r.right) else false)
      }
    }

    loop(root)

  }
}
