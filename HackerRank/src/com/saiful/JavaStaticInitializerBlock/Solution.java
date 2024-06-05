package com.saiful.JavaStaticInitializerBlock;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  static Scanner input = new Scanner(System.in);

  public static boolean flag = true;
  public static int B = input.nextInt();
  public static int H = input.nextInt();

  static {
    try {
      if (B <= 0 || H <= 0) {
        flag = false;
        throw new Exception("Breadth and height must be positive");
      }
    } catch (Exception e) {
      System.out.print(e);
    }
  }

//Write your code here

  public static void main(String[] args) {
    if (flag) {
      int area = B * H;
      System.out.print(area);
    }

  }// end of main

}// end of class
