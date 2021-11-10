package problems

/**
 * 20. Valid Parentheses
 */
object p20 {
  def isValid(s: String): Boolean = {
    val p = Map("{" -> "}", "(" -> ")", "[" -> "]")

    def loop(left: String, right: String, res: Boolean): Boolean = {
      if (right.isEmpty) if(left.nonEmpty) false else res else {
        if (p.contains(left.takeRight(1)) && p(left.takeRight(1)) == right.take(1)) {
          val ns = left.dropRight(1) + right.drop(1)
          loop(ns.take(1), ns.tail, true)
        } else loop(left + right.take(1), right.drop(1), false)
      }
    }

    loop(s.take(1), s.tail, false)
  }
}
