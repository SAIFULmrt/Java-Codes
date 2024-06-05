package com.saiful.lab4;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  Date: November 10, 2020
 */

public class Lab4Task1_1922071 {

  // 1st method
  public static double metersToFeet(double meters) {
    double meter = meters;
    double feet = 3.279 * meter;
    return feet;
  }

  // 2nd method
  public static double feetToMeters(double feet) {
    double meter = 0.305 * feet;
    return meter;
  }

  public static void main(String[] args) {
    final int firstNumber = 115;
    final int secondNumber = 155;

    int index;

    System.out.println("--- Meter to Feet Conversion (for prime numbers only) ---\n");

    // 1st loop
    for (index = 1; index <= firstNumber; index++) {

      // prime number checking
      if (index == 1) {
        continue;
      } else {

        boolean flag = true;
        for (int innerIndex = 2; innerIndex <= index / 2; ++innerIndex) {

          if (index % innerIndex == 0) {
            flag = false;
            break;
          }
        }

        if (flag) {

          // calling 1st method
          double result = metersToFeet(index);
          System.out.println(index + " meters " + "= " + result + " feet");

        }
      }
    }

    System.out.println("\n--- Feet to Meter Conversion (for number that is divisible by both 4 and 6) ---\n");

    // 2nd loop
    for (index = 1; index <= secondNumber; index++) {

      // checking number that is divisible by both 4 and 6
      // as 0 is divisible by every num so i use if-else to check 0 also
      // in this case i check "0 and 1" for index 1
      if (index == 1) {
        index = 0;
        if (index % 4 == 0 && index % 6 == 0) {
          // calling 2nd method
          double result = feetToMeters(index);
          System.out.println(index + " feet " + "= " + result + " meters");
        }
        ++index;
        if (index % 4 == 0 && index % 6 == 0) {
          // calling 2nd method
          double result = feetToMeters(index);
          System.out.println(index + " feet " + "= " + result + " meters");
        }

      }

      else {

        // checking index from 2 to secondNumber
        if (index % 4 == 0 && index % 6 == 0) {
          // calling 2nd method
          double result = feetToMeters(index);
          System.out.println(index + " feet " + "= " + result + " meters");
        }
      }
    }
  }
}