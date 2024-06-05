package com.saiful.theoryquiz4_q2;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 12 Jan 2021
 */
public class NIDLengthMismatchException extends Exception {

  private static final long serialVersionUID = -4681554533829822989L;

  public NIDLengthMismatchException() {
  }

  public NIDLengthMismatchException(String nid) {

    super(new StringBuffer().append("Person NID: ").append(nid).append(" has length ").append(nid.length())
        .append(" .\nShould be length 11 or 17.\n").toString());
  }
}