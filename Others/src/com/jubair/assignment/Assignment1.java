package com.jubair.assignment;

import java.util.Scanner;

public class Assignment1 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter Total Course Number: ");
    int n = input.nextInt();

    float array1[] = new float[n];
    float array2[] = new float[n];
    float gradePoint[] = new float[n];

    System.out.print("\nEnter Marks: \n\n");
    for (int i = 0; i < n; i++) {
      System.out.print("Enter course[" + (i + 1) + "] marks: ");
      array1[i] = input.nextFloat();
    }

    System.out.print("\nEnter Credits: \n\n");
    for (int i = 0; i < n; i++) {
      System.out.print("Enter course[" + (i + 1) + "] credits: ");
      array2[i] = input.nextFloat();
    }

    for (int i = 0; i < n; i++) {

      if (array1[i] >= 93) {
        gradePoint[i] = (float) 4.0;
      } else if (array1[i] >= 90) {
        gradePoint[i] = (float) 3.7;
      } else if (array1[i] >= 87) {
        gradePoint[i] = (float) 3.3;
      } else if (array1[i] >= 83) {
        gradePoint[i] = (float) 3.0;
      } else if (array1[i] >= 80) {
        gradePoint[i] = (float) 2.7;
      } else if (array1[i] >= 77) {
        gradePoint[i] = (float) 2.3;
      } else if (array1[i] >= 73) {
        gradePoint[i] = (float) 2.0;
      } else if (array1[i] >= 70) {
        gradePoint[i] = (float) 1.7;
      } else if (array1[i] >= 67) {
        gradePoint[i] = (float) 1.3;
      } else if (array1[i] >= 60) {
        gradePoint[i] = (float) 1.0;
      } else {
        gradePoint[i] = (float) 0.0;
      }

    }

    float totalNumberOfCreditHours = (float) 0.0;
    for (int i = 0; i < array2.length; i++) {
      totalNumberOfCreditHours += array2[i];
    }

    float gradePointMultiplyCreditHours = (float) 0.0;
    for (int i = 0; i < n; i++) {
      gradePointMultiplyCreditHours += gradePoint[i] * array2[i];
    }

    float x = gradePointMultiplyCreditHours / totalNumberOfCreditHours;

    System.out.println();
    System.out.printf("=========%nCGPA %.2f%n", x);
    System.out.println("=========");

    input.close();
  }

}
