package com.saiful.lab14;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 13 Dec 2020
 */
public class Course_1922071 {

  private String courseCode;
  private String courseTitle;
  private CourseTime_1922071 timing;
  
  public Course_1922071() {
    System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzz");
  }


  public Course_1922071(String courseCode, String courseTitle, CourseTime_1922071 timing) {
    this.courseCode = courseCode;
    this.courseTitle = courseTitle;
    this.timing = timing;
    System.out.println("AAAAAAAAAAAAAAAAAAAAAAA");
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

  public CourseTime_1922071 getTiming() {
    return this.timing;
  }

  public String toString() {
    return ("Course Code and Title: " + getCourseCodeAndCourseName() + "\n" + "Time: " + getTiming());
  }

  public static boolean isRelatedCourse(String course1, String course2) {
    if (course1.regionMatches(0, course2, 0, 3)) {
      return true;
    } else
      return false;

  }

}
