package com.saiful.theoryassignment1;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 27 Nov 2020
 */

public class Problem1 {

  public static void main(String[] args) {

    isPalindrome("Aba");
    isPalindrome("Tu4Ut");
    isPalindrome("O0hOo");
    System.out.println();
    isPalindrome(5502);
    isPalindrome(10401);
    isPalindrome(8899);
    System.out.println();
    isPalindrome(10342124301L);
    isPalindrome(10522124301L);
    isPalindrome(10482128401L);
    System.out.println();
    isPalindrome(103E01f);
    isPalindrome(58.85f);
    isPalindrome(10.01f);
    System.out.println();
    isPalindrome(104.401);
    isPalindrome(584.245);
    isPalindrome(458.854);

  }

  public static void isPalindrome(String string) {
    String stringBackup = string;
    String reversedString = "";
    char[] newString = new char[string.length()];

    for (int index = 0; index < string.length(); index++) {
      newString[index] = string.charAt(index);
      switch (newString[index]) {
      case '0':
        newString[index] = 'O';
        break;
      case '1':
        newString[index] = 'i';
        break;
      case 'l':
        newString[index] = 'i';
        break;
      case '3':
        newString[index] = 'E';
        break;
      default:
        break;
      }

    }

    String stringCopy = new String(newString);
    string = stringCopy.toLowerCase();

    for (int index = string.length() - 1; index >= 0; index--) {
      reversedString += string.charAt(index);
    }

    boolean result = string.equals(reversedString);

    System.out.println((result == true) ? stringBackup + " is a palindrome" : stringBackup + " is not a palindrome");
  }

  public static void isPalindrome(int intNum) {
    String reversedIntegerNumber = "";

    String string = String.valueOf(intNum);

    for (int index = string.length() - 1; index >= 0; index--) {
      reversedIntegerNumber += string.charAt(index);
    }

    boolean result = string.equals(reversedIntegerNumber);
    System.out.println((result == true) ? intNum + " is a palindrome" : intNum + " is not a palindrome");
  }

  public static void isPalindrome(long longNum) {
    String reversedLongNumber = "";

    String string = String.valueOf(longNum);

    for (int index = string.length() - 1; index >= 0; index--) {
      reversedLongNumber += string.charAt(index);
    }

    boolean result = string.equals(reversedLongNumber);
    System.out.println((result == true) ? longNum + " is a palindrome" : longNum + " is not a palindrome");
  }

  public static void isPalindrome(float floatNum) {
    String reversedFloatingNumber = "";

    String string = String.valueOf(floatNum);

    for (int index = string.length() - 1; index >= 0; index--) {
      reversedFloatingNumber += string.charAt(index);
    }

    boolean result = string.equals(reversedFloatingNumber);
    System.out.println((result == true) ? floatNum + " is a palindrome" : floatNum + " is not a palindrome");
  }

  public static void isPalindrome(double doubleNum) {
    String reversedDoubleNumber = "";

    String string = String.valueOf(doubleNum);

    for (int index = string.length() - 1; index >= 0; index--) {
      reversedDoubleNumber += string.charAt(index);
    }

    boolean result = string.equals(reversedDoubleNumber);
    System.out.println((result == true) ? doubleNum + " is a palindrome" : doubleNum + " is not a palindrome");
  }
}