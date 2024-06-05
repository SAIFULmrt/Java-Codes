package com.jubair.assignment2;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 26 Jan 2021
 */
public class A {

  public static void main(String[] args) {
    
    String email = "sayem@gmail.com";
    
    int count = 0, countdot = 0;
    for (int i = 0; i < email.length(); i++) {
      if (email.charAt(i) == '@')
        count++;
      else if (email.charAt(i) == '.')
        countdot++;
    }

      if (countdot == 0)
        System.out.print(countdot);
  

  }

}
