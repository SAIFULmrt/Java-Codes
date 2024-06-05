package com.saiful.theoryquiz4_q2;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 13 Jan 2021
 */
public class NIDChecker {

  public static boolean isDigitOnly(String nid) {
    boolean isDigitCheck = false;

    for (int i = 0; i < nid.length(); i++) {
      isDigitCheck = false;

      if (nid.charAt(i) >= '0' && nid.charAt(i) <= '9') {
        isDigitCheck = true;
      } else {
        return isDigitCheck;
      }
    }
    return isDigitCheck;
  }

  public static boolean is11Digits(String nid) {
    if (nid.length() == 11) {
      return true;
    }
    return false;
  }

  public static boolean is17Digits(String nid) {
    if (nid.length() == 17) {
      return true;
    }
    return false;
  }

  public static boolean doesNIDStartWithZero(String nid) {
    if (nid.charAt(0) == '0') {
      return true;
    }
    return false;
  }

  public static boolean isValidNIDPattern(String nid) {
    for (int i = 0; i < nid.length(); i++)

      if (nid.charAt(i) != nid.charAt(0))
        return true;
    return false;

  }

}
