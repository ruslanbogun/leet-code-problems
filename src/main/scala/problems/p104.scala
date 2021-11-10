package problems

import helpers.TreeNode

object p104 {
  def maxDepth(root: TreeNode): Int = {
    def loop(queue: List[TreeNode], acc: Int): Int = {
      if (queue.isEmpty || queue == List(null)) acc else loop(queue.flatMap(n => List(n.left, n.right)).filterNot(_ == null), acc + 1)
    }

    loop(List(root), 0)
  }
}
