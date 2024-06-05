package com.jubair.assignment2;

public class User {
  private String name;
  private int id;
  private String email;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public boolean verifyEmail(String email) {

    int count = 0, countdot = 0;
    for (int i = 0; i < email.length(); i++) {
      if (email.charAt(i) == '@')
        count++;
      else if (email.charAt(i) == '.')
        countdot++;
    }

    if (count >= 2 || countdot == 0)
      return false;
    else
      return true;

  }

}
