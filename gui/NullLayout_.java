package GUI;

import java.awt.*;
import javax.swing.*;

public class NullLayout_ extends JFrame{
	
	NullLayout_() {
		Container contentPane = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setLayout(null);
		JButton bt1 = new JButton("BUTTON");
		bt1.setSize(100,40);
		bt1.setLocation(50,50);
		contentPane.add(bt1);
		JButton bt2 = new JButton("BUTTON");
		bt2.setSize(100,40);
		bt2.setLocation(75,75);
		contentPane.add(bt2);
		JButton bt3 = new JButton("BUTTON");
		bt3.setSize(100,40);
		bt3.setLocation(100,100);
		contentPane.add(bt3);
		JButton bt4 = new JButton("BUTTON");
		bt4.setSize(100,40);
		bt4.setLocation(125,125);
		contentPane.add(bt4);
		
		setSize(500,500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new NullLayout_();
	}

}
