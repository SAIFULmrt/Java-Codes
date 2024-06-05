package com.saiful.theorySingleDimesionalArray;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 30 Nov 2020
 */
public class AnalyzeNumbers {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter the number of items: ");
    int n = input.nextInt();
    double[] numbers = new double[n];
    double sum = 0;

    System.out.print("Enter the numbers: ");
    for (int i = 0; i < n; i++) {
      numbers[i] = input.nextDouble();
      sum += numbers[i];
    }

    double average = sum / n;

    int count = 0; // The numbers of elements above average
    for (int i = 0; i < n; i++)
      if (numbers[i] > average)
        count++;

    System.out.println("Average is " + average);
    System.out.println("Number of elements above the average is " + count);

    input.close();
  }
}