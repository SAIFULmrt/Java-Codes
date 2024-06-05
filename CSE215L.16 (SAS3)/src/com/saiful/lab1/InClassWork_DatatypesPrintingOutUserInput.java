package com.saiful.lab1;

// built-in // header file in C
import java.util.Scanner;

public class InClassWork_DatatypesPrintingOutUserInput {

  public static void main(String[] args) {

    // 1. data types

    int myInteger = 6;
    @SuppressWarnings("unused")
    float myFloat = 7.5f;
    double myDouble = 4.6;
    char myChar = 'c';

    // 2. syntactic sugar
    boolean myBoolean = true; // 1
    @SuppressWarnings("unused")
    boolean MyOtherBoolean = false; // 0

    /*
     * In C We take string as
     * 
     * //1st way char * myString = (char *) calloc(50, sizeof(char));
     * strcpy(myString, "Hello, world");
     */

    /*
     * another way char myString[] = { "Hello, world" }:
     */

    String myString = "Hello, world";
    String myOtherString = "Java is awesome";

    // 3. findingStringLength
    myString.length();
    myOtherString.length();

    // 4. printing out data

    // 5. string concatenation
    // if you have two strings => you combine them into a single string
    System.out.println("The value of myInteger is " + myInteger);
    System.out.println("The value of myDouble is " + myDouble);
    System.out.println("The value of myChar is " + myChar);
    System.out.println("The value of myBoolean is " + myBoolean);
    System.out.println("The value of myOtherString is " + myOtherString);

    // another way of print
    System.out
        .println("The value of myBoolean is " + myBoolean + "\n" + "The value of myOtherString is " + myOtherString);

    System.out.println("\n");

    // 6. Taking user input

    /*
     * // example for easily understand You want to construct a building 1.
     * Blueprint = Scanner 2. Raw materials = new Scanner(System.in) 3. Building =
     */

    // input

    /*
     * human to computer // input stream (in) computer to human // output stream
     * (out) error stream (err)
     */

    // you are creating/instantiating an object of type Scanner
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter an integer: ");
    int userGivenInteger = input.nextInt();
    System.out.println("userGivenInterger = " + userGivenInteger);

    System.out.println("Please enter an double: ");
    double userGivenDouble = input.nextDouble();
    System.out.println("userGivenDouble = " + userGivenDouble);

    // just true or false
    System.out.println("Please enter an boolean: ");
    boolean userGivenBoolean = input.nextBoolean();
    System.out.println("userGivenBoolean = " + userGivenBoolean);

    // get rid of stray new line character // solve for prob1
    input.nextLine();

    // #prob1 uporer new line char ta ekhane auto niye nicche buffer e new line char
    // ta roye jay
    System.out.println("Please enter an string: ");
    String userGivenString = input.nextLine();
    System.out.println("userGivenString = " + userGivenString);

    // nextLine() for strings with spaces, next() for words
    System.out.println("Please enter an string: ");
    String otherString = input.next();
    System.out.println("otherString = " + otherString);

    input.close();

  }

}