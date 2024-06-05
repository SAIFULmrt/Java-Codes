package com.saiful.Problem1;
public class VehicleService {
  int vehicle_CC = 0;
  int number_of_seats = 0;
  double booking_hours = 0.0;

  public VehicleService() {
  }

  public VehicleService(int vehicle_CC, int number_of_seats, double booking_hours) {
    this.vehicle_CC = vehicle_CC;
    this.number_of_seats = number_of_seats;
    this.booking_hours = booking_hours;
  }

  public int getVehicle_CC() {
    return this.vehicle_CC;
  }

  public void setVehicle_CC(int vehicle_CC) {
    this.vehicle_CC = vehicle_CC;
  }

  public int getNumber_of_seats() {
    return this.number_of_seats;
  }

  public void setNumber_of_seats(int number_of_seats) {
    this.number_of_seats = number_of_seats;
  }

  public double getBooking_hours() {
    return this.booking_hours;
  }

  public void setBooking_hours(double booking_hours) {
    this.booking_hours = booking_hours;
  }

  @Override
  public String toString() {
    return "{" + " vehicle_CC='" + getVehicle_CC() + "'" + ", number_of_seats='" + getNumber_of_seats() + "'"
        + ", booking_hours='" + getBooking_hours() + "'" + "}";
  }
}
