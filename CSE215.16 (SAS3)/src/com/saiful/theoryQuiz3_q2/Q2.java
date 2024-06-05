package com.saiful.theoryQuiz3_q2;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 6 Jan 2021
 */

/*
2. Write three shapes, circle, triangle, rectangle using lambda expressions, which would
print colors of a shape; a circle will always be red, a triangle will be blue, and a
rectangle will be green.
*/
public class Q2 {

  public static void main(String[] args) {

    Colorable circle = () -> System.out.println("Red");
    Colorable triangle = () -> System.out.println("Blue");
    Colorable rectangle = () -> System.out.println("Green");

    circle.color();
    triangle.color();
    rectangle.color();

  }

  @FunctionalInterface
  interface Colorable {
    void color();
  }

}
