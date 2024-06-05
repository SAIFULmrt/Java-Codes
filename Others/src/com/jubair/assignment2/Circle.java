package com.jubair.assignment2;

public class Circle {
  private double radius;

  public Circle(double length, double width) {
    this.radius = length;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double circCircumference(Circle obj) {
    return 2 * 3.1416 * this.getRadius();
  }

  public double recArea(Circle obj) {
    return 3.1416 * this.getRadius() * this.getRadius();
  }

  public void drawCircle() {

    for (int i = 0; i <= 2 * this.getRadius(); i++) {

      for (int j = 0; j <= 2 * this.getRadius(); j++) {
        double dist = Math
            .sqrt((i - this.getRadius()) * (i - this.getRadius()) + (j - this.getRadius()) * (j - this.getRadius()));

        if (dist > this.getRadius() - 0.5 && dist < this.getRadius() + 0.5)
          System.out.print("*");
        else
          System.out.print(" ");
      }

      System.out.print("\n");
    }
  }
}
