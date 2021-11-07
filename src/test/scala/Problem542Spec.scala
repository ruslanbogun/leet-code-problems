import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p542.updateMatrix

class Problem542Spec extends AnyFunSpec with Matchers {
  describe("01 Matrix") {
    it("mat = [[0,0,0],[0,1,0],[0,0,0]]") {
      val mat = Array(
        Array(0, 0, 0),
        Array(0, 1, 0),
        Array(0, 0, 0))

      updateMatrix(mat) should be(Array(Array(0, 0, 0), Array(0, 1, 0), Array(0, 0, 0)))
    }
    it("[[0,0,0],[0,1,0],[1,1,1]]") {
      val mat = Array(
        Array(0, 0, 0),
        Array(0, 1, 0),
        Array(1, 1, 1)
      )
      updateMatrix(mat) should be(Array(Array(0, 0, 0), Array(0, 1, 0), Array(1, 2, 1)))
    }
    it("Test 1") {
      val mat = Array(
        Array(0, 0, 1, 0, 1, 1, 1, 0, 1, 1),
        Array(1, 1, 1, 1, 0, 1, 1, 1, 1, 1),
        Array(1, 1, 1, 1, 1, 0, 0, 0, 1, 1),
        Array(1, 0, 1, 0, 1, 1, 1, 0, 1, 1),
        Array(0, 0, 1, 1, 1, 0, 1, 1, 1, 1),
        Array(1, 0, 1, 1, 1, 1, 1, 1, 1, 1),
        Array(1, 1, 1, 1, 0, 1, 0, 1, 0, 1),
        Array(0, 1, 0, 0, 0, 1, 0, 0, 1, 1),
        Array(1, 1, 1, 0, 1, 1, 0, 1, 0, 1),
        Array(1, 0, 1, 1, 1, 0, 1, 1, 1, 0)
      )
      val out = Array(
        Array(0, 0, 1, 0, 1, 2, 1, 0, 1, 2),
        Array(1, 1, 2, 1, 0, 1, 1, 1, 2, 3),
        Array(2, 1, 2, 1, 1, 0, 0, 0, 1, 2),
        Array(1, 0, 1, 0, 1, 1, 1, 0, 1, 2),
        Array(0, 0, 1, 1, 1, 0, 1, 1, 2, 3),
        Array(1, 0, 1, 2, 1, 1, 1, 2, 1, 2),
        Array(1, 1, 1, 1, 0, 1, 0, 1, 0, 1),
        Array(0, 1, 0, 0, 0, 1, 0, 0, 1, 2),
        Array(1, 1, 1, 0, 1, 1, 0, 1, 0, 1),
        Array(1, 0, 1, 1, 1, 0, 1, 2, 1, 0)
      )
      updateMatrix(mat) should be(out)
    }
  }
}
