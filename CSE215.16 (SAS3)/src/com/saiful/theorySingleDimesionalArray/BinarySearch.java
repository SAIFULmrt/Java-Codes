package com.saiful.theorySingleDimesionalArray;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 30 Nov 2020
 */
public class BinarySearch {

  public static void main(String[] args) {
    
    int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    
    int result = java.util.Arrays.binarySearch(list, 59);
    System.out.println(result);
    
    System.out.println("Index is " + 
      java.util.Arrays.binarySearch(list, 11));
    
    char[] chars = {'a', 'c', 'g', 'x', 'y', 'z'};
    System.out.println("Index is " + 
      java.util.Arrays.binarySearch(chars, 't'));
  }

}
