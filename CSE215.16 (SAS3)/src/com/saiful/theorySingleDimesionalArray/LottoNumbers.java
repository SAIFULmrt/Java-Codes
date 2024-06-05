package com.saiful.theorySingleDimesionalArray;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 30 Nov 2020
 */

/*Suppose you play the Pick-10 lotto.Each ticket has 10 unique numbers ranging from 1 to 99. You buy a lot of tickets.
You like to have your tickets to cover all numbers from 1 to 99. Write a program that reads the ticket numbers from 
a file and checks whether all numbers are covered.Assume the last number in the file is 0.*/

import java.util.Scanner;

public class LottoNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean[] isCovered = new boolean[99]; // default false

    // Read all numbers and mark corresponding element covered
    int number = input.nextInt();
    while (number != 0) {
      isCovered[number - 1] = true;
      number = input.nextInt();
    }

    // Check if all covered
    boolean allCovered = true; // Assume all covered
    for (int i = 0; i < 99; i++)
      if (!isCovered[i]) {
        allCovered = false; // Find one number is not covered
        break;
      }

    // Display result
    if (allCovered)
      System.out.println("The tickets cover all numbers");
    else
      System.out.println("The tickets don’t cover all numbers");

    input.close();
  }
}
