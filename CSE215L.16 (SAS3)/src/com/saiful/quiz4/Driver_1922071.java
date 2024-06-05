package com.saiful.quiz4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.saiful.quiz4_exception.*;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 6 Jan 2021
 */
public class Driver_1922071 {

  public static void main(String[] args)
      throws InvalidHeightOrWeightException_1922071, InvalidBloodGroupException_1922071, InvalidNameException_1922071,
      InvalidAgeException_1922071, NullDataException_1922071, InvalidContactNumberException_1922071,
      InvalidGenderException_1922071, IOException, Exception {

    // Task 3 with valid data
    try {
      Person_1922071 p1 = new Person_1922071("Mohammad Saiful", "Islam", "512045678912345678",
          new Address_1922071("7-A", "22", "Pallabi"), 21, "+8801919981999", "MALE", "A+", 5.7, 75);

      System.out.println(p1);

    } catch (InvalidHeightOrWeightException_1922071 | InvalidBloodGroupException_1922071 | InvalidNameException_1922071
        | InvalidAgeException_1922071 | NullDataException_1922071 | InvalidContactNumberException_1922071
        | InvalidGenderException_1922071 exception) {
      System.out.println(exception.getMessage());
    }

    // Task 3 repeat with valid data
    try {
      Person_1922071 p2 = new Person_1922071("Tanvir", "Asif", "584621145644878",
          new Address_1922071("54", "6", "Uttara"), 21, "+8805789542145", "MALE", "O+", 5.6, 70);
      System.out.println(p2);

    } catch (InvalidHeightOrWeightException_1922071 | InvalidBloodGroupException_1922071 | InvalidNameException_1922071
        | InvalidAgeException_1922071 | NullDataException_1922071 | InvalidContactNumberException_1922071
        | InvalidGenderException_1922071 exception) {
      System.out.println(exception.getMessage());
    }

    // Task 3 with invalid data
    try {
      Person_1922071 p3 = new Person_1922071("Sam", "Saimun", "84789542145987455",
          new Address_1922071("7-H", "8", "Dhanmondi"), 25, "+8804587944654", "MALE", "AB-", 6.0, 80);

      System.out.println(p3);

    } catch (InvalidHeightOrWeightException_1922071 | InvalidBloodGroupException_1922071 | InvalidNameException_1922071
        | InvalidAgeException_1922071 | NullDataException_1922071 | InvalidContactNumberException_1922071
        | InvalidGenderException_1922071 exception) {
      System.out.println(exception.getMessage());
    }

    // Task 3 repeat with invalid data
    try {
      Person_1922071 p4 = new Person_1922071("Sayem", "Sajil", "12254789654589554",
          new Address_1922071("15-R", "20", "Bashundhara"), 20, "+8801919981999", "MALE", "C+", 5.6, 60);

      System.out.println(p4);

    } catch (InvalidHeightOrWeightException_1922071 | InvalidBloodGroupException_1922071 | InvalidNameException_1922071
        | InvalidAgeException_1922071 | NullDataException_1922071 | InvalidContactNumberException_1922071
        | InvalidGenderException_1922071 exception) {
      System.out.println(exception.getMessage());
    }

    // Task 4 with valid data write file
    try {
      Person_1922071 p5 = new Person_1922071("Kamrul", "Jony", "65544485244555444",
          new Address_1922071("59", "11", "Panthapath"), 23, "+8801875412545", "MALE", "B-", 5.8, 72);

      String pathToFile = Driver_1922071.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()
          + "com/saiful/quiz4/sample.txt";

      writeFile(pathToFile, p5);

    } catch (InvalidHeightOrWeightException_1922071 | InvalidBloodGroupException_1922071 | InvalidNameException_1922071
        | InvalidAgeException_1922071 | NullDataException_1922071 | InvalidContactNumberException_1922071
        | InvalidGenderException_1922071 exception) {
      System.out.println(exception.getMessage());
    }

    // Task 4 repeat with valid data write file
    // Task 5 read written data
    try {
      Person_1922071 p6 = new Person_1922071("Jubair", "Hasan", "85221455678854444",
          new Address_1922071("12-C", "55", "Pallabi"), 20, "+8805411474545", "MALE", "AB+", 5.6, 60);

      String pathToFile = Driver_1922071.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()
          + "com/saiful/quiz4/sample.txt";

      writeFile(pathToFile, p6);
      readFile(pathToFile);

    } catch (InvalidHeightOrWeightException_1922071 | InvalidBloodGroupException_1922071 | InvalidNameException_1922071
        | InvalidAgeException_1922071 | NullDataException_1922071 | InvalidContactNumberException_1922071
        | InvalidGenderException_1922071 exception) {
      System.out.println(exception.getMessage());
    }
  }

  // Task 1
  public static void writeFile(String pathToFile, Object newPerson) throws IOException {
    try {
      FileWriter fileWriter = new FileWriter(new File(pathToFile), true);
      fileWriter.write(newPerson.toString());
      fileWriter.close();
    } catch (IOException exception) {
      System.out.println("Write File is not Working");
    }

  }

  // Task 2
  public static void readFile(String pathToFile) throws IOException {

    int index = 0;
    try {
      File fileObj = new File(pathToFile);
      Scanner fileReader = new Scanner(fileObj);

      while (fileReader.hasNext()) {
        String line = fileReader.nextLine();
        System.out.println(line);
        if (!(line.equals("=============================================================="))) {
          index++;
        }
      }
      fileReader.close();
    } catch (IOException exception) {
      System.out.println("Read File is not Working");
    }

    System.out.println("\nTotal Number of lines: " + index);

  }

}