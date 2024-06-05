package com.saiful.problem2;

public class Main {

  public static void main(String[] args) {

    try {

      String email = "rifat.hasan02@northsouth.edu";

      System.out.println(email + " is valid mail address: " + problem2.validateEmail(email));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    try {

      String email = "asif@@gmail.com";

      System.out.println(email + " is valid mail address: " + problem2.validateEmail(email));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }
}
