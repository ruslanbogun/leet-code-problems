package problems

import helpers.Node

object p116 {
  def connect(root: Node): Node = root match {
    case null => null
    case _ =>
      if(root.left!=null) {
        root.left.next = root.right
        if(root.next!=null) root.right.next = root.next.left
      }
      connect(root.left)
      connect(root.right)
      root
  }
}



