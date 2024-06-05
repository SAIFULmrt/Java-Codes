package com.saiful.theory_FunctionalInterface_LambdaExpression;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 6 Jan 2021
 */

// 1. Write a program that tells the painter how to color a shape.

public class Example1 {

  public static void main(String[] args) {
    Colorable square = () -> System.out.println(
        "Color all four sides");
    Colorable circle = () -> System.out.println(
        "Color the circular border");
    Colorable triangle = () -> System.out.println(
        "Color the three sides");
    triangle.howToColor();
    circle.howToColor();
    square.howToColor();
  }

  @FunctionalInterface
  interface Colorable {
    void howToColor();
  }
}
