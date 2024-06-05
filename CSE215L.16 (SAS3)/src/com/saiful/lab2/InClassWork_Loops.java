package com.saiful.lab2;

public class InClassWork_Loops {

  public static void main(String[] args) {

    // for loop
    // increment
    for (int index = 0; index <= 10; index++) {
      System.out.println("index = " + index);
    }
    // decrement
    for (int index1 = 10; index1 >= 0; index1--) {
      System.out.println("index = " + index1);
    }

    // while loop
    // increment
    int index2 = 0;

    while (index2 <= 10) {
      System.out.println("index = " + index2);
      index2++;
    }
    // decrement
    int index3 = 10;

    while (index3 >= 0) {
      System.out.println("index = " + index3);
      index3--;
    }
  }

}