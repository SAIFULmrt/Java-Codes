package com.saiful.BonusAssignment;

import java.util.Arrays;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 3 Jan 2021
 */
public class PermanentFaculty extends Faculty {
  private final double BASIC_SALARY = 4000.00;

  public PermanentFaculty(String name, int age, String nationalId, String address, Course[] course,
      int numberOfCourse) {
    super(name, age, nationalId, address, course, "");
    getSalary();
  }

  public double getSalary() {
    double newSalary = 0.0;
    for (int i = 0; i < super.getNumberOfCourse(); i++) {
      newSalary = newSalary + BASIC_SALARY * 5 / 100;
    }
    return newSalary + BASIC_SALARY;
  }

  public String toString() {
    return "Name: " + super.getName() + "\nAge: " + super.getAge() + "\nNational Id: " + super.getNationalId()
        + "\nAddress: " + getAddress() + "\nCourses: " + Arrays.deepToString(super.getCourse())
        + "\nNumber of Courses: " + super.getNumberOfCourse() + "\nSalary: " + getSalary();
  }
}
