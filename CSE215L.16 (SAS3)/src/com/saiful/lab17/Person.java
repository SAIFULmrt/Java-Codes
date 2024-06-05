package com.saiful.lab17;

public abstract class Person {
  private String firstName;
  private String lastName;
  protected String nationalId;
  private int age;

  public Person(String firstName, String lastName, String nationalId, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.nationalId = nationalId;
    this.age = age;
  }

  /*
   * public String getFullName() { return this.firstName + " " + this.lastName; }
   * 
   * abstract class banabo
   * 
   */

  public abstract String getFullName();

  public abstract String toString();

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getNationalId() {
    return this.nationalId;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int newAge) {
    this.age = newAge;
  }

  /*
   * public String toString() { return "Name: " + this.getFullName(); }
   * 
   * abstract class banabo
   */
}
