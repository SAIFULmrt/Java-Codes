package com.saiful.lab5;

import java.util.Scanner;
import java.util.Arrays;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 26 Nov 2020
 */
public class InClassWork3_SingleDimensionalArrays {

  @SuppressWarnings("resource")
  public static void main(String[] args) {
    // one way of initializing array
    @SuppressWarnings("unused")
    int[] myIntArray = { 1, 2, 3, 4, 6, 8 };

    // populating array with user input
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a size of the array: ");
    int arraySize = input.nextInt();

    int[] myOtherIntArray = new int[arraySize];
    /*
     * String[] myStringArray = new String[50]; double[] myDoubleArray = new
     * double[50];
     */

    // user input for the array
    for (int index = 0; index < arraySize; index++) {
      System.out.print("Element " + (index + 1) + ": ");
      myOtherIntArray[index] = input.nextInt();
    }

    // printing the array
    for (int index = 0; index < arraySize; index++) {
      System.out.print(myOtherIntArray[index] + "\t");
    }

    System.out.println();

    // printing out an array in one line
    String stringRepresentationOfArray = Arrays.toString(myOtherIntArray);
    System.out.println(stringRepresentationOfArray);

    // enhanced for loop
    // for each item in this particular array
    for (int item : myOtherIntArray) {
      System.out.print(item + " ");
    }

  }

}
