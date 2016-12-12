package com.sd.project;

import java.util.Scanner;

public class YutGame {
   private String name1=null;
   private String name2=null;
   int Player1Score=0;
   int Player2Score=0;
   int num1;
   int num2;
   public void setPlayer1(String player1) {
      this.name1=player1;
   }
   public void setPlayer2(String player2) {
      this.name2=player2;
   }
   public void play() {
      Dice d = new Dice();
      while((Player1Score <= 20 || Player2Score<= 20)) {
        d.roll();
        num1 = d.getNum();
        d.name();
        if (num1 <= 5)
          Player1Score = Player1Score + num1;
        else if (num1 == 6)
          Player1Score = Player1Score - 1;
        else if (num2 == 7)
          Player1Score = Player1Score + 0;
        d.roll();
        num2 = d.getNum();
        d.name();
        if (num2 <= 5)
          Player2Score = Player2Score + num2;
        else if (num2 == 6)
          Player2Score = Player2Score - 1;
        else if (num2 == 7)
          Player2Score = Player2Score + 0;
        System.out.println(name1 + " score is "+ num1 +"\n"+ name1+"'s Total score is "+Player1Score);
        System.out.println("------------------------");
        System.out.println(name2 + " score is " + num2 +"\n"+ name2+"'s Total score is "+Player2Score);
        System.out.print("\n");
        if(Player1Score >= 20) {
          System.out.println(name1 + " Win! The Score is "+Player1Score);
          System.out.println(name2 + " Lose! The Score is" + Player2Score);
          break;
        }
        else if(Player2Score >= 20) {
          System.out.println(name2 + " Win! The Score is "+Player2Score);
          System.out.println(name1 + " Lose! The Score is " + Player1Score);
          break;
        }
    }
  }
  public static void main(String[] args) {
    YutGame y=new YutGame();
    Scanner sc=new Scanner(System.in);
    System.out.println("Player1 name");
    String Player1=sc.nextLine();
    y.setPlayer1(Player1);
    System.out.println("Player2 name");
    String Player2=sc.nextLine();
    y.setPlayer2(Player2);
    y.play();
  }
}