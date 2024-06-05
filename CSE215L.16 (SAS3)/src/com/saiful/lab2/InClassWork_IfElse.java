package com.saiful.lab2;

public class InClassWork_IfElse {

  public static void main(String[] args) {

    // 1. random number
    // System.out.println(Math.random()); //main code
    int minimum = 1;
    int maximum = 20;

    int randomNumber = (int) (minimum + (Math.random() * (maximum - minimum + 1)));
    System.out.println("Random number: " + randomNumber);

    // 2. square power
    System.out.println(Math.pow(7, 3));

    // 3. if else
    double marks = 89;
    String grade = "";

    if (marks >= 90) {
      grade = "A";
    } else if (marks >= 80 && marks < 90) {
      grade = "B";
    } else if (marks >= 70 && marks < 80) {
      grade = "C";
    } else {
      grade = "D";
    }

    System.out.println("Grade is: " + grade);

    // switch case

    String grade1 = "H";

    switch (grade1) {
    case "A":
      System.out.println("Marks obtained is greater than 90");
      break;
    case "B":
      System.out.println("Marks obtained is in the range 80 - 89.99");
      break;
    case "C":
      System.out.println("Marks obtained is in the range 70 - 79.99");
      break;
    case "D":
      System.out.println("Marks obtained is below 70");
      break;
    default:
      System.out.println("Invalid greade");

    }

  }

}