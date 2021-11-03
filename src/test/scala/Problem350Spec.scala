import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should
import problems.p350.intersect

class Problem350Spec extends AnyFunSpec with should.Matchers {
  describe("Intersection of Two Arrays") {
    it("[1,2,2,1] and [2,2] intersection [2,2]") {
      intersect(Array(1, 2, 2, 1), Array(2, 2)) should be(Array(2, 2))
    }
    it("[4,9,5] and [9,4,9,8,4] should [4,9]"){
      intersect(Array(4,9,5), Array(9,4,9,8,4)) should be(Array(4, 9))
    }
  }
}
