package com.sd.turtle;
import ch.aplu.turtle.*;

class DrawSquare{

	Turtle t1=new Turtle();
	int size;
	public void drawSquare(int size){
		for (int i=0; i<4; i++){
			t1.forward(size);
			t1.right(90);
		}
	}
	public static void main(String[]args){
		new DrawSquare().drawSquare(77);
		}
}