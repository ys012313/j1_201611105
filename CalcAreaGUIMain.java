package com.sd.gui;

import javax.swing.*;
import javax.awt.*;

public class CalcAreaGUIMain {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		JPanel panel=new JPanel(new GridLayout(3,2));
		f.getContentPane().add(panel);
		JLabel label1=new JLabel("Radius");
		JLabel label2=new JLabel("Area");
		JTextField radiusTF1=new TextField(10);
		JTextField areaTF1=new TextField(10);
		JButton b1=new JButton("Calculate");
		JButton b2=new JButton("Cancel");
		panel.add(label1);
		panel.add(radiusTf1);
		panel.add(label2);
		panel.add(areaTf2);
		panel.add(b1);
		panel.add(b2);
		f.pack();
		f.setVisible(true)
	}
}
