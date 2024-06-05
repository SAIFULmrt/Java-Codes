package com.saiful.lab15;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 20 Dec 2020
 */
public class Driver_1922071 {

  public static void main(String[] args) {

    double valueOne = 6.5;
    double valueTwo = 4.25;
    double valueThree = 4.0;

    Shape_1922071 sh1 = new Shape_1922071(false, "Red");
    Rectangle_1922071 r1 = new Rectangle_1922071(true, "Blue", valueTwo, valueOne);
    Square_1922071 sq1 = new Square_1922071(false, "White", valueThree);

    System.out.println(sh1);
    System.out.println();
    System.out.println(r1);
    System.out.println();
    System.out.println(sq1);
    System.out.println();

    System.out.printf("Area of the square with side length of %.1f is: %.1f\n", valueThree, sq1.getArea());
    System.out.printf("Area of the rectangle with side lengths of %.1f and %.2f is: %.2f\n", valueOne, valueTwo,
        r1.getArea());
    System.out.printf("Perimeter of the square with side length of %.1f is: %.2f\n", valueThree, sq1.getPerimeter());
    System.out.printf("Perimeter of the rectangle with side lengths of %.1f and %.2f is: %.2f\n", valueOne, valueTwo,
        r1.getPerimeter());

  }

}
