package com.saiful.lab13;

import java.util.*;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 10 Dec 2020
 */

// class
public class Faculty_1922071 {
  // class data field
  private String firstName;
  private String lastName;
  private String id;
  private String[] courses;
  private String designation;
  private Date joiningDate;

  // 1st constructor
  public Faculty_1922071(String firstName, String lastName, String id, String designation, Date joiningDate) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.id = id;
    this.designation = designation;
    this.joiningDate = joiningDate;
  }

  // 2nd constructor
  public Faculty_1922071(String firstName, String lastName, String id, String designation, Date joiningDate,
      String[] courses) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.id = id;
    this.designation = designation;
    this.joiningDate = joiningDate;
    this.courses = courses;
  }

  public String getFullName() {
    return this.firstName + " " + this.lastName;
  }

  public String getDesignation() {
    return this.designation;
  }

  public Date getJoiningDate() {
    return this.joiningDate;
  }

  public String[] getCourses() {
    return this.courses;
  }

  public void setCourses(String[] newCourse) {
    this.courses = newCourse;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public String toString() {
    return ("Full Name: " + getFullName() + "\n" + "ID: " + this.id + "\n" + "Designation: " + getDesignation() + "\n"
        + "Joining Date: " + getJoiningDate() + "\n" + "Courses: " + Arrays.toString(getCourses()) + "\n");
  }

}