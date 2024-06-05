package com.saiful.theoryquiz4_q3;

import java.io.FileInputStream;
import java.util.Scanner;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 13 Jan 2021
 */
public class Driver {

  public static void main(String[] args) throws Exception {
    String pathToFile = "C:/Users/SAIFULmrt/eclipse-workspace/CSE215.16_Theory/src/com/saiful/theoryquiz4_q3/input.txt";
    version1(pathToFile);

  }

  public static void version1(String fileName) throws Exception {

    try (FileInputStream inputFS = new FileInputStream(fileName)) {

      Scanner scanner = new Scanner(inputFS);
      while (scanner.hasNextLine()) {
        System.out.println(scanner.nextLine());
      }
    } catch (Exception e) {
      System.out.println(e);
    }

  }

}
