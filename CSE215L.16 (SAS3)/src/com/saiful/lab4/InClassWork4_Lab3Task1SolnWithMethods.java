package com.saiful.lab4;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 24 Nov 2020
 */
public class InClassWork4_Lab3Task1SolnWithMethods {
  public static boolean isUpperCase(char inputCharacter) {
    return (inputCharacter >= 'A' && inputCharacter <= 'Z') ? true : false;
  }

  public static boolean isLowerCase(char inputCharacter) {
    return (inputCharacter >= 'a' && inputCharacter <= 'z') ? true : false;
  }

  public static boolean isDigit(char inputCharacter) {
    return (inputCharacter >= '0' && inputCharacter <= '9') ? true : false;
  }

  public static boolean isAlphabet(char inputCharacter) {
    return ((inputCharacter >= 'A' && inputCharacter <= 'Z') || (inputCharacter >= 'a' && inputCharacter <= 'z')) ? true
        : false;
  }

  public static boolean isVowel(char inputCharacter) {
    switch (inputCharacter) {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
      return true;
    default:
      return false;

    }
  }

  public static boolean isPunctuation(char inputCharacter) {
    switch (inputCharacter) {
    case '.':
    case ',':
    case '?':
    case '!':
      return true;
    default:
      return false;
    }
  }

  public static void main(String[] args) {
    String testString = "Hello, world! I am learning Java for the last 2 days!";
    String lowerCaseStr = testString.toLowerCase();

    int index = 0;
    int lowerCaseCount = 0, upperCaseCount = 0, vowelCount = 0, consonantCount = 0, punctuationCount = 0,
        digitCount = 0;

    while (index < testString.length()) {
      char currentCharacter = testString.charAt(index);
      char currentCharacterLowerCase = lowerCaseStr.charAt(index);

      lowerCaseCount = isLowerCase(currentCharacter) ? lowerCaseCount + 1 : lowerCaseCount;
      upperCaseCount = isUpperCase(currentCharacter) ? upperCaseCount + 1 : upperCaseCount;

      punctuationCount = isPunctuation(currentCharacter) ? punctuationCount + 1 : punctuationCount;
      digitCount = isDigit(currentCharacter) ? digitCount + 1 : digitCount;
      vowelCount = isAlphabet(currentCharacter) && isVowel(currentCharacterLowerCase) ? vowelCount + 1 : vowelCount;
      consonantCount = isAlphabet(currentCharacter) && !isVowel(currentCharacterLowerCase) ? consonantCount + 1
          : consonantCount;

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
