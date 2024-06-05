package com.saiful.lab15;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 20 Dec 2020
 */
public class InClassWork_InheritanceExFaculty extends InClassWork_InheritanceExPerson {
  private String facultyId;
  @SuppressWarnings("unused")
  private String[] courseCodes;
  private String designation;

  public InClassWork_InheritanceExFaculty(String firstName, String lastName, String nationalId, int age,
      String facultyId, String[] courseCodes, String designation) {
    super(firstName, lastName, nationalId, age);

    this.facultyId = facultyId;
    this.courseCodes = courseCodes;
    this.designation = designation;
  }

  public String toString() {
    return super.toString() + "\nFaculty ID: " + this.facultyId + "\nNational ID: " + this.nationalId
        + "\nDesignation: " + this.designation;
  }

}
