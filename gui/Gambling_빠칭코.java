package GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

import GUI.Random_Color.MyKeyListener;

import java.util.*;

public class Gambling_빠칭코 extends JFrame {

	JLabel lb1 = new JLabel("Enter키를 누를때 마다 랜덤하게 출력됩니다.");
	JLabel lb2 = new JLabel("시작합니다.");
	JLabel num1 = new JLabel("");
	JLabel num2 = new JLabel("");
	JLabel num3 = new JLabel("");
	
	Gambling_빠칭코() {
		Container contentPane = getContentPane();
		lb1.setLocation(75, 50);
		lb1.setSize(300, 20);
		contentPane.add(lb1);

		num1.setSize(50, 50);
		num1.setLocation(80, 110);
		num1.setForeground(Color.white);
		num1.setBackground(Color.black);
		num1.setOpaque(true);
		num1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		contentPane.add(num1);

		num2.setSize(50, 50);
		num2.setLocation(175, 110);
		num2.setForeground(Color.white);
		num2.setBackground(Color.black);
		num2.setOpaque(true);
		num2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		contentPane.add(num2);

		num3.setSize(50, 50);
		num3.setLocation(270, 110);
		num3.setForeground(Color.white);
		num3.setBackground(Color.black);
		num3.setOpaque(true);
		num3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		contentPane.add(num3);

		lb2.setSize(150, 20);
		lb2.setLocation(160, 200);
		contentPane.add(lb2);

		MyKeyListener keyListen = new MyKeyListener();
		contentPane.addKeyListener(keyListen);
		
		
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("빠칭코");
		setBackground(Color.white);
		setSize(400, 300);
		setVisible(true);
		contentPane.requestFocus();
	}

	class MyKeyListener implements KeyListener {
		Random random = new Random();
		@Override
		public void keyPressed(KeyEvent e) {
		//	System.out.println("A");	//test
			if (e.getKeyCode() == '\n') {
		//		System.out.println("a");	//test
				int i1 = random.nextInt(4);
				String rand = "";
				if (i1 == 0) {
					rand = "0";
				} else if (i1 == 1) {
					rand = "1";
				} else if (i1 == 2) {
					rand = "2";
				} else if (i1 == 3) {
					rand = "3";
				}
				num1.setText(rand);

				int i2 = random.nextInt(4);
				rand = "";
				if (i2 == 0) {
					rand = "0";
				} else if (i2 == 1) {
					rand = "1";
				} else if (i2 == 2) {
					rand = "2";
				} else if (i2 == 3) {
					rand = "3";
				}
				num2.setText(rand);

				int i3 = random.nextInt(4);
				rand = "";
				if (i3 == 0) {
					rand = "0";
				} else if (i3 == 1) {
					rand = "1";
				} else if (i3 == 2) {
					rand = "2";
				} else if (i3 == 3) {
					rand = "3"; 
				}
				num3.setText(rand);
				
				if(i1 == i2 && i2 == i3){
					getContentPane().setBackground(Color.yellow);
					lb2.setText("축하합니다!");
				}
				else{
					getContentPane().setBackground(Color.white);
					lb2.setText("아쉽네요...");
				}
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

	public static void main(String[] args) {
		new Gambling_빠칭코();
	}

}
