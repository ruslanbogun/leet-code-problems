import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p120.minimumTotal

class Problem120Spec extends AnyFunSpec with Matchers {
  describe("Triangle") {
    it("[[2],[3,4],[6,5,7],[4,1,8,3]]") {
      val triangle = List(List(2), List(3, 4), List(6, 5, 7), List(4, 1, 8, 3))
      minimumTotal(triangle) should be(11)
    }

    it("[[-1],[2,3],[1,-1,-3]]") {
      val triangle = List(List(-1), List(2, 3), List(1, -1, -3))
      minimumTotal(triangle) should be(-1)
    }
  }
}
