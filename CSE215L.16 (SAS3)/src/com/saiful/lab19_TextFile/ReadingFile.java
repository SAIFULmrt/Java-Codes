package com.saiful.lab19_TextFile;

import java.io.File;
import java.util.Scanner;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 5 Jan 2021
 */
public class ReadingFile {

  public static void main(String[] args) throws Exception {

    // 1st way to get the path of the file: hard coded way (not preferred)

    String pathToFile1 = "C:/Users/SAIFULmrt/eclipse-workspace/CSE215.16_Lab/src/com/saiful/lab19_TextFIle/sample.txt";

    // 2nd alternative way to get the path of the file: (preffered)
    String pathToFile = ReadingFile.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()
        + "com/saiful/lab19_TextFile/sample.txt";

    // read data
    File fileObj = new File(pathToFile);
    Scanner fileReader = new Scanner(fileObj);

    while (fileReader.hasNext()) {
      String line = fileReader.nextLine();
      System.out.println(line);
    }

    fileReader.close();
  }

}
