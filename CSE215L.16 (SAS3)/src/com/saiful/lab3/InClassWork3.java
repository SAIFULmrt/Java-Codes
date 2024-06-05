package com.saiful.lab3;

public class InClassWork3 {

  public static void main(String[] args) {

    // if else alternative way jeno nested hoye na jay beshi

    System.out.println(calculateArea(1.0 - 0.9));

  }

  public static double calculateArea(double radius) {
    double result = 0.0;

    if (radius > 0.1) {
      result = (3.1416 * radius * radius);
    } else if (radius == 0.1) {
      System.out.println("Circle with 0 radius");
    } else {
      System.out.println("Circle with negative radius");
    }
    return result;
  }

}