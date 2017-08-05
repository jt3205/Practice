package GUI;

import java.awt.*;
import java.awt.FlowLayout;

import javax.swing.*;

public class FlowLayout_ extends JFrame{
	
	FlowLayout_() {
		Container contentPane = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		contentPane.setBackground(Color.cyan);
		contentPane.add(new JButton("A"));
		contentPane.add(new JButton("B"));
		contentPane.add(new JButton("C"));
		contentPane.add(new JButton("D"));
		contentPane.add(new JButton("EEEEEEEE"));
		
		setSize(300, 200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new FlowLayout_();
	}

}
