package com.saiful.theoryMultiDimensionalArray;

import java.util.Scanner;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 30 Nov 2020
 */
public class TwoDArrayInput {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // taking row and column size of 2d array
    System.out.print("Enter Row Size: ");
    int row = input.nextInt();

    System.out.print("Enter Column Size: ");
    int column = input.nextInt();

    // declaring array
    int[][] twoDArr = new int[row][column];

    // taking elements user input
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        //twoDArr[i][j] = input.nextInt();
        
        // taking random values
        twoDArr[i][j] = (int)(Math.random()*50);
      }

    }
    // print with enhanced for loop
    System.out.print("\nData you have entered : \n");
    for (int[] x : twoDArr) {
      for (int y : x) {
        System.out.print(y + "          ");
      }
      System.out.println();
    }
    // print with normal for loop
    System.out.print("\nData you have entered : \n");
    for (int i = 0; i < twoDArr.length; i++) {
      for (int j = 0; j < twoDArr[i].length; j++) {
        System.out.print(twoDArr[i][j] + "         ");
      }
      System.out.println();
    }

    input.close();
  }
}