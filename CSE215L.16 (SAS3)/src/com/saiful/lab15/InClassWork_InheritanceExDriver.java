package com.saiful.lab15;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 20 Dec 2020
 */
public class InClassWork_InheritanceExDriver {

  public static void main(String[] args) {

    InClassWork_InheritanceExPerson s1 = new InClassWork_InheritanceExPerson("ABC", "XYZ", "4558854", 32);
    InClassWork_InheritanceExStudent r1 = new InClassWork_InheritanceExStudent("DEF", "UYH", null, 24, "163245", new String[] { "CSE115", "CSE215" }, 3.5f);
    InClassWork_InheritanceExFaculty s2 = new InClassWork_InheritanceExFaculty("YXZ", "JKL", "545465456", 24, "163245", new String[] { "CSE115", "CSE215" }, "Lecteruer");

    System.out.println(s1);
    System.out.println("...................");
    System.out.println(r1);
    System.out.println("...................");
    System.out.println(s2);

  }

}
