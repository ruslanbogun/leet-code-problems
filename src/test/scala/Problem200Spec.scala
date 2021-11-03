import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should
import problems.p200.numIslands

class Problem200Spec extends AnyFunSpec with should.Matchers {
  describe("Number of Islands") {
    it("only one island") {
      val grid = Array(
        Array('1', '1', '1', '1', '0'),
        Array('1', '1', '0', '1', '0'),
        Array('1', '1', '0', '0', '0'),
        Array('0', '0', '0', '0', '0'))

      numIslands(grid) should be(1)
    }

    it("3 island") {
      val grid = Array(
        Array('1', '1', '0', '0', '0'),
        Array('1', '1', '0', '0', '0'),
        Array('0', '0', '1', '0', '0'),
        Array('0', '0', '0', '1', '1')
      )

      numIslands(grid) should be(3)
    }
  }
}
