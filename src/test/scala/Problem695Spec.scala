import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p695.maxAreaOfIsland

class Problem695Spec extends AnyFunSpec with Matchers {
  describe("Max Area of Island") {
    it("6 sqr") {
      val grid = Array(
        Array(0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
        Array(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
        Array(0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0),
        Array(0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0),
        Array(0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0),
        Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0),
        Array(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
        Array(0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0))

      maxAreaOfIsland(grid) should be(6)
    }

    it("0 sqr") {
      val grid = Array(Array(0, 0, 0, 0, 0, 0, 0, 0))

      maxAreaOfIsland(grid) should be(0)
    }
  }
}
