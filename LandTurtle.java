package com.sd.ch8;
import com.sd.ch8.Turtle;

public class LandTurtle extends Turtle {
    public void walk() {
        System.out.print("A land turtle walks...");
    }
    public static void main(String[] args){
        LandTurtle l = new LandTurtle();
        l.setFood("Meat");
        l.eat();
        l.walk();
        System.out.println("Land Turtles have "+l.nLimbs+" limbs");
    }
}
