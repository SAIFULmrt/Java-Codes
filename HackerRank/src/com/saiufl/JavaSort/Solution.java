package com.saiufl.JavaSort;

import java.util.*;

class Student {
  private int id;
  private String fname;
  private double cgpa;

  public Student(int id, String fname, double cgpa) {
    super();
    this.id = id;
    this.fname = fname;
    this.cgpa = cgpa;
  }

  public int getId() {
    return id;
  }

  public String getFname() {
    return fname;
  }

  public double getCgpa() {
    return cgpa;
  }
}

//Complete the code
public class Solution {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());

    List<Student> studentList = new ArrayList<Student>();
    while (testCases > 0) {
      int id = in.nextInt();
      String fname = in.next();
      double cgpa = in.nextDouble();

      Student st = new Student(id, fname, cgpa);
      studentList.add(st);

      testCases--;
    }

    /*
     * What if you want to sort some objects in an order other than their natural
     * ordering? Or what if you want to sort some objects that don't implement
     * Comparable? To do either of these things, you'll need to provide a Comparator
     * — an object that encapsulates an ordering. Like the Comparable interface, the
     * Comparator interface consists of a single method.
     * 
     * public interface Comparator<T> { int compare(T o1, T o2); }
     */

    Collections.sort(studentList, Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getFname)
        .thenComparing(Student::getId));

    for (Student st : studentList) {

      System.out.println(st.getFname());
    }
  }
}
