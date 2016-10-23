package com.sd.dice;

public class DiceGame {
    Player p1;
    Player p2;
    public void startGame() {
      p1 = new Player("A");
      p2 = new Player("B");
      p1.play();
      p2.play();
      if (p1.getNum() > p2.getNum()) {
          p1.getScore();
          System.out.println("Exellent! "+p1.getName()+" Win");
      }
      else if (p1.getNum() < p2.getNum()) {
          p2.getScore();
          System.out.println("Perpect! "+p2.getName()+" Win");
      }
      else
          System.out.println("Draw");
      }
      public static void main(String[] args){
          new DiceGame().startGame();
      }
}