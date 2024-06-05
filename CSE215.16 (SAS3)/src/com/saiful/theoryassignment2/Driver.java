package com.saiful.theoryassignment2;

import java.time.LocalDate;
import java.util.*;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 20 Dec 2020
 */

public class Driver {

  public static void main(String[] args) {

    // Take user input
    Scanner input = new Scanner(System.in);

    System.out.print("Please enter the first name : ");
    String firstName = input.nextLine();
    Person.reEnterData(firstName);

    System.out.print("Please enter the last name : ");
    String lastName = input.nextLine();
    Person.reEnterData(lastName);

    System.out.print("Please enter the father's name : ");
    String fathersName = input.nextLine();
    Person.reEnterData(fathersName);

    System.out.print("Please enter the mother's name : ");
    String mothersName = input.nextLine();
    Person.reEnterData(fathersName);

    System.out.print("Please enter the NID number (11 digit or 18 digit): ");
    String nidNumber = input.nextLine();
    Person.reEnterData1(nidNumber);

    LocalDate date1 = null;

    System.out.print("Do you want to enter date of birth? (Y/N)");
    System.out.print("Enter your choice: ");

    char checkinput = input.next().charAt(0);

    if (checkinput == 'Y') {
      System.out.print("Date of birth: ");
      int day = 0;
      int year = 0;
      int month = 0;

      System.out.printf("dd: ");
      day = input.nextInt();

      System.out.printf("-");
      System.out.printf(" mm: ");
      month = input.nextInt();
      System.out.printf("-");
      System.out.printf(" yyyy: ");
      year = input.nextInt();

      date1 = LocalDate.of(year, month, day);

    } else if (checkinput == 'N') {
      date1 = LocalDate.of(1970, 1, 1);
      ;
    }

    System.out.printf("\n");

    Person p1 = Person.getPerson(firstName, lastName, fathersName, mothersName, date1, nidNumber, new Pixel[256][256]);
    System.out.println(p1);

    input.close();

  }

}