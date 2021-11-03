import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p36._

class Problem36Spec extends AnyFunSpec with Matchers {
  describe("Valid Sudoku") {
    it("Check repetition should be true") {
      val col = Array('5', '3', '.', '.', '7', '.', '.', '.', '.')
      checkRepetition(col) should be(true)
    }

    it("Check repetition should be false") {
      val col = Array('5', '3', '.', '.', '7', '.', '7', '.', '.')
      checkRepetition(col) should be(false)
    }

    it("Example 1") {
      val board =
        Array(
          Array('5', '3', '.', '.', '7', '.', '.', '.', '.'),
          Array('6', '.', '.', '1', '9', '5', '.', '.', '.'),
          Array('.', '9', '8', '.', '.', '.', '.', '6', '.'),
          Array('8', '.', '.', '.', '6', '.', '.', '.', '3'),
          Array('4', '.', '.', '8', '.', '3', '.', '.', '1'),
          Array('7', '.', '.', '.', '2', '.', '.', '.', '6'),
          Array('.', '6', '.', '.', '.', '.', '2', '8', '.'),
          Array('.', '.', '.', '4', '1', '9', '.', '.', '5'),
          Array('.', '.', '.', '.', '8', '.', '.', '7', '9'))

      isValidSudoku(board) should be(true)
    }
  }
}
