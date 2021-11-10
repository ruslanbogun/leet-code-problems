package problems

/**
 * 36. Valid Sudoku
 */

object p36 {
  def checkRepetition(a: Array[Char]): Boolean = !a.groupBy(identity).exists { case (c, g) => g.length > 1 && c != '.' }

  def checkColumn(board: Array[Array[Char]], col: Int): Boolean = {
    var column = Array.ofDim[Char](board.length)
    for (i <- board.indices) {
      column(i) = board(i)(col)
    }
    checkRepetition(column)
  }

  def isValidSudoku(board: Array[Array[Char]]): Boolean = {
    val BOX_SIZE = 3
    val BOXES = board.length / BOX_SIZE * board.length / BOX_SIZE
    board.foldLeft(true) { case (acc, row) => acc & checkRepetition(row) } &
      board.head.indices.foldLeft(true) { case (acc, i) => acc & checkColumn(board, i) } &
      (0 until BOXES).foldLeft(true) { case (acc, i) =>
        var flat = Array.ofDim[Char](BOX_SIZE * BOX_SIZE)
        val x = i / (board.length / BOX_SIZE) * BOX_SIZE
        val y = i % (board.length / BOX_SIZE) * BOX_SIZE
        for (j <- 0 until BOX_SIZE * BOX_SIZE) {
          flat(j) = board(x + j / BOX_SIZE)(y + j % BOX_SIZE)
        }
        acc & checkRepetition(flat)
      }
  }
}
