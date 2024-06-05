package com.saiful.theoryquiz4_q2;

import java.io.*;
import java.util.Scanner;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 12 Jan 2021
 */

public class Driver {
  public static void main(String[] args) {
    Person person = null;
    File inputFile = new File(
        "C:/Users/SAIFULmrt/eclipse-workspace/CSE215.16_Theory/src/com/saiful/theoryquiz4_q2/input.txt");
    File outputFile = new File(
        "C:/Users/SAIFULmrt/eclipse-workspace/CSE215.16_Theory/src/com/saiful/theoryquiz4_q2output.txt");
    StringBuffer outputStringBuffer = new StringBuffer();
    try (FileInputStream inputFS = new FileInputStream(inputFile);
        PrintStream outputFS = new PrintStream(outputFile);) {
      Scanner scanner = new Scanner(inputFS);
      while (scanner.hasNext()) {
        do {
          String nid = scanner.next();
          outputStringBuffer.append("Enter 11 or 18 digit NID : " + nid + "\n");
          try {
            person = new Person(nid);
            outputStringBuffer.append("Person NID: " + person + "\n");
          } catch (NIDHasCharacterException ex) {
            outputStringBuffer.append(ex);
          } catch (NIDLengthMismatchException ex) {
            outputStringBuffer.append(ex);
          } catch (NIDStartsWithZeroException ex) {
            outputStringBuffer.append(ex);
          } catch (InvalidNIDPatternException ex) {
            outputStringBuffer.append(ex);
          }
          System.out.println(outputStringBuffer.toString());
          outputFS.println(outputStringBuffer.toString());
          outputStringBuffer.delete(0, outputStringBuffer.length());
        } while (person == null);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}