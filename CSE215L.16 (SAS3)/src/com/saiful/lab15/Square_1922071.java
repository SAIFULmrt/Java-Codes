package com.saiful.lab15;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 20 Dec 2020
 */
public class Square_1922071 extends Rectangle_1922071 {

  public Square_1922071(boolean filled, String color, double sideLenght) {
    super(filled, color, sideLenght, sideLenght);

  }

  public String toString() {
    return "Square class: \n.............\n" + "Color: " + this.color + "\n" + "Is Filled: " + this.filled + "\n"
        + "Length of Side: " + this.width;
  }
}