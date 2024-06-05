package com.saiful.theoryMultiDimensionalArray;

import java.util.Scanner;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 1 Dec 2020
 */
public class RandomShuffling {

  public static void main(String[] args) {

    java.util.Scanner input = new Scanner(System.in);

    // declaring array
    int[][] matrix = new int[3][3];
    matrix[0][0] = 1;
    matrix[0][1] = 2;
    matrix[0][2] = 3;
    matrix[1][0] = 4;
    matrix[1][1] = 5;
    matrix[1][2] = 6;
    matrix[2][0] = 7;
    matrix[2][1] = 8;
    matrix[2][2] = 9;

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        int i1 = (int) (Math.random() * matrix.length);
        int j1 = (int) (Math.random() * matrix[i].length);
        // Swap matrix[i][j] with matrix[i1][j1]
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i1][j1];
        matrix[i1][j1] = temp;
      }
    }

    for (int[] x : matrix) {

      for (int y : x) {
        System.out.print(y + "      ");

      }
      System.out.println();
    }

    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[row].length; column++) {
        System.out.print(matrix[row][column] + " ");
        // System.out.print(matrix[row][column] + " ");

      }

      System.out.println();
    }

    input.close();

  }

}
