package com.saiful.theory8;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 18 Dec 2020
 */
public class Arrays {

  public static void main(String[] args) {

    int[] array = new int[100];

    for (int index = 0; index < array.length; index++) {
      array[index] = (int) (Math.random() * array.length);
    }

    int index = 0;
    for (int currentElement : array) {
      System.out.printf("[%2d] : %4d", index, currentElement);
      if (((index + 1) % 5) == 0) {
        System.out.print("\n");
      } else {
        System.out.print(" ");
      }
      index++;
    }
    array = new int[500];
  }

}
