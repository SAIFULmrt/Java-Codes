package com.saiful.theory4;

import java.util.Scanner;

public class InClassWork4 {

  public static void main(String[] args) {
    // method in character class

    Scanner input = new Scanner(System.in);
    System.out.println("Enter ascii value of a char: ");
    char ch = (char) (input.nextInt());
    System.out.println(ch);

    if (Character.isLetter(ch)) {
      System.out.println(ch + " is a letter");
    } else {
      System.out.println(ch + " is not a letter");
    }

    // terminate space

    Scanner input1 = new Scanner(System.in);
    System.out.println("enter space words space: ");
    String data = input1.nextLine();

    System.out.println(data.trim());

    // toUpperCase
    System.out.println(data.toUpperCase());

    // toLowerCase
    System.out.println(data.toLowerCase());

    // two strings concatenation
    String secondData = " secondPart";
    String result = data.concat(secondData);
    System.out.println(result);

    input.close();
    input1.close();

  }

}