package com.saiful.lab15;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 20 Dec 2020
 */
public class InClassWork_InheritanceExPerson {
  private String firstName;
  private String lastName;
  protected String nationalId;
  private int age;

  public InClassWork_InheritanceExPerson(String firstName, String lastName, String nationalId, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.nationalId = nationalId;
    this.age = age;

  }

  public String getFullName() {
    return this.firstName + " " + this.lastName;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int newAge) {
    this.age = newAge;
  }

  public String getNationalId() {
    return this.nationalId;
  }

  public String toString() {
    return this.getFullName();
  }

}