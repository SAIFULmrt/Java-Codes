package com.saiful.JavaInttoString;

import java.util.*;
import java.security.*;

public class Solution {
  public static void main(String[] args) {

    // DoNotTerminate.forbidExit();

    try {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      in.close();
      // String s=???; Complete this line below
      // String s = String.valueOf(n);
      String s = Integer.toString(n);
      System.out.println("Good job");

    } catch (Exception e) {
      System.out.println("Wrong Answer");
    }
    // Write your code here

  }
}
