package com.saiful.quiz3;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 01 Jan 2021
 */
public class Driver_1922071 {

  public static void main(String[] args) throws CloneNotSupportedException {

    Octagon_1922071 o1 = new Octagon_1922071(new RGB_1922071((short) 1, (short) 2, (short) 3), 8.5);
    Octagon_1922071 o2 = new Octagon_1922071(new RGB_1922071((short) 4, (short) 5, (short) 6), 8.5);
    Octagon_1922071 o3 = new Octagon_1922071(new RGB_1922071((short) 7, (short) 8, (short) 9), 10.3);

    Nonagon_1922071 n1 = new Nonagon_1922071(new RGB_1922071((short) 6, (short) 2, (short) 4), 7.5);
    Nonagon_1922071 n2 = new Nonagon_1922071(new RGB_1922071((short) 2, (short) 5, (short) 8), 8.8);
    Nonagon_1922071 n3 = new Nonagon_1922071(new RGB_1922071((short) 7, (short) 5, (short) 3), 5.5);

    Decagon_1922071 d1 = new Decagon_1922071(new RGB_1922071((short) 1, (short) 4, (short) 7), 7.5);
    Decagon_1922071 d2 = new Decagon_1922071(new RGB_1922071((short) 9, (short) 6, (short) 3), 5.5);
    Decagon_1922071 d3 = new Decagon_1922071(new RGB_1922071((short) 5, (short) 9, (short) 1), 4.5);

    if (o1.compareTo(o2) > 0) {
      System.out.println("Octagon1 Area: " + o1.computeArea());
      System.out.println("Octagon2 Area: " + o2.computeArea());
      System.out.println("Octagon1 is greater than Octagon2");
    }
    if (o1.compareTo(o2) == 0) {
      System.out.println("Octagon1 Area: " + o1.computeArea());
      System.out.println("Octagon2 Area: " + o2.computeArea());
      System.out.println("Octagon1 is equal to Octagon2");
    }
    if (o1.compareTo(o2) < 0) {
      System.out.println("Octagon1 Area: " + o1.computeArea());
      System.out.println("Octagon2 Area: " + o2.computeArea());
      System.out.println("Octagon1 is smaller than Octagon2");
    }

    System.out.println();

    if (n1.compareTo(n2) > 0) {
      System.out.println("Nonagon1 Area: " + n1.computeArea());
      System.out.println("Nonagon2 Area: " + n2.computeArea());
      System.out.println("Nonagon1 is greater than Nonagon2");
    }
    if (n1.compareTo(n2) == 0) {
      System.out.println("Nonagon1 Area: " + n1.computeArea());
      System.out.println("Nonagon2 Area: " + n2.computeArea());
      System.out.println("Nonagon1 is equal to Nonagon2");
    }
    if (n1.compareTo(n2) < 0) {
      System.out.println("Nonagon1 Area: " + n1.computeArea());
      System.out.println("Nonagon2 Area: " + n2.computeArea());
      System.out.println("Nonagon1 is smaller than Nonagon2");
    }

    System.out.println();

    if (d1.compareTo(d2) > 0) {
      System.out.println("Decagon1 Area: " + d1.computeArea());
      System.out.println("Decagon2 Area: " + d2.computeArea());
      System.out.println("Decagon1 is greater than Decagon2");
    }
    if (d1.compareTo(d2) == 0) {
      System.out.println("Decagon1 Area: " + d1.computeArea());
      System.out.println("Decagon2 Area: " + d2.computeArea());
      System.out.println("Decagon1 is equal to Decagon2");
    }
    if (d1.compareTo(d2) < 0) {
      System.out.println("Decagon1 Area: " + d1.computeArea());
      System.out.println("Decagon2 Area: " + d2.computeArea());
      System.out.println("Decagon1 is smaller than Decagon2");
    }

    Octagon_1922071 o4 = (Octagon_1922071) o2.clone();
    if (o4.equals(o2)) {
      System.out.println("Octagon1 and Octagon2 have same length");
    } else {
      System.out.println("Octagon1 and Octagon2 dont have same length");
    }

    System.out.println();

    Nonagon_1922071 clonedNonagon = (Nonagon_1922071) n1.clone();
    System.out.println(clonedNonagon);

    System.out.println();

    System.out.println(o1.toString());
    System.out.println(o2.toString());
    System.out.println(o3.toString());
    System.out.println(n1.toString());
    System.out.println(n2.toString());
    System.out.println(n3.toString());
    System.out.println(d1.toString());
    System.out.println(d2.toString());
    System.out.println(d3.toString());

  }

}
