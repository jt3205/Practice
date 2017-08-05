package GUI;

import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Random_Color extends JFrame {
	Container contentPane = getContentPane();
	JLabel text1 = new JLabel("���͸� ���������� ������ �����ϰ� �ٲ�ϴ�.");
	JLabel text2 = new JLabel("\'q\'�� �����ų� ���α׷� �����ư�� ������ ���α׷��� ����˴ϴ�.");
	Random_Color() {

		contentPane.setLayout(null);
		contentPane.setBackground(Color.WHITE);

		MyKeyListener keyListen = new MyKeyListener();
		contentPane.addKeyListener(keyListen);

		

		text1.setLocation(300, 100);
		text1.setSize(500, 20);
		contentPane.add(text1);

		text2.setLocation(300, 150);
		text2.setSize(500, 20);
		contentPane.add(text2);

		MyMouseListener MouseListen = new MyMouseListener();
		JButton bt1 = new JButton("���α׷� ����");
		bt1.addMouseListener(MouseListen);
		bt1.setSize(200, 30);
		bt1.setLocation(400, 250);
		contentPane.add(bt1);

		setTitle("Ŭ��,���ͽ� ���� ��������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 500);
		setVisible(true);
		contentPane.requestFocus();
	}

	class MyKeyListener implements KeyListener {
		Random random = new Random();

		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == '\n'){
				int R = random.nextInt(256);
				int G = random.nextInt(256);
				int B = random.nextInt(256);
				contentPane.setBackground(new Color(R, G, B));
				text1.setText("R : "+R+" G : "+G+" B : "+B);
			}
			else if(e.getKeyChar() == 'q'){
				System.exit(0);
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

	class MyMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			System.exit(0);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}

	public static void main(String[] args) {
		new Random_Color();
	}

}
