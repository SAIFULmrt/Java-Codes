package com.saiful.lab7;

import java.util.Scanner;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 22 Nov 2020
 */
public class Lab7Task1_1922071 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter size of array 1: 5");
    System.out.println("Enter the elements of the array 1:");
    double arr1[] = new double[5];
    for (int i = 0; i < 5; i++) {
      arr1[i] = input.nextInt();
    }

    System.out.println("Please enter size of array 2: 5");
    System.out.println("Enter the elements of the array 2:");
    double arr2[] = new double[5];
    for (int i = 0; i < 5; i++) {
      arr2[i] = input.nextInt();
    }

    System.out.println("Please enter size of array 3: 5");
    System.out.println("Enter the elements of the array 3:");
    double arr3[] = new double[5];
    for (int i = 0; i < 5; i++) {
      arr3[i] = input.nextInt();
    }

    double result[] = elementwiseSum(arr1, arr2, arr3);

    System.out.print("\nResult: ");
    for (int i = 0; i < 5; i++) {
      System.out.printf("%.0f", result[i]);
      System.out.print(" ");
    }
    input.close();
  }

  public static double[] elementwiseSum(double[] arr1, double[] arr2, double[] arr3) {
    int arrayLength = (int) arr1.length;
    double arraySummation[] = new double[arrayLength];

    for (int i = 0; i < (int) arr1.length; i++) {
      arraySummation[i] += arr1[i] + arr2[i] + arr3[i];
    }

    return arraySummation;
  }
}