package com.saiful.lab16;

import java.util.Scanner;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 20 Dec 2020
 */
public class Driver_1922071 {

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter red value: ");
    int red = input.nextInt();
    System.out.println("Enter green value: ");
    int green = input.nextInt();
    ;
    System.out.println("Enter blue value: ");
    int blue = input.nextInt();
    ;

    Decagon_1922071 d1 = new Decagon_1922071();

    // Decagon_1922071 d2 = new Decagon_1922071(1922);

    // Decagon_1922071 d3 = new Decagon_1922071(1922, d1.RGB(0,255,0), 4);

    System.out.println("\n" + d1.getArea());
    // System.out.println(d2.getArea());
    // System.out.println(d3.getArea());

    System.out.println("\n" + d1.toString());
    // System.out.println(d2.toString());
    // System.out.println(d3.toString());

    input.close();

  }

}
