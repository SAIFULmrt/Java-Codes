package com.saiful.quiz4;

import com.saiful.quiz4_exception.*;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 6 Jan 2021
 */
public class Person_1922071 extends HomoSapiens_1922071 {

  private String firstName;
  private String lastName;
  private String nationalId;
  private Address_1922071 address_1922071;
  private String contactNo;
  private int age;
  private String gender;

  public Person_1922071(String firstName, String lastName, String nationalId, Address_1922071 address_1922071, int age,
      String contactNo, String gender, String bloodGroup, double height, double weight)
      throws InvalidHeightOrWeightException_1922071, InvalidBloodGroupException_1922071, InvalidNameException_1922071,
      InvalidAgeException_1922071, NullDataException_1922071, InvalidContactNumberException_1922071,
      InvalidGenderException_1922071 {
    super(height, weight, bloodGroup);

    this.setFirstName(firstName);
    this.setLastName(lastName);
    this.setNationalId(nationalId);
    this.setAddress(address_1922071);
    this.setAge(age);
    this.setContactNo(contactNo);
    this.setGender(gender);
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) throws InvalidNameException_1922071, NullDataException_1922071 {

    if (firstName != null) {

      if (firstName.length() < 4) {
        throw new InvalidNameException_1922071("\nfirstName length can't be less than 4 characters long.\n");
      }
    }
    if (firstName == null) {
      throw new NullDataException_1922071("\nfirstName data passed to the constructor can't be null.\n");
    }
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) throws InvalidNameException_1922071, NullDataException_1922071 {
    if (lastName != null) {
      if (lastName.length() < 4) {
        throw new InvalidNameException_1922071("\nlastName length can't be less than 4 characters long.\n");
      }
    }
    if (lastName == null) {
      throw new NullDataException_1922071("\nlastName data passed to the constructor can't be null.\n");
    }

    this.lastName = lastName;
  }

  public String getNationalId() {
    return nationalId;
  }

  public void setNationalId(String nationalId) throws NullDataException_1922071 {
    if (nationalId == null) {
      throw new NullDataException_1922071("\nnationalId data passed to the constructor can't be null.\n");
    }
    this.nationalId = nationalId;
  }

  public Address_1922071 getAddress() {
    return address_1922071;
  }

  public void setAddress(Address_1922071 address_1922071) throws NullDataException_1922071 {
    if (address_1922071 == null) {
      throw new NullDataException_1922071("\naddress data passed to the constructor can't be null.\n");
    }
    this.address_1922071 = address_1922071;
  }

  public String getContactNo() {
    return contactNo;
  }

  public void setContactNo(String contactNo) throws NullDataException_1922071, InvalidContactNumberException_1922071 {
    if (contactNo != null) {

      if (contactNo.length() != 14) {
        throw new InvalidContactNumberException_1922071("\ncontactNo data is not exactly 14 characters long.\n");
      }

      String contactNoFirst4Ch = contactNo.substring(0, 4);
      if (!(contactNoFirst4Ch.equals("+880"))) {
        throw new InvalidContactNumberException_1922071("\ncontactNo does not contain “+880” at its beginning\n");
      }
    }

    if (contactNo == null) {
      throw new NullDataException_1922071("\ncontactNo data passed to the constructor can't be null.\n");
    }
    this.contactNo = contactNo;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) throws InvalidAgeException_1922071 {
    if (age <= 0) {
      throw new InvalidAgeException_1922071("\nAge can't be equal or smaller than 0\n");
    }
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) throws NullDataException_1922071, InvalidGenderException_1922071 {
    if (gender != null) {
      if (!(gender.equals("MALE") || gender.equals("FEMALE"))) {
        throw new InvalidGenderException_1922071("\ngender is not exactly “MALE” or “FEMALE”\n");
      }
    }
    if (gender == null) {
      throw new NullDataException_1922071("\ngender data passed to the constructor can't be null.\n");
    }
    this.gender = gender;
  }

  @Override
  public String toString() {
    return "==============================================================\nFull Name: " + firstName + " " + lastName
        + "\nNational ID: " + nationalId + "\nAddress: " + address_1922071 + "\nGender: " + gender + "\nHeight: "
        + super.getHeight() + "\nWeight: " + super.getWeight() + "\nAge: " + age + " years" + "\nContact No: "
        + contactNo + "\nBlood Group: " + super.getBloodGroup()
        + "\n==============================================================\n";
  }

}
