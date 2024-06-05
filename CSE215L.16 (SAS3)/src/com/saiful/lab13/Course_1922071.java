package com.saiful.lab13;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 10 Dec 2020
 */

//class
public class Course_1922071 {
  // class data field
  private String courseCode;
  private String courseTitle;
  private String facultyName;

  // 1st constructor
  public Course_1922071(String courseCode, String courseTitle, String facultyName) {
    this.courseCode = courseCode;
    this.courseTitle = courseTitle;
    this.facultyName = facultyName;
  }

  public String getCourseCodeAndCourseName() {
    return this.courseCode + ": " + this.courseTitle;
  }

  public String getCourseName() {
    return this.courseTitle;
  }

  public String getCourseCode() {
    return this.courseCode;
  }

  public String getFacultyName() {
    return this.facultyName;
  }

  public String toString() {
    return "Course Code and Title: " + getCourseCodeAndCourseName() + "\n" + "Faculty Name: " + getFacultyName();

  }

}
