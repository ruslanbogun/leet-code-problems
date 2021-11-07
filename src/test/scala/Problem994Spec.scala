import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p994.orangesRotting

class Problem994Spec extends AnyFunSpec with Matchers {
  describe("Rotting Oranges") {
    it("[[2,1,1],[1,1,0],[0,1,1]] should be 4") {
      val grid = Array(
        Array(2, 1, 1),
        Array(1, 1, 0),
        Array(0, 1, 1))

      orangesRotting(grid) should be(4)
    }
  }
}
