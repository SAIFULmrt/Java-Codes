package com.jubair.assignment2;

public class Rectangle {
  private double length;
  private double width;

  public Rectangle(double length, double width) {
    super();
    this.length = length;
    this.width = width;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double recPerimeter(Rectangle obj) {
    return 2 * this.getLength() + 2 * this.getWidth();
  }

  public double recArea(Rectangle obj) {
    return this.getLength() + 2 * this.getWidth();
  }

  public void drawRectangle() {

    for (int i = 1; i <= this.getWidth(); i++) {
      for (int j = 1; j <= this.getLength(); j++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }
  }
}
