package com.saiful.lab6;

import java.util.Arrays;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 26 Nov 2020
 */
public class InClassWork1_ArraysLastClassRivision {

  public static void main(String[] args) {

    // declearing an arrays
    int size = 10;
    @SuppressWarnings("unused")
    int[] myArray = new int[size];
    String[] weekdays = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };

    System.out.println(weekdays.length);

    // for loop
    // Arrays.toString()
    System.out.println(Arrays.toString(weekdays));
    // enhanced for loop
    for (String weekday : weekdays) {
      System.out.println(weekday);
    }

  }

}