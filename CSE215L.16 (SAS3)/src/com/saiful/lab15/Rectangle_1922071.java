package com.saiful.lab15;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 20 Dec 2020
 */
public class Rectangle_1922071 extends Shape_1922071 {

  protected double length;
  protected double width;

  public Rectangle_1922071(boolean filled, String color, double width, double length) {
    super(filled, color);

    this.width = width;
    this.length = length;
  }

  public String toString() {
    return "Rectangle class: \n................\n" + "Color: " + this.color + "\n" + "Is Filled: " + this.filled + "\n"
        + "Length: " + this.length + "\n" + "Width: " + this.width;
  }

  public double getArea() {
    return this.width * this.length;
  }

  public double getPerimeter() {
    return 2 * (this.length + this.width);
  }

}
