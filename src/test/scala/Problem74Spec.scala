import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p74.searchMatrix

class Problem74Spec extends AnyFunSpec with Matchers {
  describe("Search a 2D Matrix") {
    it("matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3 should be true") {
      val matrix = Array(
        Array(1, 3, 5, 7),
        Array(10, 11, 16, 20),
        Array(23, 30, 34, 60)
      )

      searchMatrix(matrix,3) should be (true)
    }
  }
}
