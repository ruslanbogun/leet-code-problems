import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p383.canConstruct

class Problem383Spec extends AnyFunSpec with Matchers {
  describe("Ransom Note") {
    it(" ransomNote = 'a', magazine = 'b' should be false ") {
      val ransomNote = "a"
      val magazine = "b"
      canConstruct(ransomNote, magazine) should be(false)
    }

    it("ransomNote = \"aa\", magazine = \"ab\" should be false") {
      val ransomNote = "aa"
      val magazine = "ab"
      canConstruct(ransomNote, magazine) should be(false)
    }

    it("ransomNote = \"aa\", magazine = \"aab\" should be true") {
      val ransomNote = "aa"
      val magazine = "aab"
      canConstruct(ransomNote, magazine) should be(true)
    }
  }
}
