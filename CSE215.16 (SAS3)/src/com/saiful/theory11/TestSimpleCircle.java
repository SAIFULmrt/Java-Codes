package com.saiful.theory11;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 7 Dec 2020
 */
public class TestSimpleCircle {

  public static void main(String[] args) {
    SimpleCircle circle1 = new SimpleCircle();
    printArea(circle1);

    SimpleCircle circle2 = new SimpleCircle(10.2);
    printPerimeter(circle2);
    
    circle2.radius = 100;
    printPerimeter(circle2);

  }

  public static void printArea(SimpleCircle circle) {
    System.out.println("The area of the circle of radius " + circle.radius + " is " + circle.getArea());
  }

  public static void printPerimeter(SimpleCircle circle) {
    System.out.println("The perimeter of the circle of radius " + circle.radius + " is " + circle.getPerimeter());
  }

}

class SimpleCircle {
  double radius;

  SimpleCircle() {
    // radius = 1;
    this(1);
  }

  SimpleCircle(double newRadius) {
    radius = newRadius;
  }

  double getArea() {
    return (Math.PI * radius * radius);
  }

  double getPerimeter() {
    return (2 * Math.PI * radius);
  }
}
