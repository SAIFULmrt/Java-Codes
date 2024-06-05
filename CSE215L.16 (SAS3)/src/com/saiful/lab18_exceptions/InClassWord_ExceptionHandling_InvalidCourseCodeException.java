package com.saiful.lab18_exceptions;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 4 Jan 2021
 */
@SuppressWarnings("serial")
public class InClassWord_ExceptionHandling_InvalidCourseCodeException extends Exception {
  public InClassWord_ExceptionHandling_InvalidCourseCodeException() {

  }

  public InClassWord_ExceptionHandling_InvalidCourseCodeException(String message) {
    super(message);
  }
}
