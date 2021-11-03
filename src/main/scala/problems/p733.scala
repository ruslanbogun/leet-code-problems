package problems

import problems.p733.floodFill

/**
 * 733. Flood Fill
 */

object p733 {
  def floodFill(image: Array[Array[Int]], sr: Int, sc: Int, newColor: Int): Array[Array[Int]] = {
    def loop(i: Array[Array[Int]], x: Int, y: Int, c: Int, pc: Int): Array[Array[Int]] = {
      if (x < 0 || x >= i.length || y < 0 || y >= i.head.length || i(x)(y) != pc || i(x)(y) == c) {
        i
      } else {
        i(x)(y) = c
        loop(i, x - 1, y, c, pc)
        loop(i, x + 1, y, c, pc)
        loop(i, x, y - 1, c, pc)
        loop(i, x, y + 1, c, pc)
        i
      }
    }

    loop(image, sr, sc, newColor, image(sr)(sc))
  }

}