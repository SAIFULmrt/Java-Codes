package com.saiful.lab4;

public class InClassWork1_MethodsBasics {

  public static void main(String[] args) {

    int a = 6, b = 7;

    int result = sum(a, b);
    System.out.println(a + " + " + b + " =  " + result);

    int w = 5, x = 6, y = 7, z = 4;

    int result2 = sum2(w, x, y, z);
    System.out.println(w + " + " + x + " + " + y + " + " + z + " = " + result2);
  }

  // a method that adds two integers
  public static int sum(int a, int b) {
    return a + b;
  }

  public static int sum2(int a, int b, int c, int d) {
    return a + b + d;
  }
}