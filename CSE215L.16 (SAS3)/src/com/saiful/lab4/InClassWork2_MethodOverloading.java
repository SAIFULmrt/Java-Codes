package com.saiful.lab4;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 24 Nov 2020
 */
public class InClassWork2_MethodOverloading {

  public static void main(String[] args) {

    int a = 6, b = 7;
    int result = sum(a, b);
    System.out.println(a + " + " + b + " =  " + result);

    int w = 5, x = 6, y = 7, z = 4;
    int result2 = sum(w, x, y, z);
    System.out.println(w + " + " + x + " + " + y + " + " + z + " = " + result2);

    double wdouble = 5.4, xdouble = 6.5, ydouble = 75.34, zdouble = 44.23;
    double result3 = sum(wdouble, xdouble, ydouble, zdouble);
    System.out.println(wdouble + " + " + xdouble + " + " + ydouble + " + " + zdouble + " = " + result3);

    String s1 = "hello ", s2 = "world ", s3 = "I like ", s4 = "java";
    String resultStr = sum(s1, s2, s3, s4);
    System.out.println(resultStr);

  }

  // a method that adds two integers
  // method signature: public static int sum(int a, int b)
  public static int sum(int a, int b) {
    return a + b;
  }

  // overloading
  public static int sum(int a, int b, int c, int d) {
    return a + b + d;
  }

  // overload2
  public static double sum(double a, double b, double c, double d) {
    return a + b + c + d;
  }

//overload3
  public static String sum(String a, String b, String c, String d) {
    return a + b + c + d;

  }
}
