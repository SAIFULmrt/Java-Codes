package com.saiful.lab5;

public class InClassWork2 {
//Lab5Example2

  // snake_case
  // this_is_snake_case
  // CamelCase
  // ThisIsCamelCase

  public static String convertToCamelCase(String string) {
    // String result = "";
    String result = string.substring(0, 1).toUpperCase();

    for (int index = 1; index < string.length(); index++) {
      if (string.charAt(index) == '_') {
        if (index == string.length() - 1) {
          continue;
        }
        result += string.substring(index + 1, index + 2).toUpperCase();
        index++;
      } else {
        result += string.charAt(index);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(convertToCamelCase("snake_case"));
    System.out.println(convertToCamelCase("this_is_snake_case_"));

  }

}