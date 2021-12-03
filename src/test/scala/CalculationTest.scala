import divisionAndFabonacci.Calculation
import org.scalatest.funsuite.AnyFunSuite
class CalculationTest extends AnyFunSuite  {
  var Calculation_object = new Calculation()

  //================== Division Test ===================
  test("Test to check division of zero"){
    val num1 = 0
    val num2 = 2
    val res = 0
    assert(Calculation_object.divisionOf(num1, num2)==res)
  }

  test("Test to check division by zero") {
    assertThrows[ArithmeticException](Calculation_object.divisionOf(128, 0))
  }

  //=================== Fibonacci Test ===================

  test("Test to check fibonacci of zero"){
    val num = 0
    val res = 0
    assert(Calculation_object.fibonacciOf(num)==res)
  }

  test("Test to check fibonacci "){
    val num = 9
    val res = 34
    assert(Calculation_object.fibonacciOf(num)==res)
  }

}