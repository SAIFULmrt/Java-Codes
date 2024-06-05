package com.saiful.theorySingleDimesionalArray;

//import java.util.Scanner;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 30 Nov 2020
 */
public class SingleDimensionalArrays {

  public static void main(String[] args) {
    /*
     * int[] myList = new int[3];
     * 
     * myList[0] = 10; myList[1] = 5; myList[2] = myList[0] + myList[1];
     * 
     * System.out.println(myList[0] + " + " + myList[1] + " = " + myList[2]);
     */

    /*
     * double[] myList1 = {1.9, 2.9, 3.4, 3.5};
     * 
     * 
     * 
     * 
     * above line is equivalent to double[] myList1 = new double[4]; myList1[0] =
     * 1.9; myList1[1] = 2.9; myList1[2] = 3.4; myList1[3] = 3.5;
     * 
     * 
     * 
     * System.out.println(myList1);
     */

    /*
     * java.util.Scanner input = new java.util.Scanner(System.in);
     * 
     * int[] values = new int[5];
     * 
     * System.out.println("Enter " + values.length + " values: ");
     * 
     * for(int index=0; index<values.length; index++) { values[index] =
     * input.nextInt(); }
     * 
     * System.out.println(values) ;
     */

    // java.util.Scanner input = new java.util.Scanner(System.in);

    // int[] values = new int[5];
    /*
     * int largestNum = 0;
     * 
     * //System.out.println("Enter " + values.length + " values: ");
     * 
     * for(int index=0; index<values.length; index++) { values[index] =
     * (int)(Math.random()*100); if(values[index] > largestNum) { largestNum =
     * values[index]; System.out.println("Largest element: " + largestNum); } }
     */

    /*
     * System.out.print("values[5] = {"); for(int i=0; i<values.length; i++) {
     * if(i==4) { System.out.print(values[i] + "}"); } else {
     * System.out.print(values[i] + ", "); }};
     */

    /*
     * int[] values = { 2, 4, 6, 8, 10 };
     * 
     * int temp = values[0];
     * 
     * //shifting elements to left for (int i=1; i<values.length; i++) { values[i-1]
     * = values[i];
     * 
     * } values[values.length-1] = temp;
     * 
     * for(int value: values) { System.out.print( value + " "); }
     */

    
    
    int[] myList = new int[10];
    
    for(int i=0; i<myList.length; i++) {
      myList[i] = (int)(Math.random()*myList.length);
      System.out.print(myList[i] + " ");
      
    }
    System.out.print("\n");
   
    
    for(int value: myList) {
      System.out.print(value + " ");
    }
    
    System.out.print("\n");
    
    int[] targetArray = new int[myList.length];
    System.arraycopy(myList, 2, targetArray, 0, 4);
    for(int value: targetArray) {
      System.out.print(value + " ");
    }
    
    
    int sum = 0;
    double average = 0.0;
    
    for(int i=0; i<myList.length; i++) {
      sum = myList[i] + sum;
      average = (double)sum/(double)myList.length;
      //System.out.print(myList[i] + " ");
      
    }
    
    
    
    System.out.println("\n" + myList.length);
    System.out.println(sum);
    System.out.println(average);
    
    int countAboveAverageNum = 0;    
    
    for(int i=0; i<myList.length; i++) {
      if(myList[i] > average) 
        countAboveAverageNum++;
      
    }
    
    System.out.println("Numbers above the average are: " + countAboveAverageNum);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}
