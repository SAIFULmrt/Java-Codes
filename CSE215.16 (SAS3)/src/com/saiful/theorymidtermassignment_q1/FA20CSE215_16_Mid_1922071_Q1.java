package com.saiful.theorymidtermassignment_q1;

import java.util.*;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 25 Dec 2020
 */
public class FA20CSE215_16_Mid_1922071_Q1 {

  public static int[][][] sortArray(int arrayOne[][][]) {
    @SuppressWarnings("unused")
    int arrayOneLength = 0, arrayTwoLength = 0;

    List<Integer> list = new ArrayList<>();
    for (int index = 0; index < arrayOne.length; index++) {

      arrayOneLength = arrayOne[index].length;
      for (int indexTwo = 0; indexTwo < arrayOne[index].length; indexTwo++) {

        arrayTwoLength = arrayOne[index][indexTwo].length;
        for (int indexThree = 0; indexThree < arrayOne[index][indexTwo].length; indexThree++) {
          list.add(arrayOne[index][indexTwo][indexThree]);
        }
      }
    }

    Collections.sort(list);
    System.out.println(list);
    int arrayTwo[][][] = new int[arrayOne.length][][];
    int increment = 0;
    for (int row = 0; row < arrayOne.length; row++) {
      arrayTwo[row] = new int[arrayOne[row].length][];

      for (int column = 0; column < arrayOne[row].length; column++) {
        arrayTwo[row][column] = new int[arrayOne[row][column].length];
        for (int width = 0; width < arrayOne[row][column].length; width++) {
          arrayTwo[row][column][width] = list.get(increment++);
        }
      }
    }
    return arrayTwo;
  }

  public static void main(String[] args) {

    int arrayOne[][][] = { { { 17, 16, 18 }, { 10, 12, 11, 105, 327, 119 } }, { { 8, 7, 9 }, { 5, 6, 4 }, },
        { { 2, 3, 1 }, { 15, 13, 14 } } };

    System.out.printf("Before Sorting\n\n");
    arrayPrint(arrayOne);

    int arrayTwo[][][] = sortArray(arrayOne);
    System.out.printf("After Sorting\n\n");
    arrayPrint(arrayTwo);

  }

  public static void arrayPrint(int arrayOne[][][]) {
    System.out.printf("{   ");
    for (int index = 0; index < arrayOne.length; index++) {
      System.out.printf("{\n");
      for (int indexTwo = 0; indexTwo < arrayOne[index].length; indexTwo++) {
        System.out.printf("       {");
        for (int indexThree = 0; indexThree < arrayOne[index][indexTwo].length; indexThree++) {
          System.out.printf(arrayOne[index][indexTwo][indexThree] + "");
          if (indexThree < arrayOne[index][indexTwo].length - 1) {
            System.out.printf(",");
          }
        }
        System.out.print("}");
        if (indexTwo < 1) {
          System.out.printf(",\n");
        }
      }
      System.out.print("\n   }");
      if (index < 2) {
        System.out.printf(",");
      }
    }
    System.out.printf("\n}\n\n\n\n");
  }

}