import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p566.matrixReshape

class Problem566Spec extends AnyFunSpec with Matchers {
  describe("Reshape the Matrix") {
    it("matrix 4x3 to 3x4") {
      val mat = Array(
        Array(1, 2, 3),
        Array(4, 5, 6),
        Array(7, 8, 9),
        Array(10, 11, 12)
      )
      val out = Array(
        Array(1, 2, 3, 4),
        Array(5, 6, 7, 8),
        Array(9, 10, 11, 12)
      )
      matrixReshape(mat, 3, 4) should be(out)
    }

    it("matrix [[1,2],[3,4]] to [[1,2,3,4]]") {
      val mat = Array(Array(1, 2), Array(3, 4))
      val out = Array(Array(1, 2, 3, 4))
      matrixReshape(mat, 1, 4) should be(out)
    }
  }

}
