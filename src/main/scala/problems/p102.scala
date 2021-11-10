package problems

import helpers.TreeNode

import scala.annotation.tailrec

object p102 {
  def levelOrder(root: TreeNode): List[List[Int]] = {
    @tailrec
    def loop(queue: List[TreeNode], acc: List[List[Int]]): List[List[Int]] = {
      if (queue.isEmpty || queue == List(null)) acc else {
        val newQ = queue.foldLeft(List.empty[TreeNode], List.empty[Int]) { case ((q, a), node) =>
          (q ++ List(node.left, node.right).filterNot(_ == null), a :+ node.value)
        }
        loop(newQ._1, acc :+ newQ._2)
      }
    }

    loop(List(root), Nil)
  }
}


