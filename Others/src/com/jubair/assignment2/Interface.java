package com.jubair.assignment2;

interface Interface {

  User objUser = new User();
  Rectangle objRectangle = new Rectangle(8, 4);
  Triangle objTriangle = new Triangle(6, 3);
  Circle objCircle = new Circle(3, 0);

  public static void main(String[] args) {

    // user
    objUser.setName("Sayem Sajil");
    objUser.setId(19215442);
    objUser.setEmail("sayem@gmail.com");

    System.out.println("User Name: " + objUser.getName());
    System.out.println("User ID: " + objUser.getId());
    System.out.println("User Email: " + objUser.getEmail());
    System.out.println("User Email Verify: " + objUser.verifyEmail(objUser.getEmail()));

    System.out.println("\n===========================\n");

    // rectangle
    System.out.println("Rectangle Length: " + objRectangle.getLength());
    System.out.println("Rectangle Width: " + objRectangle.getWidth());
    System.out.println("Rectangle Perimeter: " + objRectangle.recPerimeter(objRectangle));
    System.out.println("Rectangle Area: " + objRectangle.recArea(objRectangle));
    System.out.println("Rectangle Shape:\n");
    objRectangle.drawRectangle();

    System.out.println("\n===========================\n");

    // triangle
    System.out.println("Triangle Length: " + objTriangle.getHeight());
    System.out.println("Triangle Width: " + objTriangle.getBase());
    System.out.println("Triangle Perimeter: " + objTriangle.triPerimeter(objTriangle));
    System.out.println("Triangle Area: " + objTriangle.triArea(objTriangle));
    System.out.println("Triangle Shape:\n");
    objTriangle.drawTriangle();

    System.out.println("\n===========================\n");

    // circle
    System.out.println("Circle Raius: " + objCircle.getRadius());
    System.out.println("Circle Circumference: " + objCircle.circCircumference(objCircle));
    System.out.println("Circle Area: " + objCircle.recArea(objCircle));
    System.out.println("Circle Shape:\n");
    objCircle.drawCircle();

  }
}
