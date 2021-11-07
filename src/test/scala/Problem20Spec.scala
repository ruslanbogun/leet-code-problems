import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p20.isValid

class Problem20Spec extends AnyFunSpec with Matchers {
  describe("Valid Parentheses") {
    it("\"()\"") {
      val s = "()"
      isValid(s) should be(true)
    }

    it("\"()[]{}\"") {
      val s = "()[]{}"
      isValid(s) should be(true)
    }

    it("(]"){
      val s= "(]"
      isValid(s) should be (false)
    }

    it("{[]}"){
      val s= "{[]}"
      isValid(s) should be (true)
    }

    it("["){
      val s= "["
      isValid(s) should be (false)
    }

    it(")(){}"){
      val s= ")(){}"
      isValid(s) should be (false)
    }
  }
}
