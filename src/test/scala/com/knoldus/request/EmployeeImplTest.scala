package com.knoldus.request

import com.knoldus.models.Employee
import com.knoldus.validator.EmployeeValidator
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.funsuite.AnyFunSuite

class EmployeeImplTest extends AnyFunSuite{
  val employeeValidator = mock[EmployeeValidator]
  val Muskan:Employee = new Employee("Muskan","Jain",22,12000,"Intern","Knoldus","muskan.jain@gmail.com")
  val userImpl = new EmployeeImpl(employeeValidator)

  test("User can be created"){
    when(employeeValidator.employeeIsValid(Muskan)) thenReturn(true)
    val result = userImpl.createEmployee(Muskan)
    assert(result.isDefined)
  }
  test("User can not be created"){
    when(employeeValidator.employeeIsValid(Muskan)) thenReturn(false)
    val result = userImpl.createEmployee(Muskan)
    assert(result.isEmpty)
  }
}
