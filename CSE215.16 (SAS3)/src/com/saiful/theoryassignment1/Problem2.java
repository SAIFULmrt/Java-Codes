package com.saiful.theoryassignment1;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 27 Nov 2020
 */
public class Problem2 {

  public static void main(String[] args) {

    System.out.println("printPyramid(3, \"AAA\")\n");
    PrintPyramid(3, "AAA");
    System.out.println("\nprintPyramid(4, 'X')\n");
    PrintPyramid(4, "X");
    System.out.println("\nprintPyramid(5, 'V')\n");
    PrintPyramid(5, "V");
    System.out.println("\nprintPyramid(6, \"DDDD\")\n");
    PrintPyramid(6, "DDDD");
    System.out.println("\nprintPyramid(9, \"OO\")\n");
    PrintPyramid(9, "OO");

  }

  public static void PrintPyramid(int rowNum, String string) {
    if (rowNum % 2 == 0) {
      int stringSize = string.length();
      int rowLogic = (rowNum / 2) + 1, index, j, k;

      for (index = 1; index < rowLogic; index++) {
        for (j = index; j < rowLogic - 1; j++) {
          for (k = 0; k <= stringSize; k++) {
            System.out.print(" ");
          }
        }

        for (k = 1; k <= index; k++) {
          System.out.print(string + " ");
        }
        System.out.println("");
      }

      for (index = rowLogic; index >= 1; index--) {
        for (j = index; j < rowLogic; j++) {
          for (k = 0; k <= stringSize; k++) {
            System.out.print(" ");
          }
        }

        for (k = 1; k < index; k++) {
          System.out.print(string + " ");
        }
        System.out.println("");
      }
    }

    else {
      int rowLogic = (rowNum / 2) + 1, index, j;

      for (index = 0; index < rowLogic; index++) {
        for (j = 0; j <= index; j++) {
          System.out.print(string + " ");
        }
        System.out.println("");
      }

      for (index = rowLogic - 1; index >= 0; index--) {
        for (j = 0; j <= index - 1; j++) {
          System.out.print(string + " ");
        }
        System.out.println("");
      }
    }
  }

}
