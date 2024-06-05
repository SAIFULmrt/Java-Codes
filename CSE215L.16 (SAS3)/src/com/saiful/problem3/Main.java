package com.saiful.problem3;

public class Main {

  public static void main(String[] args) {

    Blueprint b1 = new Child1();
    b1.checkPlantStatus();
    Blueprint b2 = new Child2();
    b2.checkWaterLevel();
    Blueprint b3 = new Child3();
    b3.checkWaterPH();
    b1.printplantDirectorName();
  }
}
