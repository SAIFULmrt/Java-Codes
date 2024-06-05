package com.saiful.JavaStringsIntroduction;

import java.util.*;

public class Solution {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String B = sc.next();

    sc.close();

    /* Enter your code here. Print output to STDOUT. */

    // 1st line output
    System.out.println(A.length() + B.length());

    // 2nd line output
    int stringCompare = A.compareTo(B);
    if (stringCompare > 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    // 3rd line output
    String firstString = A.substring(0, 1).toUpperCase() + A.substring(1);
    String secondString = B.substring(0, 1).toUpperCase() + B.substring(1);

    System.out.println(firstString + " " + secondString);
  }
}