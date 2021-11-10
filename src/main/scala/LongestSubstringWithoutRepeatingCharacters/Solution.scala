package LongestSubstringWithoutRepeatingCharacters

/**
 * 3. Longest Substring Without Repeating Characters
 *
 * Given a string s, find the length of the longest substring without repeating characters.
 */

object Solution {
  def lengthOfLongestSubstring(s: String): Int = {
    def loop(s: String, ns: String, acc: Int): Int = {
      if (s.nonEmpty) {
        if (ns.contains(s.head)) {
          loop(s.tail, ns.dropWhile(_ != s.head).tail + s.head, Math.max(ns.length, acc))
        } else {
          loop(s.tail, ns + s.head, acc)
        }
      } else Math.max(ns.length, acc)
    }

    loop(s, "", 0)
  }
}

object Main extends App {
  //val s = "abcabcbb"
  //val s = "bbbbb"
  //val s = "pwwkew"
  //val s = ""
  //val s = "aab"
  val s = "dvdf"

  println(Solution.lengthOfLongestSubstring(s))
}
