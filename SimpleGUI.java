package com.sd.gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.awt.Container;


public class SimpleGUI {
	public void sayHello() {
	JFrame frame=new JFrame();
	JButton button=new JButton("myButton");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container pane=frame.getContentPane();
	pane.add(button);
	frame.setSize(100,100);
	frame.setVisible(true);
	}
}