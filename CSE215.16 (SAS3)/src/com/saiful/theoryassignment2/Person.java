package com.saiful.theoryassignment2;

import java.time.LocalDate;
import java.util.*;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 20 Dec 2020
 */

class Person {

  private String firstName;
  private String lastName;
  private String fathersName;
  private String mothersName;
  private LocalDate birthDate;
  private String nidNumber;
  private Pixel[][] twoDpixelArr;

  private Person(String firstName, String lastName, String fathersName, String mothersName, String nidNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.fathersName = fathersName;
    this.mothersName = mothersName;
    this.nidNumber = nidNumber;
  }

  private Person(String firstName, String lastName, String fathersName, String mothersName, LocalDate birthDate,
      String nidNumber, Pixel[][] twoDpixelArr) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.fathersName = fathersName;
    this.mothersName = mothersName;
    this.birthDate = birthDate;
    this.nidNumber = nidNumber;
    this.twoDpixelArr = twoDpixelArr;
  }

  public String firstName(String firstName) {
    if (isValidName(firstName))
      this.firstName = firstName;
    return firstName;
  }

  public String lastName(String lastName) {
    if (isValidName(lastName))
      this.lastName = lastName;
    return lastName;
  }

  public String fathersName(String fathersName) {
    if (isValidName(fathersName))
      this.fathersName = fathersName;
    return fathersName;
  }

  public String mothersName(String mothersName) {
    if (isValidName(mothersName))
      this.mothersName = mothersName;
    return mothersName;
  }

  public String nid(String nidNumber) {
    if (isValidNID(nidNumber))
      this.nidNumber = nidNumber;
    return nidNumber;
  }

  public LocalDate birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return birthDate;
  }

  public Pixel[][] getTwoDpixelArr() {
    return twoDpixelArr;
  }

  public void setTwoDpixelArr(Pixel[][] twoDpixelArr) {
    if (twoDpixelArr == null || twoDpixelArr.length != 256 || twoDpixelArr[0].length != 256)
      this.twoDpixelArr = new Pixel[256][256];
    else {
      this.twoDpixelArr = twoDpixelArr;
    }
  }

  public static Person getPerson(String firstName, String lastName, String fathersName, String mothersName,
      String nidNumber) {
    if (!isValidName(firstName) || !isValidName(lastName) || !isValidName(fathersName) || !isValidName(mothersName))
      return null;
    if (!isValidNID(nidNumber))
      return null;
    Person p1 = new Person(firstName, lastName, fathersName, mothersName, nidNumber);
    p1.birthDate(null);
    p1.setTwoDpixelArr(null);
    generateRandomPixel(p1.getTwoDpixelArr());
    return p1;
  }

  public static Person getPerson(String firstName, String lastName, String fathersName, String mothersName,
      LocalDate birthDate, String nidNumber, Pixel[][] twoDpixelArr) {
    if (!isValidName(firstName) || !isValidName(lastName) || !isValidName(fathersName) || !isValidName(mothersName))
      return null;
    if (!isValidNID(nidNumber))
      return null;
    Person p1 = new Person(firstName, lastName, fathersName, mothersName, nidNumber);
    p1.birthDate(birthDate);
    p1.setTwoDpixelArr(twoDpixelArr);
    generateRandomPixel(p1.getTwoDpixelArr());
    return p1;
  }

  private static boolean isNumeric(String number) {
    char[] c = number.toCharArray();
    for (Character x : c) {
      if (x < '0' || x > '9')
        return false;
    }
    return true;
  }

  private static boolean isLetter(String letter) {
    char[] c = letter.toCharArray();
    for (Character x : c) {
      if ((x < 'A' || x > 'Z') && (x < 'a' || x > 'z') && (x < ' ' || x > ' '))
        return false;
    }
    return true;
  }

  public static boolean isValidName(String name) {
    if (name == null || name.trim().equals(""))
      return false;

    if (isLetter(name))
      return true;

    return false;
  }

  public static boolean isValidNID(String nid) {
    if (nid == null)
      return false;
    if (nid.length() == 11 || nid.length() == 18) {
      if (isNumeric(nid))
        return true;
    }
    return false;
  }

  private static void generateRandomPixel(Pixel[][] p) {
    if (p == null)
      return;

    for (int i = 0; i < p.length; i++) {
      for (int j = 0; j < p[0].length; j++) {
        int b = (int) (Math.random() * 256);
        int c = (int) (Math.random() * 256);
        int d = (int) (Math.random() * 256);
        p[i][j] = new Pixel(b, c, d);
      }
    }
  }

  public static String reEnterData(String str) {
    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
    while (Person.isValidName(str) == false) {
      System.out.print("Invalid data please re-enter : ");
      str = input.nextLine().trim();
    }
    return str;
  }

  public static String reEnterData1(String str) {
    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
    while (!Person.isValidNID(str)) {
      System.out.print("Invalid nid please re-enter : ");
      str = input.nextLine().trim();
    }
    return str;
  }

  public String toString() {
    return "Printing the persons information: \n" + "First Name: " + firstName + "\nLast Name: " + lastName
        + "\nFathers Name: " + fathersName + "\nMothers Name: " + mothersName + "\nNID Number: " + nidNumber
        + "\nADate Of Birth: " + birthDate + "\n\n" + Arrays.toString(getTwoDpixelArr());
  }

}

class Pixel {
  private int red;
  private int green;
  private int blue;

  Pixel(int red, int green, int blue) {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  public String toString() {
    return "{" + red + " " + green + " " + blue + "}";

  }
}