import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p118.generate

class Problem118Spec extends AnyFunSpec with Matchers {
  describe("Pascal's Triangle") {
    it("size 5") {
      val triangle = List(
        List(1),
        List(1, 1),
        List(1, 2, 1),
        List(1, 3, 3, 1),
        List(1, 4, 6, 4, 1))
      generate(5) should be(triangle)
    }
  }

}
