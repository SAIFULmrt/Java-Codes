package com.saiful.lab19_BinaryIO;

import java.io.Serializable;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 5 Jan 2021
 */
public class Shape implements Serializable {

  // auto fix optional error
  private static final long serialVersionUID = -4340978022943746860L;

  // private static final long serialVersionUID = 45474545478544L;

  // no-arg constructor needed for Serializable
  public Shape() {

  }

  private String color;
  private boolean filled;

  public Shape(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }

  @Override
  public String toString() {
    return "Shape [color=" + color + ", filled=" + filled + "]";
  }

}
