package com.saiful.theorySingleDimesionalArray;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 30 Nov 2020
 */
public class ReturningReverseArrayFromMethod {

  public static void main(String[] args) {
    int[] list1 = { 1, 2, 3, 4, 5, 6 };
    int[] list2 = reverse(list1);

    for (int value : list1) {
      System.out.print(value + " ");
    }

    System.out.println();

    for (int value : list2) {
      System.out.print(value + " ");
    }

  }

  public static int[] reverse(int[] list) {
    int[] result = new int[list.length];

    for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
      result[j] = list[i];
    }

    return result;
  }

}
