package com.saiful.hackerrank;

import java.util.Scanner;

public class JavaEndOfFile {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    for (int i = 1; input.hasNext() == true; i++) {
      System.out.println(i + " " + input.nextLine());
    }

    input.close();
  }

}
