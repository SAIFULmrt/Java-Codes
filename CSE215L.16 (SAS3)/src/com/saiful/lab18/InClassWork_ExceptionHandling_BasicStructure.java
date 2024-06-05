package com.saiful.lab18;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 4 Jan 2021
 */
public class InClassWork_ExceptionHandling_BasicStructure {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    try /* may or may not error */ {
      System.out.print("Enter a number: ");
      int number = input.nextInt();
      System.out.println(number);
    } catch /* handles error and tries to deal with it */ (InputMismatchException exception) {

      System.out.println(exception.toString()); // name of the exception

      System.out.println("Hey, you entered a string, most likely. " + "You need to enter a number.");

      // System.out.println(exception.getMessage()); // shows user defined message
      // exception.printStackTrace(); // exception with full red lines
    } finally /* always run */ {
      System.out.println("This code always will run, regardless " + "of weather an error occured or not");

    }

    System.out.println("Exiting the program");
    input.close();
  }

}
