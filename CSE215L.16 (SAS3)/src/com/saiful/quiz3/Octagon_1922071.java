package com.saiful.quiz3;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 13 Jan 2021
 */

public class Octagon_1922071 extends Polygon_1922071 {
  private final byte NUMBER_OF_SIDES = 8;

  public Octagon_1922071(RGB_1922071 color, double lengthOfSide) throws CloneNotSupportedException {
    super(color, lengthOfSide);
  }

  public int compareTo(Octagon_1922071 anotherObject) {
    double firstObject = this.computeArea();
    double secondObject = anotherObject.computeArea();

    if (firstObject < secondObject) {
      return -1;
    } else if (firstObject == secondObject) {
      return 0;
    }
    return 1;
  }

  public byte getNumberOfSides() {
    return this.NUMBER_OF_SIDES;
  }

  public double computeArea() {
    return (2 * (1 + Math.sqrt(2)) * super.getLengthOfSide());
  }

  @Override
  public String toString() {
    return "Type: Octagon" + "\nDate: " + super.getCreatedOn() + "\nRGB color: " + super.getColor()
        + "\nTotal Number of Sides: " + getNumberOfSides() + "\n";
  }

  @Override
  public int compareTo(Polygon_1922071 object) {
    return 0;
  }

}
