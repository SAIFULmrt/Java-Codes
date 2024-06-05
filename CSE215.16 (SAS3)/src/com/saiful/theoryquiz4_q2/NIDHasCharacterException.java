package com.saiful.theoryquiz4_q2;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 12 Jan 2021
 */
public class NIDHasCharacterException extends Exception {

  private static final long serialVersionUID = -5287783816842624246L;

  public NIDHasCharacterException() {
  }

  // concatenate String with +
//  public NIDHasCharacterException(String nid) {
//    super(StringBuffer("Person NID: " + nid + " contains" + " Alphabetic Characters.\nShould only contain digits.\n"));
//  }

  // concatenate string with StringBuffer
  public NIDHasCharacterException(String nid) {
    super(new StringBuffer().append("Person NID: ").append(nid)
        .append(" contains Alphabetic Characters.\nShould only contain digits.\n").toString());
  }

}
