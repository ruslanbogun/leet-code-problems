package problems

/**
 * 200. Number of Islands
 *
 * 0 - water
 * 1 - land
 * 2 - island
 */

object p200 {
  def numIslands(grid: Array[Array[Char]]): Int = {
    val WATER = '0'
    val LAND = '1'
    val ISLAND = '2'
    var counter = 0

    def checkLend(x: Int, y: Int): Boolean = !(x < 0 || y < 0 || x >= grid.length || y >= grid.head.length || grid(x)(y) == ISLAND || grid(x)(y) == WATER)

    def findIsland(x: Int, y: Int): Unit = {
      if (checkLend(x, y)) {
        grid(x)(y) = ISLAND
        findIsland(x + 1, y)
        findIsland(x - 1, y)
        findIsland(x, y + 1)
        findIsland(x, y - 1)
      }
    }

    for (x <- 0 until grid.length; y <- 0 until grid.head.length) {
      if (grid(x)(y) == LAND) {
        counter += 1
        findIsland(x, y)
      }
    }
    counter
  }
}
