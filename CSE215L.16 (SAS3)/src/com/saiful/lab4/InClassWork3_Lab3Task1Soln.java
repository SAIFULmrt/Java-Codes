package com.saiful.lab4;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 24 Nov 2020
 */
public class InClassWork3_Lab3Task1Soln {

  public static void main(String[] args) {
    String testString = "Hello, world! I am learning Java for the last 2 days!";
    String lowerCaseStr = testString.toLowerCase();

    int index = 0;

    int lowerCaseCount = 0, upperCaseCount = 0, vowelCount = 0, consonantCount = 0, punctuationCount = 0,
        digitCount = 0;

    while (index < testString.length()) {
      char currentCharacter = testString.charAt(index);

      lowerCaseCount = (currentCharacter >= 'a' && currentCharacter <= 'z') ? lowerCaseCount + 1 : lowerCaseCount;
      upperCaseCount = (currentCharacter >= 'A' && currentCharacter <= 'Z') ? upperCaseCount + 1 : upperCaseCount;

      switch (lowerCaseStr.charAt(index)) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
        // vowel case
        vowelCount++;
        break;
      case '.':
      case ',':
      case '?':
      case '!':
        punctuationCount++;
        break;
      case ' ':
        break;
      case '0':
      case '1':
      case '2':
      case '3':
      case '4':
      case '5':
      case '6':
      case '7':
      case '8':
      case '9':
        digitCount++;
        break;
      default:
        consonantCount++;

      }

      index++;
    }

    System.out.println("Number of uppercase letters: " + upperCaseCount);
    System.out.println("Number of lowercase letters: " + lowerCaseCount);
    System.out.println("Number of vowels: " + vowelCount);
    System.out.println("Number of consonants: " + consonantCount);
    System.out.println("Number of punctuation marks: " + punctuationCount);
    System.out.println("Number of numerical digits: " + digitCount);

  }

}
