import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p190.reverseBits

class Problem190Spec extends AnyFunSpec with Matchers {
  describe("Reverse Bits") {
    it("43261596 -> 964176192") {
      val x = 43261596
      reverseBits(x) should be(964176192)
    }
  }
}
