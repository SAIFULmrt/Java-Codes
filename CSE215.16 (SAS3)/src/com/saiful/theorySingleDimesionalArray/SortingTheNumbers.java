package com.saiful.theorySingleDimesionalArray;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 30 Nov 2020
 */
public class SortingTheNumbers {

  public static void main(String[] args) {
    
    
    int[] list = {9,5,4,7,5,25,8,2};
    
    java.util.Arrays.sort(list);
    
    for(int value: list) {
      System.out.print(value + " ");
    }
   
    
    char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
    java.util.Arrays.sort(chars);

    
    System.out.println();
    
    for(int value: chars) {
      System.out.print((char)value + " ");
    }
    
  }
  
  
    
  

}
