package com.saiful.theory9;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 18 Dec 2020
 */
public class Arrays_Copy {

  public static void main(String[] args) {
    
   
    
    
    int[] sourceArray = { 2, 3, 1, 5, 10 };
    int[] targetArray = new int[sourceArray.length];
     
    // type1
    
    for (int i = 0; i < sourceArray.length; i++) {
      targetArray[i] = sourceArray[i];
    }
    
    System.out.print("sourceArray: ");
    for (int currentElement : sourceArray) {
      System.out.print(currentElement + " ");
    }

    System.out.println();

    System.out.print("targetArray: ");
    for (int i = 0; i < targetArray.length; i++) {
      System.out.print(targetArray[i] + " ");
    }
    
    System.out.println();
    
    // type2
    
    System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
    
    System.out.print("type 2 targetArray: ");
    for (int i = 0; i < targetArray.length; i++) {
      System.out.print(targetArray[i] + " ");
    }
    
  }

}
