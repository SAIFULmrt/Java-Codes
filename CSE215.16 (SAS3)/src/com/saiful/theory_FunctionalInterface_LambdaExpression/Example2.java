package com.saiful.theory_FunctionalInterface_LambdaExpression;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 6 Jan 2021
 */

// How Lambda Expressions are used in Java 8+

public class Example2 {
  interface Colorable {
    void howToColor();
  }

  public static void main(String... args) {
    Colorable square = new Colorable() {
      @Override
      public void howToColor() {
        System.out.println("Color all four sides");
      }
    };
    Colorable circle = () -> System.out.println("Color circular border");
    square.howToColor();
    circle.howToColor();
  }
}