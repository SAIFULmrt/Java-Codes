package com.saiful.theory4;

import java.util.Scanner;

public class InClassWork1 {

  public static void main(String[] args) {

    // we will take two inputs and compare them.

    Scanner input = new Scanner(System.in);
    System.out.print("First number: ");
    int firstNumber = input.nextInt();

    System.out.print("Second number: ");
    int secondNumber = input.nextInt();

    boolean greaterThan = (firstNumber > secondNumber);
    @SuppressWarnings("unused")
    boolean equals = (firstNumber > secondNumber);

    if (greaterThan) {

      System.out.println(firstNumber + " is bigger");
      System.out.println("This line will always print");

      input.close();
    }
  }

}
