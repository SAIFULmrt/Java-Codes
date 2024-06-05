package com.saiful.lab18;

import java.util.*;

import com.saiful.lab18_exceptions.*;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 4 Jan 2021
 */
public class InClassWord_ExceptionHandling_Driver {

  public static void main(String[] args) {

    try {
      InClassWord_ExceptionHandling_Student s1 = new InClassWord_ExceptionHandling_Student("John", "Doe", "1245578", 22,
          "5454565", new String[] { "CSE115" }, 3.5f);
      System.out.println(s1);

      InClassWord_ExceptionHandling_Faculty f1 = new InClassWord_ExceptionHandling_Faculty("Jonathan", "Doe", "1245578",
          22, "5454565", new String[] { "CSE115", "BEN205" }, "Porfessor", new Date());
      System.out.println(f1);

      InClassWord_ExceptionHandling_Student clone = (InClassWord_ExceptionHandling_Student) s1.clone();
      System.out.println(clone);

    } catch (InClassWord_ExceptionHandling_InvalidNameException invalidName) {
      System.out.println(invalidName.getMessage());
    } catch (InClassWord_ExceptionHandling_InvalidAgeException invalidAge) {
      System.out.println(invalidAge.getMessage());
    } catch (CloneNotSupportedException cloneNotSupported) {
      System.out.println("Cloning this object is not possible");
    } catch (InClassWord_ExceptionHandling_InvalidCourseCodeException courseCodeException) {
      System.out.println(courseCodeException.getMessage());
    } catch (InClassWord_ExceptionHandling_InvalidCGPAException invalidCgpa) {
      System.out.println(invalidCgpa.getMessage());
    }

    finally {
      System.out.println("Done with the program");
    }
  }

}
