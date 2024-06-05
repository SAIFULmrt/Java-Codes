package com.saiful.theory4;

import java.util.Scanner;

public class InClassWork2 {

  public static void main(String[] args) {

    // using operator
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = input.nextInt();

    if ((number % 2 == 0) && (number % 3 == 0)) {
      System.out.println("Number is divisible by both 2 and 3");
    }
    if ((number % 2 == 0) || (number % 3 == 0)) {
      System.out.println("Number is divisible by both 2 or 3");
    }
    if ((number % 2 == 0) ^ (number % 3 == 0)) {
      System.out.println("Number is divisible by both 2 or 3 but not both");
    }

    input.close();

  }

}