package com.saiful.lab18;

import com.saiful.lab18_exceptions.*;

public class InClassWord_ExceptionHandling_Student extends InClassWord_ExceptionHandling_Person {
  private String studentId;
  private String[] courseCodes;
  private float cgpa;

  public InClassWord_ExceptionHandling_Student(String firstName, String lastName, String nationalId, int age,
      String studentId, String[] courseCodes, float cgpa) throws InClassWord_ExceptionHandling_InvalidNameException,
      InClassWord_ExceptionHandling_InvalidAgeException, InClassWord_ExceptionHandling_InvalidCGPAException {
    super(firstName, lastName, nationalId, age);

    this.studentId = studentId;
    this.setCourseCodes(courseCodes);
    this.setCgpa(cgpa);
  }

  public String getFullName() {
    // Student ID First Name Last Name
    return this.studentId + " " + this.getFirstName() + " " + this.getLastName();
  }

  public String getStudentId() {
    return studentId;
  }

  public String[] getCourseCodes() {
    return courseCodes;
  }

  public float getCgpa() {
    return cgpa;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  public void setCourseCodes(String[] courseCodes) {
    this.courseCodes = courseCodes;
  }

  public void setCgpa(float cgpa) throws InClassWord_ExceptionHandling_InvalidCGPAException {
    if (cgpa < 0.0 || cgpa > 4.0) {
      throw new InClassWord_ExceptionHandling_InvalidCGPAException("CGPA is not within the range of 0.0 to 4.0");
    }
    this.cgpa = cgpa;
  }

  public String toString() {
    String representation = "";
    representation += "\nNational ID: " + super.nationalId;
    representation += "\nAge: " + this.getAge();
    representation += "\nStudent ID: " + this.studentId + "\n";
    representation += "Student CGPA: " + this.cgpa;

    return representation;
  }
}
