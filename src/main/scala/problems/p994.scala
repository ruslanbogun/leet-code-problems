package problems

/**
 * 0 representing an empty cell,
 * 1 representing a fresh orange, or
 * 2 representing a rotten orange.
 */
object p994 {
  def orangesRotting(grid: Array[Array[Int]]): Int = {

    val EMPTY = 0
    val FRESH = 1
    val ROTTEN = 2

    def checkRotten(i: Int, j: Int): Boolean = {
      val neighbor = (i + 1, j) :: (i - 1, j) :: (i, j + 1) :: (i, j - 1) :: Nil
      neighbor.exists { case (i, j) =>
        i >= 0 && i < grid.length && j >= 0 && j < grid.head.length && grid(i)(j) == ROTTEN
      }
    }

    val fresh = (for {
      i <- grid.indices
      j <- grid.head.indices
      if grid(i)(j) == FRESH
    } yield (i, j)).toSet

    def filterFresh(f: Set[(Int, Int)], min: Int): Int = {
      val fresh = f.filter { case (i, j) => !checkRotten(i, j) }
      if (f.isEmpty || fresh.size == f.size) if (f.size > 0) -1 else min else {
        (f -- fresh).foreach { case (row, col) => grid(row)(col) = ROTTEN }
        filterFresh(fresh, min + 1)
      }
    }

    filterFresh(fresh, 0)
  }
}
