package com.saiful.theoryquiz4_q1;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 12 Jan 2021
 */
public class Driver {

  public static void main(String[] args) throws CloneNotSupportedException {
    Person person1 = new Person("123141");
    Person person2 = new Person("123341");
    if (person1.compareTo(person2) > 0) {
      // if (person1 > person2) { // q1(d)
      System.out.println("Person1 NID is greater than Person2");
    } else if (person1.compareTo(person2) < 0) {
      System.out.println("Person1 NID is less than Person2");
    } else {
      System.out.println("Person1 and Person2 have same NID");
    }
    if (person1.equals(person2)) {
      // if (person1 == person2) { // q1(e)
      System.out.println("Person1 and Person2 have same NID");
    } else {
      System.out.println("Person1 and Person2 dont have same NID");
    }
    Person person3 = (Person) person2.clone();
    if (person3.equals(person2)) {
      System.out.println("Person2 and Person3 have same NID");
    } else {
      System.out.println("Person2 and Person3 dont have same NID");
    }

  }

}