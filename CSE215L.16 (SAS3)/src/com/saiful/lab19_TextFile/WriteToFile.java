package com.saiful.lab19_TextFile;

import java.io.File;
import java.io.FileWriter;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 5 Jan 2021
 */
public class WriteToFile {
  public static void main(String[] args) throws Exception {
    String pathToFile = ReadingFile.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()
        + "com/saiful/lab19_TextFile/written.txt";

    // not ovewrites value is true it add new line with old one
    // FileWriter fileWriter = new FileWriter(new File(pathToFile), true);

    // for overwritter file default is false its overwrite 3 files
    FileWriter fileWriter = new FileWriter(new File(pathToFile));

    for (int index = 0; index < 3; index++) {
      fileWriter.write(generateRandomString(10) + "\n");
    }

    fileWriter.close();

  }

  public static String generateRandomString(int length) {
    String choices = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    choices += choices.toLowerCase();
    choices += "123456789";

    String result = "";

    for (int index = 0; index < length; index++) {
      int randomIndex = (int) (Math.random() * choices.length());
      char randomCharacter = choices.charAt(randomIndex);
      result += randomCharacter;
    }

    return result;
  }

}
