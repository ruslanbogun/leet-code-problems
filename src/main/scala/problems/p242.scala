package problems

object p242 {
  def isAnagram(s: String, t: String): Boolean = {
    s.groupBy(identity).view.mapValues(_.length).iterator sameElements t.groupBy(identity).view.mapValues(_.length)
  }
}
