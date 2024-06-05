package com.saiful.lab3;

public class InClassWork2 {

  public static void main(String[] args) {

    // 1. remainder finding

    double val = remainder(10.0, 3.0);
    System.out.println("1. " + val);

    // 2. Math functions

    // Math.pow
    System.out.println("2. " + Math.pow(2.0, -2));

    // Math.max
    System.out.println("2. " + Math.max(2.3, 4.5));

    // Math.min
    System.out.println("2. " + Math.pow(2.3, 4.5));

    // Math.abs
    System.out.println("2. " + Math.abs(-5.6));

    // 3. declaring with type cast forcedly
    @SuppressWarnings("unused")
    long var1 = 3324212415124l; // by default integer
    @SuppressWarnings("unused")
    float var2 = 3.4156f; // by default double

    // scientific notation
    double var3 = 123.456;
    double var4 = 1.23456e2;
    System.out.println("3. " + var3);
    System.out.println("3. " + var4);

    // 3. converting temperature
    double farenheit = 65.21;
    System.out.println("3. converting temperature " + farenheit + " degree F is ");
    System.out.println("3. converting temperature " + farenheitToCelsius(farenheit) + " degree C");

    // 4. type casting
    int x = (int) (5 / 2.0);
    System.out.println("4. type casting " + x);

    // 5. round-off errors
    double x1 = (5 / 9);
    System.out.println("5. round-off errors " + x1);

  }

  // 1.
  public static double remainder(double val1, double val2) {
    return (val1 % val2);
  }

  // 3.
  public static double farenheitToCelsius(double farenheit) {
    double celcius = ((((double) 5) / 9) * (farenheit - 32));
    return celcius;
  }
}
