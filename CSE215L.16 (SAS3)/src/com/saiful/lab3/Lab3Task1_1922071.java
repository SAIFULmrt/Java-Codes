package com.saiful.lab3;

import java.util.Scanner;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  Date: November 07, 2020
 */

public class Lab3Task1_1922071 {

  public static void main(String[] args) {

    // taking user input
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a string: ");
    String UserInput = input.nextLine();

    // declare variables
    int UppercaseLetters = 0;
    int LowercaseLetters = 0;
    int Vowels = 0;
    int Consonants = 0;
    int PuntuationMarks = 0;
    int NumericalDigits = 0;

    // finding string length
    int length = UserInput.length();

    // checking every characters individually using while loops and switch case
    int index = 0;
    while (index < length) {
      char character = UserInput.charAt(index);
      switch (character) {

      // checking upper case , vowels and consonants
      case 'A':
        Vowels++;
        UppercaseLetters++;
        break;
      case 'B':
      case 'C':
      case 'D':
        Consonants++;
        UppercaseLetters++;
        break;
      case 'E':
        Vowels++;
        UppercaseLetters++;
        break;
      case 'F':
      case 'G':
      case 'H':
        Consonants++;
        UppercaseLetters++;
        break;
      case 'I':
        Vowels++;
        UppercaseLetters++;
        break;
      case 'J':
      case 'K':
      case 'L':
      case 'M':
      case 'N':
        Consonants++;
        UppercaseLetters++;
        break;
      case 'O':
        Vowels++;
        UppercaseLetters++;
        break;
      case 'P':
      case 'Q':
      case 'R':
      case 'S':
      case 'T':
        Consonants++;
        UppercaseLetters++;
        break;
      case 'U':
        Vowels++;
        UppercaseLetters++;
        break;
      case 'V':
      case 'W':
      case 'X':
      case 'Y':
      case 'Z':
        Consonants++;
        UppercaseLetters++;
        break;

      // checking lower case , vowels and consonants
      case 'a':
        Vowels++;
        LowercaseLetters++;
        break;
      case 'b':
      case 'c':
      case 'd':
        Consonants++;
        LowercaseLetters++;
        break;
      case 'e':
        Vowels++;
        LowercaseLetters++;
        break;
      case 'f':
      case 'g':
      case 'h':
        Consonants++;
        LowercaseLetters++;
        break;
      case 'i':
        Vowels++;
        LowercaseLetters++;
        break;
      case 'j':
      case 'k':
      case 'l':
      case 'm':
      case 'n':
        Consonants++;
        LowercaseLetters++;
        break;
      case 'o':
        Vowels++;
        LowercaseLetters++;
        break;
      case 'p':
      case 'q':
      case 'r':
      case 's':
      case 't':
        Consonants++;
        LowercaseLetters++;
        break;
      case 'u':
        Vowels++;
        LowercaseLetters++;
        break;
      case 'v':
      case 'w':
      case 'x':
      case 'y':
      case 'z':
        Consonants++;
        LowercaseLetters++;
        break;

      // checking punctuation .,?! only
      case '.':
      case ',':
      case '?':
      case '!':
        PuntuationMarks++;
        break;

      // checking numerical digits
      case '0':
      case '1':
      case '2':
      case '3':
      case '4':
      case '5':
      case '6':
      case '7':
      case '8':
      case '9':
        NumericalDigits++;
        break;

      }
      index++;
    }

    // printing out result
    System.out.println("\nNumber of uppercase letters: " + UppercaseLetters);
    System.out.println("Number of lowercase letters: " + LowercaseLetters);
    System.out.println("Number of vowels: " + Vowels);
    System.out.println("Number of consonants: " + Consonants);
    System.out.println("Number of punctuation marks: " + PuntuationMarks);
    System.out.println("Number of numerical digits: " + NumericalDigits);

    input.close();

  }
}
