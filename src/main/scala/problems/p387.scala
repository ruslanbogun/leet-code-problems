package problems

import scala.collection.mutable

object p387 {
  def firstUniqChar(s: String): Int = {
    s.indexWhere(c => s.groupBy(identity)(c).length == 1)
  }
}
