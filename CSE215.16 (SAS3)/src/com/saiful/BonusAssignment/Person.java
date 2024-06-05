package com.saiful.BonusAssignment;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 3 Jan 2021
 */
public class Person {
  private String name;
  private int age;
  private String nationalId;
  private String address;

  public Person() {
  }

  public Person(String name, int age, String nationalId, String address) {
    this.name = name;
    this.age = age;
    this.nationalId = nationalId;
    this.address = address;

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getNationalId() {
    return nationalId;
  }

  public void setNationalId(String nationalId) {
    this.nationalId = nationalId;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String toString() {
    return "Name: " + name + "\nAge: " + age + "\nNational ID: " + nationalId + "\nAddress: " + address;
  }

}
