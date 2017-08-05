package GUI;

import java.awt.*;
import javax.swing.*;

public class GridLayout_ extends JFrame{
	
	GridLayout_() {
		Container contentPane = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setLayout(new GridLayout(4, 2, 5, 5));
		contentPane.setBackground(Color.GREEN);
		contentPane.add(new JLabel("이름"));
		contentPane.add(new JTextField("박형진"));
		contentPane.add(new JLabel("이름"));
		contentPane.add(new JTextField("박형진"));
		contentPane.add(new JLabel("이름"));
		contentPane.add(new JTextField("박형진"));
		contentPane.add(new JLabel("이름"));
		contentPane.add(new JTextField("박형진"));
		setSize(300,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new GridLayout_();
	}

}
