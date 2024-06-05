package com.saiful.quiz4;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 6 Jan 2021
 */
public class Address_1922071 {

  final String houseNumber;
  final String roadnumber;
  final String location;

  public Address_1922071(String houseNumber, String roadnumber, String location) {
    this.houseNumber = houseNumber;
    this.roadnumber = roadnumber;
    this.location = location;
  }

  @Override
  public String toString() {
    return "House Number: " + houseNumber + ", Road Number: " + roadnumber + ", Location: " + location;
  }

}
