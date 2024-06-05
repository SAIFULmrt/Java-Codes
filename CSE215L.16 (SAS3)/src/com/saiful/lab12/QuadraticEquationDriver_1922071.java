package com.saiful.lab12;

import java.util.Scanner;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 8 Dec 2020
 */

public class QuadraticEquationDriver_1922071 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the 1st objects coefficient of a: ");
    double coefficientA = input.nextInt();
    System.out.print("Enter the 1st objects coefficient of b: ");
    double coefficientB = input.nextInt();
    System.out.print("Enter the 1st objects coefficient of c: ");
    double coefficientC = input.nextInt();

    QuadraticEquation_1922071 objectOne = new QuadraticEquation_1922071(coefficientA, coefficientB, coefficientC);

    int discriminantValue = objectOne.evaluateDiscriminant();

    if (discriminantValue > 0) {
      double root1 = objectOne.getRoot1();
      System.out.printf("x1: %.2f\n", root1);

      double root2 = objectOne.getRoot2();
      System.out.printf("x2: %.2f\n", root2);
    } else if (discriminantValue == 0) {
      double root1 = objectOne.getRoot1();
      System.out.printf("x: %.2f\n", root1);
    } else {

      System.out.printf("Not possible to calculate solutions since discriminant is negative\n");
    }

    System.out.print("\nEnter the 2nd objects coefficient of a: ");
    coefficientA = input.nextInt();
    System.out.print("Enter the 2nd objects coefficient of b: ");
    coefficientB = input.nextInt();
    System.out.print("Enter the 2nd objects coefficient of c: ");
    coefficientC = input.nextInt();

    QuadraticEquation_1922071 objectTwo = new QuadraticEquation_1922071(coefficientA, coefficientB, coefficientC);

    discriminantValue = objectTwo.evaluateDiscriminant();

    if (discriminantValue > 0) {
      double root1 = objectTwo.getRoot1();
      System.out.printf("x1: %.2f\n", root1);

      double root2 = objectTwo.getRoot2();
      System.out.printf("x2: %.2f\n", root2);
    } else if (discriminantValue == 0) {
      double root1 = objectTwo.getRoot1();
      System.out.printf("x: %.2f\n", root1);
    } else {

      System.out.printf("Not possible to calculate solutions since discriminant is negative\n");
    }

    System.out.print("\nEnter the 3rd objects coefficient of a: ");
    coefficientA = input.nextInt();
    System.out.print("Enter the 3rd objects coefficient of b: ");
    coefficientB = input.nextInt();
    System.out.print("Enter the 3rd objects coefficient of c: ");
    coefficientC = input.nextInt();

    QuadraticEquation_1922071 objectThree = new QuadraticEquation_1922071(coefficientA, coefficientB, coefficientC);
    discriminantValue = objectThree.evaluateDiscriminant();

    if (discriminantValue > 0) {
      double root1 = objectThree.getRoot1();
      System.out.printf("x1: %.2f\n", root1);

      double root2 = objectThree.getRoot2();
      System.out.printf("x2: %.2f\n", root2);
    } else if (discriminantValue == 0) {
      double root1 = objectThree.getRoot1();
      System.out.printf("x: %.2f\n", root1);
    } else {

      System.out.printf("Not possible to calculate solutions since discriminant is negative\n");
    }

    input.close();

  }

}