package com.saiful.Problem1;
public class CarService extends VehicleService {
  int milage = 59;

  public CarService() {
  }

  public CarService(int x, int y, double z) {
    super(x, y, z);
  }

  public int getMilage() {
    return milage;
  }

  public double getRent() {
    return 2590 * booking_hours;
  }

  public String toString() {
    return "Mialge: " + milage + "\nRent " + String.valueOf(this.getRent());
  }

  public String DisplayObject(CarService car) {

    return "\nCC: " + String.valueOf(super.vehicle_CC) + ", Seats: " + super.number_of_seats + " Booking hours: "
        + this.toString();
  }

}
