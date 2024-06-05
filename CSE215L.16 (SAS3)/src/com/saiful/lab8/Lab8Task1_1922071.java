package com.saiful.lab8;

import java.util.Scanner;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 24 Nov 2020
 */
public class Lab8Task1_1922071 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.printf("Enter total number of employees: ");
    int employee = input.nextInt();

    System.out.printf("Enter total number of days per week: ");
    int weekDayes = input.nextInt();

    System.out.printf("Enter the weekly working hours for each employee: \n");

    int workingHoursData[][] = new int[employee][weekDayes];

    for (int i = 0; i < employee; i++) {
      for (int j = 0; j < weekDayes; j++) {
        workingHoursData[i][j] = input.nextInt();
      }
    }

    System.out.println("Employees total working hours: ");
    int b[] = employeeWorkHourCalculator(workingHoursData, employee, weekDayes);

    for (int i = 0; i < employee; i++) {
      System.out.println("Employee " + (i + 1) + ": " + b[i] + " hours ");
    }
    input.close();
  }

  public static int[] employeeWorkHourCalculator(int workingHoursData[][], int employee, int weekDayes) {
    int totalWeeklyWorkingHoursRecord[] = new int[workingHoursData.length];
    int workHourSum = 0;
    for (int i = 0; i < employee; i++) {
      for (int j = 0; j < weekDayes; j++) {
        workHourSum += workingHoursData[i][j];
      }
      totalWeeklyWorkingHoursRecord[i] = workHourSum;
      workHourSum = 0;
    }

    return totalWeeklyWorkingHoursRecord;
  }

}
