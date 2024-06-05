package com.jubair.assignment3;

public class Employees {
  private String name;
  private int id;
  private int team_members;
  private String email;
  
  public Employees(String name, int id,double salary) {
    this.name = name;
    this.id = id;
    int salay = (int) salary;
  }

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
    return true;
  }
  
  public void printStatus(){
    System.out.println(getName() + " " + id /* + salary*/);
  }
  
}
