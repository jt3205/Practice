package GUI;

import java.awt.*;
import javax.swing.*;

public class BorderLayout_ extends JFrame{
	Container contentPane = getContentPane();
	BorderLayout_(){
		contentPane.setLayout(new BorderLayout(5,5));
		contentPane.setBackground(Color.red);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.add(new JButton("AAA"),BorderLayout.EAST);
		contentPane.add(new JButton("AAA"),BorderLayout.WEST);
		contentPane.add(new JButton("AAA"),BorderLayout.SOUTH);
		contentPane.add(new JButton("AAA"),BorderLayout.NORTH);
		contentPane.add(new JButton("AAA"),BorderLayout.CENTER);
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderLayout_();
	}

}
