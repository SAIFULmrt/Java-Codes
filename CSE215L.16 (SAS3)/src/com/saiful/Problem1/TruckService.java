package com.saiful.Problem1;

public class TruckService extends VehicleService {
  int milage = 59;

  public TruckService() {
  }

  public TruckService(int x, int y, double z) {
    super(x, y, z);

  }

  public int getMilage() {
    return milage;
  }

  public double getRent() {
    return 2590 * booking_hours;
  }

  @Override
  public String toString() {
    return "Mialge: " + milage + "\nRent: " + String.valueOf(this.getRent());
  }

  public String DisplayObject(TruckService truck) {
    return "\nCC: " + String.valueOf(super.vehicle_CC) + ", Seats: " + super.number_of_seats + ", Booking hours: "
        + this.toString();
  }
}
