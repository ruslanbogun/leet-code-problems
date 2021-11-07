package problems

object p542 {
  def updateMatrix1(mat: Array[Array[Int]]): Array[Array[Int]] = {
    var matrix = Array.ofDim[Int](mat.length, mat.head.length)

    def loopTop(i: Int, j: Int, acc: Int): Int = if (i < 0) Int.MaxValue else if (mat(i)(j) == 0) acc else loopTop(i - 1, j, acc + 1)

    def loopBottom(i: Int, j: Int, acc: Int): Int = if (i >= mat.length) Int.MaxValue else if (mat(i)(j) == 0) acc else loopBottom(i + 1, j, acc + 1)

    def loopLeft(i: Int, j: Int, acc: Int): Int = if (j < 0) Int.MaxValue else if (mat(i)(j) == 0) acc else loopLeft(i, j - 1, acc + 1)

    def loopRight(i: Int, j: Int, acc: Int): Int = if (j >= mat.head.length) Int.MaxValue else if (mat(i)(j) == 0) acc else loopRight(i, j + 1, acc + 1)

    for (x <- mat.indices) {
      for (y <- mat.head.indices) {
        matrix(x)(y) = Math.min(Math.min(loopLeft(x, y, 0), loopRight(x, y, 0)), Math.min(loopTop(x, y, 0), loopBottom(x, y, 0)))
      }
    }
    matrix
  }

  def updateMatrix(mat: Array[Array[Int]]): Array[Array[Int]] = {
    val row = mat.length
    val col = mat.head.length
    var matrix = Array.fill(row, col)(Int.MaxValue-100000)

    for (i <- 0 until row) {
      for (j <- 0 until col) {
        if (mat(i)(j) == 0) matrix(i)(j) = 0
        else {
          if (i > 0) matrix(i)(j) = Math.min(matrix(i)(j), matrix(i - 1)(j) + 1)
          if (j > 0) matrix(i)(j) = Math.min(matrix(i)(j), matrix(i)(j - 1) + 1)
        }
      }
    }

    for (i <- (row - 1) to 0 by -1) {
      for (j <- (col - 1) to 0 by -1) {
        if (i < (row - 1)) matrix(i)(j) = Math.min(matrix(i)(j), matrix(i + 1)(j) + 1)
        if (j < (col - 1)) matrix(i)(j) = Math.min(matrix(i)(j), matrix(i)(j + 1) + 1)
      }
    }
    matrix
  }
}
