package com.jubair.assignment2;

public class Triangle {
  private double base;
  private double height;

  public Triangle(double length, double width) {
    this.height = length;
    this.base = width;
  }

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double triPerimeter(Triangle obj) {
    return this.getHeight() + this.getHeight() + this.getBase();
  }

  public double triArea(Triangle obj) {
    return 0.5 * this.getBase() * this.getHeight();
  }

  public void drawTriangle() {
    for (int i = 1; i <= this.getHeight(); ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
