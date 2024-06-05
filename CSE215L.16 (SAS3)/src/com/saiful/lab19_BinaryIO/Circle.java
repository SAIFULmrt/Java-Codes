package com.saiful.lab19_BinaryIO;

import java.io.Serializable;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 5 Jan 2021
 */
public class Circle extends Shape implements Serializable {

  // auto add optional to fix error
  private static final long serialVersionUID = 8016734882622714847L;

  private double radius;

  public Circle(String color, boolean filled, double radius) {
    super(color, filled);
    this.radius = radius;
  }

  @Override
  public String toString() {
    return "Circle [" + super.toString() + ", radius=" + radius + "]";
  }

  public double getArea() {
    return Math.PI * Math.pow(this.radius, 2);
  }

}
