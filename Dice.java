package com.sd.project;

public class Dice {
    private int number=0;
    public void roll() {
       number=(int) (Math.random() * 7+1);
    }
    public int getNum() {
        return this.number;
    }
    public void name() {
    	if (number == 1)
    	System.out.println("0 1 1 1 / It's Do");
    	else if (number == 2)
    	System.out.println("0 0 1 1 / It's Ge");
    	else if (number == 3)
    	System.out.println("0 0 0 1 / It's Girl");
    	else if (number == 4)
    	System.out.println("0 0 0 0 / It's Yut");
    	else if (number == 5)
    	System.out.println("1 1 1 1 / It's Mo");
    	else if (number == 6)
    	System.out.println("Q 1 1 1 / It's BackDo");
    	else if (number == 7)
    	System.out.println("1 X 0 1 / It's Nak");
    }
}
