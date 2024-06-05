package com.saiful.lab10;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 1 Dec 2020
 */
public class Quiz2Task1_1922071 {

  public static void main(String[] args) {

    generateMatrix();

    findIndices(generateMatrix());

  }

  public static double[][] generateMatrix() {

    double[][] matrix = new double[10][10];

    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[row].length; column++) {
        matrix[row][column] = (double) (Math.random() * 6);
      }
    }
    return matrix;
  }

  public static void findIndices(double[][] newmatrix) {

    for (int row = 0; row < newmatrix.length; row++) {
      for (int column = 0; column < newmatrix[row].length; column++) {
        System.out.print(newmatrix[row][column] + " ");
      }

      System.out.println();
    }

    System.out.println();

    for (int column = 0; column < newmatrix[0].length; column++) {
      double sum = 0;
      for (int row = 0; row < newmatrix.length; row++) {
        sum += newmatrix[row][column];

      }
      if (sum >= 32.5) {
        System.out.println("Column at index  " + column + " has a sum of " + sum);
      }
    }

  }
}
