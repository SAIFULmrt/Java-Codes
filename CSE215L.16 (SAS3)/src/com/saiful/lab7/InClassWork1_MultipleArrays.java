package com.saiful.lab7;

import java.util.Arrays;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 26 Nov 2020
 */

// A method that combines two arrays and returns a single array.
public class InClassWork1_MultipleArrays {

  public static int[] combine(int[] arr1, int[] arr2) {
    int[] resultArr = new int[arr1.length + arr2.length];
    int resultArrayIndex = 0;
    for (int index = 0; index < arr1.length; index++) {
      resultArr[resultArrayIndex] = arr1[index];
      resultArrayIndex++;
    }
    for (int index = 0; index < arr2.length; index++) {
      resultArr[resultArrayIndex] = arr2[index];
      resultArrayIndex++;
    }
    return resultArr;
  }

  public static void main(String[] args) {
    int[] array1 = { 1, 2, 3, 4, 5, 6 };
    int[] array2 = { 11, 12, 13 };
    int[] combinedArray = combine(array1, array2);
    System.out.println(Arrays.toString(combinedArray));
  }

}
