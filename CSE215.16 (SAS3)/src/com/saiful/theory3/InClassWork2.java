package com.saiful.theory3;

public class InClassWork2 {

  public static void main(String[] args) {

    // 7. method(function)

    double radius1 = 3.0;
    double radius2 = 324.1;
    System.out.println("Area of circle with radius " + radius1 + " , " + computeArea(radius1));
    System.out.println("Area of circle with radius " + radius2 + " , " + computeArea(radius1));

  }

  public static double computeArea(double radius) {
    final double PI = 3.1416; // 8. final = fixed (for constant value)
    double area = radius * radius * PI;
    return area;
  }

}
