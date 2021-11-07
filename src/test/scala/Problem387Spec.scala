import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p387.firstUniqChar

class Problem387Spec extends AnyFunSpec with Matchers {
  describe("First Unique Character in a String") {
    it(" 'leetcode' index 0") {
      val s = "leetcode"
      firstUniqChar(s) should be(0)
    }
    it(" 'loveleetcode' index 2") {
      val s = "loveleetcode"
      firstUniqChar(s) should be(2)
    }

    it(" 'aabb' index -1") {
      val s = "aabb"
      firstUniqChar(s) should be(-1)
    }
  }
}
