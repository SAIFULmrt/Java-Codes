package com.saiful.theoryQuiz3_q2;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 6 Jan 2021
 */

/* Write a code that would join two strings, and return the
   new string. */

public class Q3 {

  public static void main(String[] args) {

    addTwoString refVar = (String str1, String str2) -> {
      String newString = str1 + str2;
      return newString;
    };

    System.out.println(refVar.add("Bangla", "desh"));

  }

  @FunctionalInterface
  interface addTwoString {
    String add(String str1, String str2);

  }

}
