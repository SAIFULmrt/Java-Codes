package com.saiful.lab6;

import java.util.Scanner;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 27 Nov 2020
 */

public class Lab6Task1_1922071 {

  // method to check four consecutive numbers
  public static int indexOfConsecutiveFour(int[] values) {

    int countConsecutive = 1;
    for (int i = 0; i < values.length - 1; i++) {
      if (values[i] == values[i + 1])
        countConsecutive++;

      if (countConsecutive >= 4)
        return i - 2;

      if (values[i] != values[i + 1])
        countConsecutive = 1;
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // taking input size
    System.out.print("Enter the number of values: ");
    int[] values = new int[input.nextInt()];

    // taking array's elements
    System.out.print("Enter the values: ");
    for (int i = 0; i < values.length; i++)
      values[i] = input.nextInt();

    // calling method and print output
    if (indexOfConsecutiveFour(values) >= 0) {
      System.out.println("The list has consecutive fours, starting at index " + indexOfConsecutiveFour(values));
    } else if (indexOfConsecutiveFour(values) == -1) {
      System.out.println("The list has no consecutive fours.");
    }
    input.close();
  }

}