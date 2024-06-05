package com.saiful.problem3;

public abstract class Blueprint {

  abstract void checkWaterTemp();

  abstract void checkWaterLevel();

  abstract void checkWaterPH();

  abstract void checkWaterTurbidity();

  abstract void checkWaterDOD();

  abstract void checkPlantStatus();

  void printplantDirectorName() {
    System.out.println("Asif Tanvir");
  }
}
