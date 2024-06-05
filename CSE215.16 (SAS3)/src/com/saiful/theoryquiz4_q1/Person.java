package com.saiful.theoryquiz4_q1;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 12 Jan 2021
 */
public class Person implements Comparable<Person>, Cloneable {
  private String NID;

  public Person(String NID) {
    this.NID = NID;
  }

  public String getNID() {
    return NID;
  }

  // q1(a)
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  // q1(b)
  public int compareTo(Person anotherPerson) {
    int firstPersonNid = Integer.parseInt(this.getNID());
    int secondPersonNid = Integer.parseInt(anotherPerson.getNID());

    if (firstPersonNid < secondPersonNid) {
      return -1;
    } else if (firstPersonNid == secondPersonNid) {
      return 0;
    }
    return 1;
  }

  // q1(c)
  public boolean equals(Person anotherPerson) {
    String firstPersonNid = this.getNID();
    String secondPersonNid = anotherPerson.getNID();

    if (firstPersonNid == secondPersonNid)
      return true;
    else
      return false;
  }

}