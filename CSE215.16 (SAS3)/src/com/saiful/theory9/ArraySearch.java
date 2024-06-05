package com.saiful.theory9;

import java.util.*;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 18 Dec 2020
 */
public class ArraySearch {

  public static void main(String[] args) {

    int[] arr = new int[] { 5, 4, 3, 3, 0 };

    shortAndFind(arr);

  }

  public static void shortAndFind(int[] arr) {
    Arrays.sort(arr);
    printArr(arr);
  }

  public static void printArr(int[] arr) {
    for (int currentElement : arr) {
      System.out.print(currentElement + " ");
    }
  }

}
