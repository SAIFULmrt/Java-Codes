package com.saiful.lab2;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 27 Nov 2020
 */

import java.util.Scanner;

public class Lab2Task1_1922071 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the first number: ");
    int userGivenInteger = input.nextInt();

    System.out.println("Please enter the second number: ");
    int userGivenInteger2 = input.nextInt();

    input.close();

    int maximum;
    int minimum;

    if (userGivenInteger > userGivenInteger2) {
      maximum = userGivenInteger;
      minimum = userGivenInteger2;
    } else {
      maximum = userGivenInteger2;
      minimum = userGivenInteger;
    }

    int randomNumber = (int) (minimum + (Math.random() * (maximum - minimum + 1)));
    System.out.println("\nThe random number is " + randomNumber + "\n");

    for (int index = randomNumber; index > 1; index--) {

      boolean flag = true;
      for (int i = 2; i <= index / 2; ++i) {
        if (index % i == 0) {
          flag = false;
          break;
        }
      }

      if (flag)

      {
        if (index % 2 == 0) {
          System.out.println("" + index + " is (a) prime, " + "(b) even ");
        } else {
          System.out.println("" + index + " is (a) prime," + " (b) odd ");

        }
      }

      else {
        if (index % 2 == 0) {
          System.out.println("" + index + " is (a) not prime, " + " (b) even ");
        } else {
          System.out.println("" + index + " is (a) not prime, " + " (b) odd ");

        }
      }
    }
    System.out.println("1 is (a) not prime, (b) odd ");
  }
}