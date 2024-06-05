package com.saiful.quiz4;

import com.saiful.quiz4_exception.*;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 6 Jan 2021
 */
public abstract class HomoSapiens_1922071 {

  private double height;
  private double weight;
  private String bloodGroup;

  public HomoSapiens_1922071(double height, double weight, String bloodGroup)
      throws InvalidHeightOrWeightException_1922071, InvalidBloodGroupException_1922071 {

    this.setHeight(height);
    this.setWeight(weight);
    this.setBloodGroup(bloodGroup);
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) throws InvalidHeightOrWeightException_1922071 {
    if (height <= 0) {
      throw new InvalidHeightOrWeightException_1922071("\nHeight can't be equal or smaller than 0\n");
    }

    this.height = height;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) throws InvalidHeightOrWeightException_1922071 {
    if (weight <= 0) {
      throw new InvalidHeightOrWeightException_1922071("\nWeight can't be equal or smaller than 0\n");
    }
    this.weight = weight;
  }

  public String getBloodGroup() {
    return bloodGroup;
  }

  public void setBloodGroup(String bloodGroup) throws InvalidBloodGroupException_1922071 {

    boolean validBloodGroup = true;
    boolean isValidBloodGroupPrefix = false;
    String substringPrefix;

    if (bloodGroup.length() == 3) {
      substringPrefix = bloodGroup.substring(0, 3);
    } else {
      substringPrefix = bloodGroup.substring(0, 2);
    }

    if (substringPrefix == "A+") {
      isValidBloodGroupPrefix = true;
    } else if (substringPrefix == "B+") {
      isValidBloodGroupPrefix = true;
    } else if (substringPrefix == "B-") {
      isValidBloodGroupPrefix = true;
    } else if (substringPrefix == "O+") {
      isValidBloodGroupPrefix = true;
    } else if (substringPrefix == "O-") {
      isValidBloodGroupPrefix = true;
    } else if (substringPrefix == "AB+") {
      isValidBloodGroupPrefix = true;
    } else if (substringPrefix == "AB-") {
      isValidBloodGroupPrefix = true;
    }

    validBloodGroup = validBloodGroup && isValidBloodGroupPrefix;

    if (!validBloodGroup) {
      throw new InvalidBloodGroupException_1922071("\nBlood Group is not valid\n");
    }

    this.bloodGroup = bloodGroup;
  }

  @Override
  public String toString() {
    return "Height: " + height + "\nWeight: " + weight + "\nBlood Group: " + bloodGroup;
  }

}
