package com.saiful.Problem1;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int cc, seats;
    double booking;
    System.out.print("Enter Vehicle CC: ");
    cc = scan.nextInt();
    System.out.print("Enter Vehicle Seats: ");
    seats = scan.nextInt();
    System.out.print("Enter Vehicle Booking Hours: ");
    booking = scan.nextInt();

    CarService vehicleCar = new CarService(cc, seats, booking);

    System.out.println(vehicleCar.DisplayObject(vehicleCar));

    System.out.println();

    System.out.print("Enter Vehicle CC: ");
    cc = scan.nextInt();
    System.out.print("Enter vehicle Seats: ");
    seats = scan.nextInt();
    System.out.print("Enter Vehicle Booking Hours: ");
    booking = scan.nextInt();

    TruckService vehicleTruck = new TruckService(cc, seats, booking);
    System.out.println(vehicleTruck.DisplayObject(vehicleTruck));
  }
}
