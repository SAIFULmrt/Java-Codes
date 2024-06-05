package com.saiful.theoryquiz4_q2;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 12 Jan 2021
 */
public class Person {
  private String NID;

  public Person(String NID) throws NIDHasCharacterException, NIDLengthMismatchException, InvalidNIDPatternException,
      NIDStartsWithZeroException {
    setNID(NID);
  }

  public String getNID() {
    return NID;
  }

  public void setNID(String NID) throws NIDHasCharacterException, NIDLengthMismatchException,
      InvalidNIDPatternException, NIDStartsWithZeroException {

//    if (!NIDChecker.isDigitOnly(NID))
//      throw new NIDHasCharacterException(
//          "Person NID: " + NID + " contains" + " Alphabetic Characters.\nShould only contain digits.\n");

    if(!NIDChecker.isDigitOnly(NID))
      throw new NIDHasCharacterException(NID);
    
//    
//    if (!NIDChecker.is11Digits(NID)) {
//      if (!NIDChecker.is17Digits(NID)) {
//        throw new NIDLengthMismatchException(
//            "Person NID: " + NID + " has length " + NID.length() + " ." + "\nShould be length 11 or 17.\n");
//      }
//    }
    
    if(!NIDChecker.is11Digits(NID)){
      if(!NIDChecker.is17Digits(NID)){
      throw new NIDLengthMismatchException(NID);
      }
      }
    
    
//    if (NIDChecker.doesNIDStartWithZero(NID))
//      throw new NIDStartsWithZeroException("Person NID: " + NID + " starts with 0 ." + "\nShould not start with 0.\n");
    
    if(NIDChecker.doesNIDStartWithZero(NID))
      throw new NIDStartsWithZeroException(NID);
    
    
//    if (!NIDChecker.isValidNIDPattern(NID)) {
//      throw new InvalidNIDPatternException(
//          "Person NID: " + NID + " is Invalid" + "\nCheck for patterns.\nDoes this have repeating patterns.\n");
//    }
    
    if(!NIDChecker.isValidNIDPattern(NID)){
      throw new InvalidNIDPatternException(NID);
      }
    
    
    this.NID = NID;
  }

  @Override
  public String toString() {
    return this.getNID();
  }
}