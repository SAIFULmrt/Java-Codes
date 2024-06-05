package com.saiful.lab16;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 20 Dec 2020
 */
public class Decagon_1922071 {
  private double side;
  private RGB_1922071 color;
  private Date createdOn;

  public Decagon_1922071() {
    this.side = 1.0;
    // this.color ;
  }

  public Decagon_1922071(double side, RGB_1922071 color) {
    this.side = side;
    this.color = color;
    this.createdOn = new GregorianCalendar(2020, Calendar.APRIL, 0, 0, 0, 0).getTime();
  }

  public double getArea() {
    return ((5 / 2) * ((this.side * this.side) * (Math.sqrt(5 + 2 * Math.sqrt(5)))));
  }

  public double getLengthOfSide() {
    return this.side;
  }

  public String getColor() {
    return "";
  }

  public Date getCreatedOn() {
    return this.createdOn;
  }

  public void setColor(RGB_1922071 color) {
    this.color = color;
  }

  public void setSide(double side) {
    this.side = side;
  }

  public String toString() {
    return "Length of side: " + this.side + "\n" + "Color: " + this.color + "\n" + "Created On: " + this.createdOn;
  }
}