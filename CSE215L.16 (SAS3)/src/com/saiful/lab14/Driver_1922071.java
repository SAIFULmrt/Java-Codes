package com.saiful.lab14;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 13 Dec 2020
 */
public class Driver_1922071 {

  public static void main(String[] args) {

    Course_1922071 Course1 = new Course_1922071("CSE215", "Programming Language II",
        new CourseTime_1922071("ST ", "01:00", "02:30"));
    Course_1922071 Course2 = new Course_1922071("MAT130", "Calculas I",
        new CourseTime_1922071("MW ", "09:40", "11:10"));
    Course_1922071 Course3 = new Course_1922071("CSE115", "Programming Language II",
        new CourseTime_1922071("RA ", "08:00", "09:30"));
    Course_1922071 Course4 = new Course_1922071("MAT116", "Pre Calculas",
        new CourseTime_1922071("ST ", "11:20", "12:50"));

    String c1 = Course_1922071.isRelatedCourse(Course1.getCourseCode(), Course2.getCourseCode()) == true ? "related"
        : "not related";
    System.out.println("Compare 1: " + Course1.getCourseCode() + " and " + Course2.getCourseCode() + " is " + c1);

    String c2 = Course_1922071.isRelatedCourse(Course1.getCourseCode(), Course3.getCourseCode()) == true ? "related"
        : "not related";
    System.out.println("Compare 2: " + Course1.getCourseCode() + " and " + Course3.getCourseCode() + " is " + c2);
    String c3 = Course_1922071.isRelatedCourse(Course1.getCourseCode(), Course4.getCourseCode()) == true ? "related"
        : "not related";
    System.out.println("Compare 3: " + Course1.getCourseCode() + " and " + Course4.getCourseCode() + " is " + c3);
    String c4 = Course_1922071.isRelatedCourse(Course2.getCourseCode(), Course3.getCourseCode()) == true ? "related"
        : "not related";
    System.out.println("Compare 4: " + Course2.getCourseCode() + " and " + Course3.getCourseCode() + " is " + c4);
    String c5 = Course_1922071.isRelatedCourse(Course2.getCourseCode(), Course4.getCourseCode()) == true ? "related"
        : "not related";
    System.out.println("Compare 5: " + Course2.getCourseCode() + " and " + Course4.getCourseCode() + " is " + c5);
    String c6 = Course_1922071.isRelatedCourse(Course3.getCourseCode(), Course4.getCourseCode()) == true ? "related"
        : "not related";
    System.out.println("Compare 6: " + Course3.getCourseCode() + " and " + Course4.getCourseCode() + " is " + c6);

    System.out.println();

    System.out.println(Course1.toString());
    System.out.println();
    System.out.println(Course2.toString());
    System.out.println();
    System.out.println(Course3.toString());
    System.out.println();
    System.out.println(Course4.toString());

  }

}
