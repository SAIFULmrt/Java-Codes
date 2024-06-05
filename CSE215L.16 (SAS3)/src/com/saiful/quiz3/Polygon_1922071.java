package com.saiful.quiz3;

import java.util.Date;
import java.util.GregorianCalendar;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 13 Jan 2021
 */
public abstract class Polygon_1922071 implements Comparable<Polygon_1922071>, Cloneable {
  private RGB_1922071 color;
  private Date createdOn;
  private double lengthOfSide;

  public Polygon_1922071(RGB_1922071 color, double lengthOfSide) throws CloneNotSupportedException {
    this.color = color;
    this.lengthOfSide = lengthOfSide;
  }

  public RGB_1922071 getColor() {
    return color;
  }

  public void setColor(RGB_1922071 color) {
    this.color = color;
  }

  public Date getCreatedOn() {
    this.createdOn = new GregorianCalendar().getTime();
    return createdOn;
  }

  public double getLengthOfSide() {
    return lengthOfSide;
  }

  public void setLengthOfSide(double lengthOfSide) {
    this.lengthOfSide = lengthOfSide;
  }

  public abstract byte getNumberOfSides();

  public abstract double computeArea();

  @Override
  public abstract String toString();

  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

}
