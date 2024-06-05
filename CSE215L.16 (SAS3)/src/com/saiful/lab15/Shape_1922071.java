package com.saiful.lab15;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 20 Dec 2020
 */
public class Shape_1922071 {

  protected boolean filled;
  protected String color;

  public Shape_1922071(boolean filled, String color) {
    this.filled = filled;
    this.color = color;
  }

  public String toString() {
    return "Shape class: \n.............\n" + "Color: " + this.color + "\n" + "Is Filled: " + this.filled;
  }

}