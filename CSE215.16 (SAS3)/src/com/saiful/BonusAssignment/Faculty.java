package com.saiful.BonusAssignment;

import java.util.Arrays;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 3 Jan 2021
 */
public class Faculty extends Person {

  private final int MAX_COURSE = 5;
  private Course[] course;
  @SuppressWarnings("unused")
  private int numberOfCourses = 0;
  private String initial;

  public Faculty() {

  }

  public Faculty(String name, int age, String nationalId, String address, Course[] course, String initial) {
    super(name, age, nationalId, address);
    this.course = course;
    this.initial = initial;
  }

  public Course[] getCourse() {
    return course;
  }

  public void setCourse(Course[] course) {
    this.course = course;
  }

  public int getNumberOfCourse() {
    return numberOfCourses = course.length;
  }

  public void setNumberOfCourse() {
    this.numberOfCourses = course.length;
  }

  public String getInitial() {
    return initial;
  }

  public void setInitial(String initial) {
    this.initial = initial;
  }

  public void addCourse(Course[] newCourse) {
    if (newCourse.length <= MAX_COURSE) {
      this.course = newCourse;
    } else {
      System.out.println("you can not take anymore courses!");
    }
  }

  public void printCourses() {

    System.out.println(Arrays.deepToString(course));

  }

  public String toString() {
    return "Name: " + super.getName() + "\nAge: " + super.getAge() + "\nNational ID: " + super.getNationalId()
        + "\nAddress: " + getAddress() + "\nCourse Name: " + Arrays.deepToString(course) + "\nNumber of courses: "
        + getNumberOfCourse() + "\nInitial: " + initial;
  }

}
