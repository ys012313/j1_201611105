package com.sd.gui;

import javax.swing.*;
import javax.awt.*;

public class CalcAreaGUIMain {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		JPanel panel=new JPanel(new GridLayout(3,2));
		f.getContentPane().add(panel);
		JLabel label1=new JLabel("반지름");
		JLabel label2=new JLabel("면적");
		JTextField radiusTF1=new TextField(10);
		JTextField areaTF1=new TextField(10);
		JButton b1=new JButton("계산");
		JButton b2=new JButton("취소");
		panel.add(label1);
		panel.add(radiusTF1);
		panel.add(label2);
		panel.add(areaTF2);
		panel.add(b1);
		panel.add(b2);
		f.pack();
		f.setVisible(true)
	}
}