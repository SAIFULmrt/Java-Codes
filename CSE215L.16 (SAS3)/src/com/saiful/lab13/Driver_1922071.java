package com.saiful.lab13;

import java.util.*;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 10 Dec 2020
 */

public class Driver_1922071 {

  public static void main(String[] args) {

    Date joiningDate1 = new GregorianCalendar(2014, Calendar.APRIL, 11, 10, 0, 0).getTime();
    Date joiningDate2 = new GregorianCalendar(2015, Calendar.MAY, 12, 18, 30, 00).getTime();
    Date joiningDate3 = new GregorianCalendar(2016, Calendar.JUNE, 13, 22, 45, 15).getTime();

    String[] coursesInput = { "CSE115", "CSE173", "CSE215" };
    String[] coursesInput1 = { "POL101", "BEN205", "MAT130" };

    String x = "Saiful Islam";

    Faculty_1922071 f1 = new Faculty_1922071("Mohammad", x, "003", "Learner", joiningDate1);
    Faculty_1922071 f2 = new Faculty_1922071("Kamrul", "Jony", "001", "Learner", joiningDate2, coursesInput);
    Faculty_1922071 f3 = new Faculty_1922071("Jubair", "Hasan", "002", "Learner", joiningDate3, coursesInput1);

    System.out.println(f1.toString());
    System.out.println(f2.toString());
    System.out.println(f3.toString());

    Course_1922071 c1 = new Course_1922071("CSE115", "C Programming Language", "Sfa");
    System.out.println(c1.toString());
    Course_1922071 c2 = new Course_1922071("CSE173", "Discrete MAthematics", "MSK1");
    System.out.println(c2.toString());
    Course_1922071 c3 = new Course_1922071("CSE215L", "Java Programming Language", "SAS3");
    System.out.println(c3.toString());
    Course_1922071 c4 = new Course_1922071("BEN205", "Bengali", "TMz");
    System.out.println(c4.toString());

  }

}