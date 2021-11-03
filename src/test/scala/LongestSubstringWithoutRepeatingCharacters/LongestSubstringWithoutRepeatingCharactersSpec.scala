package LongestSubstringWithoutRepeatingCharacters

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class LongestSubstringWithoutRepeatingCharactersSpec extends AnyFlatSpec with should.Matchers {
  "Longest Substring Without Repeating Characters" should
    "abcabcbb" in {
    Solution.lengthOfLongestSubstring("abcabcbb") should be(3)
  }
  it should "bbbbb" in {
    Solution.lengthOfLongestSubstring("bbbbb") should be(1)
  }
  it should "pwwkew" in {
    Solution.lengthOfLongestSubstring("pwwkew") should be(3)
  }

  it should "" in {
    Solution.lengthOfLongestSubstring("") should be(0)
  }

  it should "aab" in {
    Solution.lengthOfLongestSubstring("aab") should be(2)
  }

  it should "dvdf" in {
    Solution.lengthOfLongestSubstring("dvdf") should be(3)
  }
}
