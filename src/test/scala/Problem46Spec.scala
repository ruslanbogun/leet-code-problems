import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p46.permute

class Problem46Spec extends AnyFunSpec with Matchers {
  describe("Permutations") {
    it("[1,2,3]") {
      permute(Array(1, 2, 3)) should be(List(List()))
    }
  }
}
