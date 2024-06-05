package com.saiful.lab12;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 8 Dec 2020
 */

public class QuadraticEquation_1922071 {
  private double a;
  private double b;
  private double c;

  public QuadraticEquation_1922071() {

  }

  public QuadraticEquation_1922071(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  private double getDiscriminant() {
    double result = Math.pow(b, 2) - 4 * a * c;
    return result;
  }

  public int evaluateDiscriminant() {
    int discValue = (int) getDiscriminant();

    if (discValue > 0) {
      System.out.println("\ngetDiscriminant() > 0, “Two distinct solutions”");
      return discValue;
    } else if (discValue == 0) {
      System.out.println("\ngetDiscriminant() == 0, “One unique solutions”");
      return discValue;
    } else
      System.out.println("\ngetDiscriminant() < 0, “No real solutions”");

    return discValue;
  }

  public double getRoot1() {
    double root1 = (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    return root1;
  }

  public double getRoot2() {
    double root2 = (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    return root2;
  }

}