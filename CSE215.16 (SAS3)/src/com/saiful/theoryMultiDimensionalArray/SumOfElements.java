package com.saiful.theoryMultiDimensionalArray;

import java.util.Scanner;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 30 Nov 2020
 */
public class SumOfElements {

  public static void main(String[] args) {

    java.util.Scanner input = new Scanner(System.in);

    // declaring array
    int[][] matrix = new int[3][3];

    System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");

    // taking array elemnts
    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[row].length; column++) {
        matrix[row][column] = input.nextInt();
      }
    }

    // printing array elements
    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[row].length; column++) {
        System.out.print(matrix[row][column] + " ");
      }

      System.out.println();
    }

    // sum of array elements
    int total = 0;
    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[row].length; column++) {
        total += matrix[row][column];
      }

    }
    System.out.println("total: " + total);

    // sum by column
    for (int column = 0; column < matrix[0].length; column++) {
      int sum = 0;
      for (int row = 0; row < matrix.length; row++) {
        sum += matrix[row][column];

      }
      System.out.println("Sum for column " + column + " is " + sum);
    }

    input.close();
  }
}