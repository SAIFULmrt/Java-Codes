package com.saiful.BonusAssignment;

import java.util.Arrays;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 3 Jan 2021
 */
public class Student extends Person {

  private final int MAX_COURSE = 5;
  private String id;
  private double cgpa;
  private Course[] course;
  @SuppressWarnings("unused")
  private int numberOfCourse = 0;

  public Student() {

  }

  public Student(String name, int age, String nationalId, String address, double cgpa, String id) {
    super(name, age, nationalId, address);
    this.cgpa = cgpa;
    this.id = id;

  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public double getCgpa() {
    return cgpa;
  }

  public void setCgpa(double cgpa) {
    this.cgpa = cgpa;
  }

  public Course[] getCourse() {
    return course;
  }

  public void setCourse(Course[] course) {
    this.course = course;
  }

  public int getNumberOfCourse() {
    return numberOfCourse = course.length;
  }

  public void setNumberOfCourse() {
    this.numberOfCourse = course.length;

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

  @Override
  public String toString() {
    return "Name: " + super.getName() + "\nAge: " + super.getAge() + "\nNational Id: " + super.getNationalId()
        + "\nAddress: " + getAddress() + "\ncgpa: " + getCgpa() + "\nCourses: " + Arrays.toString(course) + "\nid: "
        + id + "\nnumberOfCourses: " + getNumberOfCourse();
  }

}
