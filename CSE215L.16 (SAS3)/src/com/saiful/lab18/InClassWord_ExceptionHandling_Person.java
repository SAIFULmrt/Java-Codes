package com.saiful.lab18;

import com.saiful.lab18_exceptions.*;

/*
 * Comparable
 * Cloneable
 */

public class InClassWord_ExceptionHandling_Person
    implements InClassWord_ExceptionHandling_IncrementAge, Comparable<InClassWord_ExceptionHandling_Person>, Cloneable {
  private String firstName;
  private String lastName;
  protected String nationalId;
  private int age;

  public InClassWord_ExceptionHandling_Person(String firstName, String lastName, String nationalId, int age)
      throws InClassWord_ExceptionHandling_InvalidNameException, InClassWord_ExceptionHandling_InvalidAgeException {
    this.setFirstName(firstName);
    this.setLastName(lastName);
    this.nationalId = nationalId;
    this.setAge(age);
  }

  public void addOneYearToAge() throws InClassWord_ExceptionHandling_InvalidAgeException {
    this.setAge(this.getAge() + 1);
  }

  public int compareTo(InClassWord_ExceptionHandling_Person anotherObject) {
    if (anotherObject instanceof InClassWord_ExceptionHandling_Student
        && this instanceof InClassWord_ExceptionHandling_Student) {
      double firstStudentCgpa = ((InClassWord_ExceptionHandling_Student) this).getCgpa();
      double secondStudentCgpa = ((InClassWord_ExceptionHandling_Student) anotherObject).getCgpa();

      if (firstStudentCgpa < secondStudentCgpa) {
        return -1;
      } else if (firstStudentCgpa == secondStudentCgpa) {
        return 0;
      }

      return 1;
    } else if (anotherObject instanceof InClassWord_ExceptionHandling_Faculty
        && this instanceof InClassWord_ExceptionHandling_Faculty) {
      // Lecturer, Senior Lecturer, Professor
      // We assume that the designations should be lexicographically ordered
      String firstFacultyDesignation = ((InClassWord_ExceptionHandling_Faculty) this).getDesignation();
      String secondFacultyDesignation = ((InClassWord_ExceptionHandling_Faculty) anotherObject).getDesignation();

      int resultOfComparison = firstFacultyDesignation.compareTo(secondFacultyDesignation);

      if (resultOfComparison < 0) {
        return -1;
      } else if (resultOfComparison == 0) {
        return 0;
      }

      return 1;
    }

    return -100; // return this if and only if the two objects are not of the same type
  }

  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

//  public abstract String getFullName();
//  public abstract String toString();   

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) throws InClassWord_ExceptionHandling_InvalidNameException {
    if (firstName.length() < 3) {
      throw new InClassWord_ExceptionHandling_InvalidNameException(
          "The length of name should be 3, got " + firstName.length());
    }
    this.firstName = firstName;
  }

  public void setLastName(String lastName) throws InClassWord_ExceptionHandling_InvalidNameException {
    if (lastName.length() < 3) {
      throw new InClassWord_ExceptionHandling_InvalidNameException(
          "The length of name should be 3, got " + lastName.length());
    }
    this.lastName = lastName;
  }

  public String getLastName() {
    return lastName;
  }

  @Override
  public String toString() {
    return "Person [firstName=" + firstName + ", lastName=" + lastName + ", nationalId=" + nationalId + ", age=" + age
        + "]";
  }

  public String getNationalId() {
    return this.nationalId;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int newAge) throws InClassWord_ExceptionHandling_InvalidAgeException {
    if (newAge < 18) {
      throw new InClassWord_ExceptionHandling_InvalidAgeException("Age must be equal or greater than 18");
    }
    this.age = newAge;
  }
}
