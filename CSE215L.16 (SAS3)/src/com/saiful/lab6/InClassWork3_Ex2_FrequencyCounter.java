package com.saiful.lab6;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 26 Nov 2020
 */
public class InClassWork3_Ex2_FrequencyCounter {

  public static boolean isAlphabet(char inputChar) {
    return (inputChar >= 'a' && inputChar <= 'z');
  }

  public static int[] computeFrequencyOfCharactersInString(String testString) {

    // 0 1 2 3 4 5 6 7 ...
    // a b c d e f g h ...
    // 4 0 1 9 4 3 0 0 ...

    // only want to count the frequency of alphabets 10
    int[] frequencyArray = new int[26];

    for (int index = 0; index < testString.length(); index++) {
      char currentCharacter = testString.charAt(index);

      if (currentCharacter == ' ' || !isAlphabet(currentCharacter)) {
        continue;
      }

      int frequencyArrayIndex = (int) currentCharacter - (int) 'a';
      frequencyArray[frequencyArrayIndex]++;
    }

    return frequencyArray;
  }

  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your string:");
    // assuming only lower case alphabets
    String testString = input.nextLine().toLowerCase();

    String[] alphabets = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
        "s", "t", "u", "v", "w", "x", "y", "z" };

    System.out.println(Arrays.toString(alphabets));
    System.out.println(Arrays.toString(computeFrequencyOfCharactersInString(testString)));

  }

}