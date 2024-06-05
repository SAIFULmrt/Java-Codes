package com.saiful.theorySingleDimesionalArray;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 30 Nov 2020
 */
public class ArrayWithMethods {

  public static void main(String[] args) {
    int[] myArray = { 11, 22, 33, 44, 55 };

    System.out.println("\n Hi \n " + printArray(myArray));

    System.out.println("\nHi my name is saiful.......... ");

    for (int value : printArray(myArray)) {
      System.out.print(value + " ");
    }

    System.out.println();

    printArray(new int[] { 1, 2, 3, 4, 5 });

  }

  public static int[] printArray(int[] newArray) {
    for (int value : newArray) {
      System.out.print(value + " ");
    }

    System.out.println();
    for (int i = 0; i < newArray.length; i++) {
      System.out.print(newArray[i] + " ");

    }
    return newArray;
  }
}
