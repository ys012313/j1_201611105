package com.sd.ch8;
import com.sd.ch8.Turtle;

public class SeaTurtle extends Turtle {
    public void swim() {
        System.out.print("A sea turtle swims...");
    }
    public static void main(String[] args) {
		SeaTurtle s = new SeaTurtle();
		s.setFood("Fish");
		s.eat();
		s.swim();
		System.out.println("Land Turtles have "+s.nLimbs+" limbs");
	}
}
