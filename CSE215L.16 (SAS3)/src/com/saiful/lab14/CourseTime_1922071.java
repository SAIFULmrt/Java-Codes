package com.saiful.lab14;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 13 Dec 2020
 */
public class CourseTime_1922071 {

  private String days;
  private String startTime;
  private String endTime;

  public CourseTime_1922071(String days, String startTime, String endTime) {
    this.days = days;
    this.startTime = startTime;
    this.endTime = endTime;
  }

  public String toString() {
    return this.days + this.startTime + " - " + this.endTime;
  }

}
