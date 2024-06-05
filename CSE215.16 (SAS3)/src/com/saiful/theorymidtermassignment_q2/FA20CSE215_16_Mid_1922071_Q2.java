package com.saiful.theorymidtermassignment_q2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 25 Dec 2020
 */
public class FA20CSE215_16_Mid_1922071_Q2 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    Person[] obj = new Person[20];
    for (int i = 0; i < obj.length; i++) {

      obj[i] = new Person();

    }
    for (int i = 0; i < obj.length; i++) {
      System.out.println(obj[i].toString());
    }

    System.out.println("\n\nCreating a new Person to call Parametarized constructos and swap this obj with index 7\n");

    System.out.println("Enter Name : ");
    String name = input.nextLine().toUpperCase();
    System.out.println("");
    System.out.println("Enter Father's Name : ");
    String fName = input.nextLine().toUpperCase();
    System.out.println("");
    System.out.println("Enter Mother's Name : ");
    String mName = input.nextLine().toUpperCase();

    System.out.println("");
    System.out.println("Date Of Birth ");
    System.out.println("-------------");
    System.out.println("");
    System.out.println("Date : ");
    int date = input.nextInt();
    input.nextLine();

    String[] str = { "january", "february", "march", "april", "may", "june", "july", "august", "september", "october",
        "november", "december" };
    String[] strNum = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };

    int count = 0;
    int month = 0;
    int mark = 0;
    String monthString;

    System.out.println("Month : ");
    while (count != 1) {
      monthString = input.nextLine().toLowerCase();
      for (int j = 0; j < 12; j++) {
        if (monthString.equals(str[j]) || monthString.equals(strNum[j])) {
          month = j + 1;
          count = 1;
          mark = 1;
          break;
        }
      }
      if (mark == 0) {
        System.out.println("Month Invalid - Try Again : ");
      }
    }

    int year = 0;
    int flag = 0;
    while (flag != 1) {
      System.out.println("Enter Year (1940 - 2020) : ");
      year = input.nextInt();
      if (year > 1939 && year < 2021) {
        flag = 1;
      } else {
        System.out.println("\nWrong Year Entered./nYear Should Between 1940 to 2020.\n");
      }
    }
    System.out.println("");
    input.nextLine();

    @SuppressWarnings("unused")
    String Date = String.valueOf(date + "/" + month + "/" + year);

    Date joiningDate1 = new GregorianCalendar(2014, Calendar.APRIL, 11, 10, 0, 0).getTime();
    Person obj21 = new Person(name, fName, mName, joiningDate1);

    Person backup = new Person(obj[7].getName(), obj[7].getfName(), obj[7].getmName(), obj[7].birthDate);
    backup.setNationality("Bangladeshi");
    backup.setId(obj21.id);

    obj[7] = obj21;
    obj21 = backup;

    System.out.println("\n\nAfter Swapping the value of index 7 Array is\n");

    for (int i = 0; i < obj.length; i++) {
      System.out.println(obj[i].toString());
    }
    input.close();
  }

}

class Person {

  private String name;
  private String fName;
  private String mName;
  public Date birthDate;
  public String nationality = "Bangladeshi";
  public String id;

  public int min = 10000;
  public int max = 20000;

  public int random;

  public Person() {
    this.name = randomName().toUpperCase();
    this.fName = randomName().toUpperCase();
    this.mName = randomName().toUpperCase();
    this.birthDate = between();

    this.random = (int) (Math.random() * (max - min + 1) + min);
    this.id = String.valueOf(random);
  }

  public Person(String name, String fName, String mName, Date birthDate) {
    this.name = name.toUpperCase();
    this.fName = fName.toUpperCase();
    this.mName = mName.toUpperCase();
    this.birthDate = birthDate;
    this.nationality = "Bangladeshi";
    this.id = String.valueOf(random);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getfName() {
    return fName;
  }

  public void setfName(String fName) {
    this.fName = fName;
  }

  public String getmName() {
    return mName;
  }

  public void setmName(String mName) {
    this.mName = mName;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String toString() {
    System.out.println("");
    return "Person{" + "Name = " + name + ", Father's Name = " + fName + ", Mother's Name = " + mName
        + ", Date Of Birth = " + birthDate + ", Nationality = " + nationality + ", Id = " + id + '}';
  }

  public String randomName() {

    int leftLimit = 65;
    int rightLimit = 90;
    int targetStringLength = (int) (int) (Math.random() * (30) + 1);
    Random random = new Random();
    StringBuilder buffer = new StringBuilder(targetStringLength);
    for (int i = 0; i < targetStringLength; i++) {
      int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
      buffer.append((char) randomLimitedInt);
    }
    String generatedString = buffer.toString();

    return generatedString;
  }

  public Date between() {
    long startMillis = 1000;
    long endMillis = 2020;
    long randomMillisSinceEpoch = ThreadLocalRandom.current().nextLong(startMillis, endMillis);

    return new Date(randomMillisSinceEpoch);
  }

}
