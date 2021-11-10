package problems

import helpers.TreeNode

object p101 {
  def isSymmetric(root: TreeNode): Boolean = {
    def loop(q: List[TreeNode], a: Boolean): Boolean = {

      if (q == List(null) || q.isEmpty || !a) a else {
        val check = q.flatMap(n => List(Option(n.left), Option(n.right)))
        val aa = check.map(_.map(_.value))
        loop(check.flatten, aa == aa.reverse)
      }
    }

    loop(List(root), true)
  }
}
