import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p77.combine

/**
 * 77. Combinations
 *
 * Given two integers n and k, return all possible combinations of k numbers out of the range [1, n].
 * You may return the answer in any order.
 */
class Problem77Spec extends AnyFunSpec with Matchers {
  describe("Combinations") {
    it("n = 4, k = 2") {
      combine(4, 2) should contain theSameElementsAs (List(List(2, 4), List(3, 4), List(2, 3), List(1, 2), List(1, 3), List(1, 4)))
    }
  }
}
