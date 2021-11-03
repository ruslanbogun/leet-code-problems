import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should
import problems.p733.floodFill

class Problem733Spec extends AnyFunSpec with should.Matchers {
  describe("Flood Fill") {
    it("image [[1,1,1],[1,1,0],[1,0,1]] 1,1 color = 2 should be [[2,2,2],[2,2,0],[2,0,1]]") {
      val image = Array(Array(1, 1, 1), Array(1, 1, 0), Array(1, 0, 1))
      val (x, y) = (1, 1)
      val color = 2
      floodFill(image, x, y, color) should be(Array(Array(2, 2, 2), Array(2, 2, 0), Array(2, 0, 1)))
    }
    it("image [[0,0,0],[0,1,1]] 1,1 color = 1 should be [[2,2,2],[2,2,0],[2,0,1]]") {
      val image = Array(Array(0, 0, 0), Array(0, 1, 1))
      val (x, y) = (1, 1)
      val color = 1
      floodFill(image, x, y, color) should be(Array(Array(0, 0, 0), Array(0, 1, 1)))
    }
  }
}
