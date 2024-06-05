package com.saiful.lab7;

import java.util.Scanner;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 17 Nov 2020
 */
public class Quiz1Task1_1922071 {

  public static void main(String args[]) {

    System.out.println("Enter the number : ");
    @SuppressWarnings("resource")
    int palindrome = new Scanner(System.in).nextInt();

    if (isPalindromicInteger(palindrome)) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not a palindrome");
    }

  }

  public static boolean isPalindromicInteger(int number) {
    int palindrome = number;

    int reverse = 0;

    while (palindrome != 0) {
      int remainder = palindrome % 10;
      reverse = reverse * 10 + remainder;
      palindrome = palindrome / 10;
    }

    if (number == reverse) {
      return true;
    }
    return false;
  }

}
