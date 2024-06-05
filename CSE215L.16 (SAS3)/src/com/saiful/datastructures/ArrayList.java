package com.saiful.datastructures;

import java.util.Iterator;

////import java.util.ArrayList;

////import java.util.*;
//
///*
// *  Name: Md. Saiful Islam
// *  ID: 1922071
// *  Course: CSE215L.16
// *  Instructor Name: Shaikh Shawon Arefin Shimon
// *  @date 14 Jan 2021
// */
//
//public class ArrayList {
//  public static void main(String args[]) {
//    java.util.ArrayList<String> list = new java.util.ArrayList<>();// Creating arraylist
//    list.add("Mango");// Adding object in arraylist
//    list.add("Apple");
//    list.add("Banana");
//    list.add("Grapes");
//    // Printing the arraylist object
//    System.out.println(list);
//  }
//}

/*
*  Name: Md. Saiful Islam
*  ID: 1922071
*  Course: CSE215L.16
*  Instructor Name: Shaikh Shawon Arefin Shimon
*  @date 14 Jan 2021
*/

public class ArrayList {

  public static void main(String args[]) {
    java.util.ArrayList<String> fruits = new java.util.ArrayList<>();

// Adding object in arraylist
    fruits.add("Apple");
    fruits.add("Orange");
    fruits.add("Banana");
    fruits.add("Jackfruit");

// Printing the arraylist object
    System.out.println(fruits);

// Remove object from arraylist
    fruits.remove("Orange"); // specific element wise for this your class must implement the equals() method

//// alternate way
//fruits.remove(1); // index wise

    fruits.add(3, "Papaya");
    System.out.println(fruits);

// replacing or set elements in arraylist
    fruits.set(3, "Mango");
    System.out.println(fruits);

    System.out.println();
    // iterate over a arraylist
    // 1st way
    for (int i = 0; i < fruits.size(); i++) {
      System.out.println(fruits.get(i));
    }

    // 2nd way
    Iterator<String> arrayListIterator = fruits.iterator();

    System.out.println("\nArrayList iterator output: \n=================");
    while (arrayListIterator.hasNext()) {
      System.out.println(arrayListIterator.next());
    }

    // additional methods in arraylist
    System.out.println("\nArrayList Size: " + fruits.size()); // returns size of arraylist
    System.out.println("\nBefore clear " + fruits.isEmpty()); // returns t/f boolean by checking arraylist is empty or
                                                              // not

    fruits.clear(); // clear all elements from arraylist
    System.out.println("\nAfter clear " + fruits.isEmpty());
  }
}