﻿class DiceGame {
private Player p1;
private Player p2;
public void startGame() {
p1=new Player("A");
p2=new Player("B");
p1.play();
p2.play();
if(p1.getNum() > p2.getNum()) {
System.out.println(p1.getName()+" win");
} else if (p1.getNum() == p2.getNum()) {
System.out.println("draw");
}
else {
System.out.println(p2.getName() + " win");
}
}
}

DiceGame d=new DiceGame();
d.startGame();