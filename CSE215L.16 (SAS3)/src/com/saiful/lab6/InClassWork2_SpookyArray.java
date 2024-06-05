package com.saiful.lab6;

import java.util.Scanner;
import java.util.Arrays;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 26 Nov 2020
 */
public class InClassWork2_SpookyArray {

  /*
   * // solve public static double[] copyArray{ extra array niye eitate kaj korbo
   * jate original array te effect na pore }
   */

  public static void spookySquare(double[] myArray) {
    @SuppressWarnings("unused")
    double[] result = new double[myArray.length];
    // overwrite
    for (int index = 0; index < myArray.length; index++) {
      myArray[index] = Math.pow(myArray[index], 2);
    }
  }

  public static double[] square(double[] myArray) {
    double[] result = new double[myArray.length];

    for (int index = 0; index < myArray.length; index++) {
      result[index] = Math.pow(myArray[index], 2);
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the size of the array: ");
    int sizeOfArray = input.nextInt();
    double[] myArray = new double[sizeOfArray];

    // storing user input values
    for (int index = 0; index < myArray.length; index++) {
      System.out.println("Element " + (index + 1) + ": ");
      myArray[index] = input.nextDouble();
    }

    System.out.println("Original: " + Arrays.toString(myArray));
    spookySquare(myArray);
    System.out.println("Original array modified error: " + Arrays.toString(myArray));

    input.close();
  }

}
