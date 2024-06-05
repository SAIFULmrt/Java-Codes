package com.saiful.theoryquiz4_q2;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 13 Jan 2021
 */
public class NIDStartsWithZeroException extends Exception {

  private static final long serialVersionUID = -8619878568749283640L;

  public NIDStartsWithZeroException() {
  }

  public NIDStartsWithZeroException(String nid) {
    super(new StringBuffer().append("Person NID: ").append(nid).append(" starts with 0 .\nShould not start with 0.\n")
        .toString());
  }
}