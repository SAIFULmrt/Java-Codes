package com.saiful.BonusAssignment;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 3 Jan 2021
 */
public class Driver {

  public static void main(String[] args) {

    System.out.println("Task 1");
    System.out.println("permanentFaculty");
    System.out.println("=================\n");

    PermanentFaculty p1 = new PermanentFaculty("Dave Mustaine", 35, "2312312", "Dhanmondi, Dhaka", new Course[] {}, 0);
    System.out.println(p1);

    System.out.println();

    System.out.println("Task 2");
    System.out.println("visitingFaculty");
    System.out.println("=================\n");

    VisitingFaculty v1 = new VisitingFaculty("Cliff Burton", 37, "2311233", "Uttara, Dhaka", new Course[] {}, 0);
    System.out.println(v1);

    System.out.println();

    System.out.println("Task 3");
    System.out.println("Add Three Courses To P1 (Permanent Faculty)");
    System.out.println("===========================================\n");

    Course c1 = new Course("Programming Language II", "CSE 215");
    Course c2 = new Course("Data Structures and Algorithm", "CSE 225");
    Course c3 = new Course("Digital Logic design", "CSE 231");
    Course c4 = new Course("Intermediate Composition", "ENG 103");
    Course c5 = new Course("Introduction to Composition", "ENG 102");
    Course c6 = new Course("Public Speaking", "ENG 111");
    Course c7 = new Course("Calculus I", "MAT 120");
    Course c8 = new Course("Calculus II", "MAT 130");
    Course c9 = new Course("Calculus III", "MAT 250");

    p1.addCourse(new Course[] { c1, c2, c3 });
    System.out.println(p1.toString());

    System.out.println();

    System.out.println("Task 3 repeat");
    System.out.println("Add Two Courses To V1 (Visiting Faculty)");
    System.out.println("========================================\n");

    v1.addCourse(new Course[] { c4, c5, c6 });
    System.out.println(v1.toString());

    System.out.println();

    System.out.println("Task 4");
    System.out.println("=======\n");
    System.out.println("Add Five Courses To S1 (Student)");
    System.out.println("================================");

    Student s1 = new Student("Kerry King", 19, "123123", "Gulshan, Dhaka", 3.87, "2012764642");
    s1.addCourse(new Course[] { c1, c2, c3, c4, c5 });
    System.out.println(s1.toString());

    System.out.println();

    System.out.println("Task 5");
    System.out.println("=======\n");

    PermanentFaculty p2 = new PermanentFaculty("Binoy Mondol", 43, "1245987654", "Mirpur, Dhaka", new Course[] {}, 0);
    p2.addCourse(new Course[] { c4 });
    VisitingFaculty v2 = new VisitingFaculty("Shamim Alom", 40, "4887554715", "Pallabi, Dhaka", new Course[] {}, 0);
    v2.addCourse(new Course[] { c4, c6 });
    Student s2 = new Student("Sayem Sajil", 22, "4875445215", "Bashundhara, Dhaka", 3.50, "1922054854");
    s2.addCourse(new Course[] { c1, c2, c5 });

    Person arr[] = new Person[6];
    arr[0] = p1;
    arr[1] = p2;
    arr[2] = v1;
    arr[3] = v2;
    arr[4] = s1;
    arr[5] = s2;

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      System.out.println("\n");
    }

    System.out.println();

    System.out.println("Task 6");
    System.out.println("=======\n");

    s1.addCourse(new Course[] { c1, c2, c3, c4, c5, c6 });
    p1.addCourse(new Course[] { c1, c2, c3, c7, c8, c9 });

  }

}
