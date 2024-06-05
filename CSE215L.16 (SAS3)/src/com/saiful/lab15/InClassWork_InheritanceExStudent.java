package com.saiful.lab15;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 20 Dec 2020
 */
public class InClassWork_InheritanceExStudent extends InClassWork_InheritanceExPerson {
  private String studentId;
  @SuppressWarnings("unused")
  private String[] courseCodes;
  private float cgpa;

  public InClassWork_InheritanceExStudent(String firstName, String lastName, String nationalId, int age,
      String studentId, String[] courseCodes, float cgpa) {
    super(firstName, lastName, nationalId, age);
    // TODO Auto-generated constructor stub
    this.studentId = studentId;
    this.courseCodes = courseCodes;
    this.cgpa = cgpa;
  }

  public float getCgpa() {
    super.getNationalId();
    return this.cgpa;
  }

  public String toString() {
    /*
     * Name: <full name> Student ID: <student id> Student CGPA: <cgpa>
     */
    String representation = super.toString();
    representation += "\nNational ID: " + super.nationalId;
    representation += "\nAge: " + super.getAge();
    representation += "\nStudent ID: " + this.studentId + "\n";
    representation += "Student CGPA: " + this.cgpa;

    return representation;
  }

}
