package problems

/**
 * 190. Reverse Bits
 *
 * Reverse bits of a given 32 bits unsigned integer.
 */

object p190 {
  def reverseBits(x: Int): Int = {
    var res = 0
    for (i <- 0 to 31) {
      res = res << 1 | (x >> i & 1)
    }
    res
  }
}
