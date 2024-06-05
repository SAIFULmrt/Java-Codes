package com.saiful.lab9;

import java.util.Arrays;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 1 Dec 2020
 */
public class BonusAssignment1_1922071 {

  public static double[] twoDiagonalSum(double[][] matrix) {

    double primaryDiagonalSum = 0;
    double secondaryDiagonalSum = 0;

    // primary diagonal sum
    for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
      for (int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++) {
        if (rowIndex == columnIndex) // this condition checks for diagonal
        {
          primaryDiagonalSum += matrix[rowIndex][columnIndex];
        }
      }
    }

    // secondary diagonal sum
    for (int rowIndex = 0, columnIndex = matrix[rowIndex].length
        - 1; rowIndex < matrix.length; rowIndex++, columnIndex--) {
      secondaryDiagonalSum += matrix[rowIndex][columnIndex];
    }

    double[] result = { primaryDiagonalSum, secondaryDiagonalSum };

    return result;
  }

  public static void main(String[] args) {
    double[][] matrix = { { 4.5, 4.2, 0.33, 3.2 }, { 2.3, 5.6, 3.5, 2.3 }, { 2.3, 11.4, 5.6, 23.3 },
        { 6.7, 4.5, 3.4, 2.23 } };

    double[] result = twoDiagonalSum(matrix);

    System.out.println(Arrays.toString(result));
  }
}
