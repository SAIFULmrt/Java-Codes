package com.saiful.hackerrankcom.saiful.sololearnp6;

import java.util.*;

class Bowling {
  HashMap<String, Integer> players;

  Bowling() {
    players = new HashMap<String, Integer>();
  }

  public void addPlayer(String name, int p) {
    players.put(name, p);
  }

  // your code goes here
  public void getWinner() {
    String winner = "";
    int mark = 0;
    for (String name : players.keySet()) {
      if (players.get(name) > mark) {
        winner = name;
        mark = players.get(name);
      }
    }
    System.out.println(winner);
  }

}

public class Program {
  public static void main(String[] args) {
    Bowling game = new Bowling();
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
      String input = sc.nextLine();
      String[] values = input.split(" ");
      String name = values[0];
      int points = Integer.parseInt(values[1]);
      game.addPlayer(name, points);
    }
    game.getWinner();
  }
}
