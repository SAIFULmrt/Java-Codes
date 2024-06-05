package com.saiful.lab5;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 26 Nov 2020
 */

public class InClassWork_SingleDimensionalArrays2 {

//return an array method example
  public static double[] multiplyBy2(double[] array) {
    double[] resultArray = new double[array.length];

    for (int index = 0; index < array.length; index++) {
      resultArray[index] = array[index] * 2;
    }

    return resultArray;
  }

  public static double findMinimum(double[] array) {
    double minimum = array[0];

    for (double item : array) {
      if (item < minimum) {
        minimum = item;
      }
    }
    return minimum;

  }

  public static double findMaximum(double[] array) {
    double maximum = array[0];

    for (double item : array) {
      if (item > maximum) {
        maximum = item;
      }
    }
    return maximum;

  }

  public static double findSum(double[] array) {
    double sum = 0;

    for (double item : array) {
      sum += item;
    }
    return sum;
  }

  public static double findAverage(double[] array) {
    double sum = findSum(array);
    return sum / array.length;

  }

  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
    double[] myDoubleArray = new double[5];

    System.out.println("Please enter the elements of the array: ");

    for (int index = 0; index < myDoubleArray.length; index++) {
      System.out.print("Element " + (index + 1) + ": ");
      myDoubleArray[index] = input.nextDouble();

    }

    /*
     * // without method
     * 
     * double maximum = myDoubleArray[0]; double minimum = myDoubleArray[0];
     * 
     * double sum = 0;
     * 
     * for (double item : myDoubleArray) { if (item < minimum) { minimum = item; }
     * if (item > maximum) { maximum = item; }
     * 
     * sum += item;
     * 
     * }
     * 
     * 
     * double average = sum / myDoubleArray.length;
     * System.out.println("Maxmimum =  " + maximum);
     * System.out.println("Minimum =  " + minimum); System.out.println("Average =  "
     * + average);
     */

    System.out.println("Maxmimum =  " + findMaximum(myDoubleArray));
    System.out.println("Minimum =  " + findMinimum(myDoubleArray));
    System.out.println("Average =  " + findAverage(myDoubleArray));
    System.out.println("Sum =  " + findSum(myDoubleArray));
    @SuppressWarnings("unused")
    double[] result = multiplyBy2(myDoubleArray);
    String arrayRepresentation = Arrays.toString(multiplyBy2(myDoubleArray));
    System.out.println(arrayRepresentation);

  }

}