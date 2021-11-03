package problems

/**
 * 566. Reshape the Matrix
 */

object p566 {
  def _matrixReshape(mat: Array[Array[Int]], r: Int, c: Int): Array[Array[Int]] = {
    val matrix = Array.ofDim[Int](r, c)
    val col = mat.head.length
    val row = mat.length

    if (col * row == r * c) {
      for (x <- 0 until row) {
        for (y <- 0 until col) {
          matrix((col * x + y) / c)((col * x + y) % c) = mat(x)(y)
        }
      }
      matrix
    } else mat
  }

  def matrixReshape(mat: Array[Array[Int]], r: Int, c: Int): Array[Array[Int]] = {
    val matrix = Array.ofDim[Int](r, c)
    val col = mat.head.length
    val row = mat.length

    if (col * row == r * c) {
      for (x <- 0 until row * col) {
        matrix(x / c)(x % c) = mat(x / col)(x % col)
      }
      matrix
    } else mat
  }
}
