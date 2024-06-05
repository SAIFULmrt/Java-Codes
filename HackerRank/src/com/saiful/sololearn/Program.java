package com.saiful.sololearn;

import java.util.Scanner;

abstract class Shape {
  int width;

  public Shape(int width) {
    this.width = width;
  }

  abstract void area();
}

class Circle extends Shape {
  public Circle(int width) {
    super(width);
  }

  @Override
  void area() {
    System.out.println(Math.PI * width * width);
  }
}

class Square extends Shape {
  public Square(int width) {
    super(width);
  }

  @Override
  void area() {
    System.out.println(width * width);
  }
  
}

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();

    Square a = new Square(x);
    Circle b = new Circle(y);
    a.area();
    b.area();

    sc.close();
  }
}
