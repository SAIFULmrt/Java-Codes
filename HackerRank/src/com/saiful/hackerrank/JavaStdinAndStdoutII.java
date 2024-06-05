package com.saiful.hackerrank;

import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 24 Jan 2021
 */
public class JavaStdinAndStdoutII {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int N = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    if(2 >= N || N <= 20) {
      
      for(int i=1; i<=10; i++) {
        int r = N * i;
        System.out.println(N + " * " + i + " = " + r );
      }
    }
    
    scanner.close();

  }

}
