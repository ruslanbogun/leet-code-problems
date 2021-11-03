package ReverseString

/**
 * 344. Reverse String
 *
 * Write a function that reverses a string. The input string is given as an array of characters s.
 */
object Solution {
  //  def reverseString(s: Array[Char]): Unit = {
  //    var i = 0
  //    var j = s.length - 1
  //    while (i < j) {
  //      val temp = s(i)
  //      s(i) = s(j)
  //      s(j) = temp
  //      i += 1
  //      j -= 1
  //    }
  //  }
  def reverseString(s: Array[Char]): Unit = {
    for (i <- 0 until s.length / 2) {
      val temp = s(i)
      s(i) = s(s.length - 1 - i)
      s(s.length - 1 - i) = temp
    }
  }
}