import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p198.rob

class Problem198Spec extends AnyFunSpec with Matchers {
  describe("House Robber") {
    it("[1,2,3,1]") {
      val nums = Array(1, 2, 3, 1)
      rob(nums)
    }
  }
}
