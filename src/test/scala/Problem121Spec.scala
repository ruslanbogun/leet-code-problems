import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p121.maxProfit

class Problem121Spec extends AnyFunSpec with Matchers {
  describe("Best Time to Buy and Sell Stock") {
    it("[7,1,5,3,6,4] best profit 5") {
      val prises = Array(7, 1, 5, 3, 6, 4)
      maxProfit(prises) should be(5)
    }

    it("[7,6,4,3,1] best profit 0") {
      val prises = Array(7, 6, 4, 3, 1)
      maxProfit(prises) should be(0)
    }
  }
}
