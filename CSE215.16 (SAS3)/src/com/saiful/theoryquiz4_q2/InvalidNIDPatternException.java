package com.saiful.theoryquiz4_q2;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 12 Jan 2021
 */
public class InvalidNIDPatternException extends Exception {

  private static final long serialVersionUID = -4064247667258641899L;

  public InvalidNIDPatternException() {
  }

  public InvalidNIDPatternException(String nid) {
    super(new StringBuffer().append("Person NID: ").append(nid)
        .append(" is Invalid\nCheck for patterns.\nDoes this have repeating patterns.\n").toString());
  }
}