package com.saiful.lab5;

public class InClassWork1 {

  public static String reverse(String string) {
    string = string.trim();
    String result = "";

    for (int index = string.length() - 1; index >= 0; index--) {
      result += string.charAt(index);
    }

    return result;
  }

  public static boolean isPalindrome(String string) {
    // String = reverse(string
    return string.equalsIgnoreCase(reverse(string));
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome("hello, world"));
    System.out.println(isPalindrome("Racecar"));
    // System.out.println(isPalindrome(" hello, world "));

  }

}
