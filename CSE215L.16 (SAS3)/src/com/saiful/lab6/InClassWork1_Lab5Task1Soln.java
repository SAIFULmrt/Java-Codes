package com.saiful.lab6;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 26 Nov 2020
 */
public class InClassWork1_Lab5Task1Soln {

  public static boolean isLengthValid(String password) {
    return password.length() >= 10;
  }

  public static boolean isOnlyLettersAndDigits(String password) {
    for (int index = 0; index < password.length(); index++) {
      char currentChar = password.charAt(index);

      if (Character.isLetterOrDigit(currentChar)) {
        return false;
      }
    }
    return true;
  }

  public static boolean containsAtLeastThreeDigits(String password) {
    int digitCount = 0;

    for (int index = 0; index < password.length(); index++) {
      char currentChar = password.charAt(index);

      if (Character.isDigit(currentChar)) {
        digitCount++;
      }

      if (digitCount >= 3) {
        return true;
      }
    }
    return false;
  }

  public static boolean isPasswordValid(String password) {
    return isLengthValid(password) && isOnlyLettersAndDigits(password) && containsAtLeastThreeDigits(password)
        && isPasswordValid(password);
  }

  public static void main(String[] args) {
    String password = "password125";

    if (isPasswordValid(password)) {
      System.out.println("Valid Password");
    } else {
      System.out.println("Invalid Password");
    }

  }

}
