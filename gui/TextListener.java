package GUI;

import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class TextListener extends JFrame{
	JTextField tf1 = new JTextField();
	JLabel lb1 = new JLabel("");
	TextListener() {
		Container contentPane = getContentPane();
		
		contentPane.setLayout(null);
		lb1.setSize(200,20);
		lb1.setLocation(150,70);
		lb1.setBackground(Color.CYAN);
		contentPane.add(lb1);
		
		tf1.setSize(200,20);
		tf1.setLocation(100, 200);
		
	//	tf1.setEchoChar('*'); 
	//	글자 대신 *로 표시
		contentPane.add(tf1);
		
		KeyListen keyL = new KeyListen();
		tf1.addKeyListener(keyL);
		
		setTitle("입력 , 출력");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		setVisible(true);
		tf1.requestFocus();
	}
	
	public static void main(String[] args) {
		new TextListener();
	}

	class KeyListen implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == '\n'){
				lb1.setText(tf1.getText());
				tf1.setText(null);
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}
