package com.saiful.lab3;

import java.util.Scanner;

public class InClassWork {

  public static void main(String[] args) {

    // 9. method calling

    // System.out.println(circleArea(3.4));
    testMethod(3.4);

    // 10. scan and print using method
    int val = scanAndProvideInput();
    showScannedVal(val);

  }

  public static double circleArea(double value) {
    final double PI = 3.1416; // 8. c had constant, java has final
    return (value * value * PI);
  }

  public static void testMethod(double testVariable) {
    System.out.println("Test : " + testVariable);
  }

  // 10
  @SuppressWarnings("resource")
  public static int scanAndProvideInput() {
    System.out.print("Enter a number: ");
    Scanner input = new Scanner(System.in);
    int returnValue = input.nextInt();
    return returnValue;

  }

  // 10
  public static void showScannedVal(int val) {
    System.out.println("Your scanned value is " + val);
  }
}
