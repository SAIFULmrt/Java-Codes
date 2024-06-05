package com.saiful.theory4;

import java.util.Scanner;

public class InClassWork3 {

  public static void main(String[] args) {

    // ternary operator

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = input.nextInt();

    boolean positive;

    /*
     * if (number > 0) ositive = true; else positive = false;
     */

    positive = (number > 0) ? true : false; // ternary

    System.out.println("number is " + positive + "\n");

    System.out.println("Enter a num: ");
    int num = input.nextInt();

    System.out.println((num % 2 == 0) ? num + " is even" : num + " is odd");

    input.close();

  }

}