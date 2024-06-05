package com.saiful.theory3;

//5. import
import java.util.Date;

public class InClassWork {

  public static void main(String[] args) {

    // 6. data types // -2^7 to +2^7-1

    boolean var7 = false; // 1 bit

    byte var1 = 126; // 8bit (-2^7 to +2^7-1 = -128 to 127)
    char var8 = 123; // 8bit 0 - 255 2^8

    short var2 = -3226; // 16bit (-2^15 to 2^15-1)

    int var3 = 456479999; // 32bit (-2^31 to 2^31-1)

    long var4 = 324566255; // 64bit (-2^63 to 2^63-1)

    float var5 = (float) 345.124; // 32 bit floating number
    double var6 = 432.555486; // 64 bit floating number

    System.out.println("byte va1" + var1);
    System.out.println("Short" + var2);
    System.out.println("int var3" + var3);
    System.out.println("long var4" + var4);
    System.out.println("float var5" + var5);
    System.out.println("double var6" + var6);
    System.out.println("double var8" + var8);
    System.out.println("boolean var7" + var7);

    /*
     * // 1. can not use reserve word voidP(); System.out.println("Main method");
     */

    // 3. code re usability by using method
    anotherMethodTakesTwoParams(34, 54);
    anotherMethodTakesTwoParams(24, 32);

  }

  public static void voidP() { // void is reserve
    System.out.println("voidP method");

    // 2. scoping of the variable
    {
      int b = 30; // outer block variable
      {
        int a = 10; // inner block variable
        System.out.println(b + "b in inner block");
        System.out.println(a + "a in inner block");
        {
          System.out.println(b + "b in inner inner block");
        }
      }
      System.out.println(b + "b in outer block");
      // System.out.println(a + "a in outer block"); // error cant access
    }

  }

  // 3. code re usability by using method
  public static void anotherMethodTakesTwoParams(int a, int b) {
    System.out.println(a + " , " + b);
  }

  // 4. java doc comment
  /**
   * This goes into help section in javadoc
   */

//5. import
  Date date = new Date();

}