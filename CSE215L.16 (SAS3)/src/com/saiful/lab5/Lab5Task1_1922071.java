package com.saiful.lab5;

import java.util.Scanner;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 15 Nov 2020
 */
public class Lab5Task1_1922071 {

  // static method that checks whether a string is a valid password
  public static boolean checkUserInputPassword(String password) {
    int charCount = 0;
    int numCount = 0;

    // password must have at least 10 characters
    if (password.length() < 10)
      return false;

    // password contains only letters and digits
    for (int index = 0; index < password.length(); index++) {
      char character = password.charAt(index);

      if (character >= 'a' && character <= 'z') {
        charCount++;
      } else if (character >= 'A' && character <= 'Z') {
        charCount++;
      } else if (character >= '0' && character <= '9') {
        numCount++;
      } else
        return false;

    }
    // pasword must contains at least 3 digits
    if (charCount >= 0 && numCount >= 3) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("The password rules are: \n" + "• A password must have at least ten characters.\n"
        + "• A password consists of only letters and digits.\n" + "• A password must contain at least three digits.\n");

    // taking password as string
    System.out.println("Enter password: ");
    String userInputPassword = input.nextLine();

    // calling method and print output
    if (checkUserInputPassword(userInputPassword)) {
      System.out.println("\nValid Password");
    } else {
      System.out.println("\nInvalid Password");
    }

    input.close();

  }

}