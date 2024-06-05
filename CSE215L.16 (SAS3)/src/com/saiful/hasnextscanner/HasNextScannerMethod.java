package com.saiful.hasnextscanner;

import java.util.Scanner;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 14 Jan 2021
 */
public class HasNextScannerMethod {

  public static void main(String[] args) {
    
    System.out.println("First example\n");

    Scanner input = new Scanner(System.in);

    System.out.print("Input your age: ");

    while (!input.hasNextInt()) {
      input.next();
      System.out.println("Your input is not valid. Try again.");
      System.out.print("Input your age: ");
    }

    int age = input.nextInt();

    System.out.println("You are: " + age);

    input.close();

    // another example

    System.out.println("\nAnother example\n");

    String s = "Hello World! 3 + 3.0 = 6";

    // create a new scanner with the specified String Object
    Scanner scanner = new Scanner(s);

    // check if the scanner has a token
    System.out.println("" + scanner.hasNext());

    // print the rest of the string
    System.out.println("" + scanner.nextLine());

    // check if the scanner has a token after printing the line
    System.out.println("" + scanner.hasNext());

    // close the scanner
    scanner.close();

  }

}