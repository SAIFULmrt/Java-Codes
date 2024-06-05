package com.saiful.problem2;

public class problem2 {

  public static boolean validateEmail(String email) throws InvalidEmailException {
    int count = 0, countdot = 0;
    for (int i = 0; i < email.length(); i++) {
      if (email.charAt(i) == '@')
        count++;
      else if (email.charAt(i) == '.')
        countdot++;

      if (count >= 2)
        return false;
    }
    if (email.contains("northsouth.edu"))
      return true;
    else if (email.contains(".edu"))
      return true;
    else {
      String str = null;
      for (int i = 0; i < email.length(); i++) {
        if (email.charAt(i) == '@') {
          for (int j = i + 1; j < str.length(); j++) {
            if (email.charAt(i) == '.')
              break;
            str += String.valueOf(email.charAt(i));
            System.out.println("The domain is: " + str);
            return true;
          }
        }
      }
    }
    return true;
  }
}
