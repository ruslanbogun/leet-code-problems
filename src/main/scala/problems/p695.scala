package problems

/**
 * 695. Max Area of Island
 */

object p695 {
  def maxAreaOfIsland(grid: Array[Array[Int]]): Int = {
    val WATER = 0
    val LAND = 1
    val ISLAND = 2

    var maxArea = 0

    def checkLand(x: Int, y: Int) = !(x < 0 || x >= grid.length || y < 0 || y >= grid.head.length || grid(x)(y) == WATER || grid(x)(y) == ISLAND)

    def countIslandArea(x: Int, y: Int, acc: Int): Int = {
      if (checkLand(x, y)) {
        grid(x)(y) = ISLAND
        countIslandArea(x + 1, y, acc) +
          countIslandArea(x - 1, y, acc) +
          countIslandArea(x, y + 1, acc) +
          countIslandArea(x, y - 1, acc) + 1
      } else 0
    }

    for (x <- 0 until grid.length; y <- 0 until grid.head.length) {
      if (checkLand(x, y)) {
        maxArea = Math.max(countIslandArea(x, y, 0), maxArea)
      }
    }
    maxArea
  }
}
