package com.saiful.loop;

import java.util.*;
import java.io.*;

class JavaLoopsII {
  public static void main(String[] argh) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int i = 0; i < t; i++) {
      int a = in.nextInt();
      int b = in.nextInt();
      int n = in.nextInt();
      int q = a;
      for (int j = 0; j < n; j++) {
        q += (Math.pow(2, j) * b);
        System.out.printf("%s ", q);
      }
      System.out.println();
    }
    in.close();
  }
}