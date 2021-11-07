package problems

object p74 {
  def searchMatrix(matrix: Array[Array[Int]], target: Int): Boolean = {
    def findRow(m: Array[Array[Int]]): Array[Int] = {
      if (m.length == 1) m.head else {
        val (l, r) = m.splitAt(m.length / 2)
        if (target <= l.last.last) findRow(l) else findRow(r)
      }
    }

    def checkTarget(m: Array[Int]): Boolean = {
      if (m.length == 1) {
        m.head == target
      } else {
        val (l, r) = m.splitAt(m.length / 2)
        if (target <= l.last) checkTarget(l) else checkTarget(r)
      }
    }

    checkTarget(findRow(matrix))
  }
}
