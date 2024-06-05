package com.saiful.lab17;

public class Student extends Person {
  private String studentId;
  private String[] courseCodes;
  private float cgpa;

  public Student(String firstName, String lastName, String nationalId, int age, String studentId, String[] courseCodes,
      float cgpa) {
    super(firstName, lastName, nationalId, age);

    this.studentId = studentId;
    this.courseCodes = courseCodes;
    this.cgpa = cgpa;
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

  public void setCgpa(float cgpa) {
    this.cgpa = cgpa;
  }

  public String getFullName() {
    return this.studentId + " " + this.getLastName() + " " + this.getFirstName();
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
