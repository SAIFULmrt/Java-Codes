package com.saiful.lab17;

import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 30 Dec 2020
 */
public class Driver {

  public static void main(String[] args) {

    Faculty f1 = new Faculty("John", "Doe", "5545454556454", 23, "445555", 
        new String[] {"CSE115"}, "Lecturer", new GregorianCalendar(
            2018, Calendar.APRIL, 19).getTime());
    
    Student s1 = new Student("Kamrul", "Jony", null, 21, "14552555", 
        new String[] {"CSE115", "CSE173"}, 3.5f);

    
    System.out.println(f1);
    System.out.println(s1);
    
    System.out.println("-----------");
    
    System.out.println(f1.getFullName());
   System.out.println(s1.getFullName());
    
    
    
    
  }

}
