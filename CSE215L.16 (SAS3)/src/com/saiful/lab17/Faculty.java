package com.saiful.lab17;

import java.util.Date;

public class Faculty extends Person {
  private String facultyId;
  private String[] courseCodes;
  private String designation;
  private Date joiningDate;

  public Faculty(String firstName, String lastName, String nationalId, int age, String facultyId, String[] courseCodes,
      String designation, Date joiningDate) {
    super(firstName, lastName, nationalId, age);

    this.facultyId = facultyId;
    this.courseCodes = courseCodes;
    this.designation = designation;
    this.joiningDate = joiningDate;
  }

  public String getFullName() {
    return this.getFirstName() + " " + this.getLastName() + " " + this.facultyId;
  }

  public String[] getCourseCodes() {
    return courseCodes;
  }

  public String getDesignation() {
    return designation;
  }

  public Date getJoiningDate() {
    return joiningDate;
  }

  public void setCourseCodes(String[] courseCodes) {
    this.courseCodes = courseCodes;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public void setJoiningDate(Date joiningDate) {
    this.joiningDate = joiningDate;
  }

  public String toString() {
    return "\nFaculty ID: " + this.facultyId + "\nNational ID: " + this.nationalId + "\nDesignation: "
        + this.designation;
  }
}
