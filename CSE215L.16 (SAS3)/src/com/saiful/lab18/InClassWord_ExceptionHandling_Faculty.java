package com.saiful.lab18;

import java.util.Date;

import com.saiful.lab18_exceptions.*;

public class InClassWord_ExceptionHandling_Faculty extends InClassWord_ExceptionHandling_Person {
  private String facultyId;
  private String[] courseCodes;
  private String designation;
  private Date joiningDate;

  public InClassWord_ExceptionHandling_Faculty(String firstName, String lastName, String nationalId, int age,
      String facultyId, String[] courseCodes, String designation, Date joiningDate)
      throws InClassWord_ExceptionHandling_InvalidNameException, InClassWord_ExceptionHandling_InvalidAgeException,
      InClassWord_ExceptionHandling_InvalidCourseCodeException {
    super(firstName, lastName, nationalId, age);

    this.facultyId = facultyId;
    this.setCourseCodes(courseCodes);
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

  public void setCourseCodes(String[] courseCodes) throws InClassWord_ExceptionHandling_InvalidCourseCodeException {
    String[] validPrefix = { "MAT", "CSE", "ENG", "PHY", "CHE", "BIO" };

    boolean validCourses = true;

    for (String courseCode : courseCodes) {
      boolean isValidCoursePrefix = false;
      String substringPrefix = courseCode.substring(0, 3);

      for (String prefix : validPrefix) {
        if (prefix.equals(substringPrefix)) {
          isValidCoursePrefix = true;
          break;
        }
      }

      validCourses = validCourses && isValidCoursePrefix;
    }
    if (!validCourses) {
      throw new InClassWord_ExceptionHandling_InvalidCourseCodeException(
          "List contains a course" + " that does not match with the valid prefixes");
    }

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
