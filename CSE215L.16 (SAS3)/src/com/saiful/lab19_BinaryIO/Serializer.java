package com.saiful.lab19_BinaryIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 5 Jan 2021
 */
public class Serializer {

  public static void serialize(String pathToFile, Circle object) throws Exception {
    File file = new File(pathToFile);
    FileOutputStream fileOutputStream = new FileOutputStream(file);
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(object);

    objectOutputStream.close();
    fileOutputStream.close();
  }

  public static Object deserialize(String pathToFile) throws Exception {
    File file = new File(pathToFile);
    FileInputStream fileInputStream = new FileInputStream(file);
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    Object object = objectInputStream.readObject();

    objectInputStream.close();
    fileInputStream.close();

    return object;
  }

  public static void main(String[] args) {
    Circle circle = new Circle("Green", false, 5.7);
    String pathToBinaryFile = "C:/Users/SAIFULmrt/eclipse-workspace/CSE215.16_Lab/src/com/saiful/lab19_BinaryIO/circle.bin";

    // write and save file
//    try {
//      serialize(pathToBinaryFile, circle);
//        System.out.println("Circle saved successfully");
//      } catch (Exception exception) {
//        System.out.println(exception.getMessage());
//      }

    // read from saved file
    try {
      Circle readObject = (Circle) deserialize(pathToBinaryFile);
      System.out.println("Circle was retrieved from the file successfully");
      System.out.println(readObject.getArea());
      System.out.println(readObject.toString());

    } catch (Exception exception) {
      System.out.println(exception.getMessage());
      exception.printStackTrace();
    }

  }
}
