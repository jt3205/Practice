package GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.JFrame;

public class Click_Print extends JFrame {
	JLabel text = new JLabel("Hello");

	Click_Print() {
		setTitle("클릭한 위치에 글자 출력");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		MyMouseListener1 mouseListener1 = new MyMouseListener1();
		MyMouseListener2 mouseListener2 = new MyMouseListener2();
		contentPane.addMouseListener(mouseListener1);
		text.addMouseListener(mouseListener2);
		contentPane.add(text);
		contentPane.setBackground(Color.yellow);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Click_Print();
	}

	class MyMouseListener1 implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			int X = e.getX();
			int Y = e.getY();
			text.setSize(80,20);
			text.setLocation(X, Y);

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			
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

	class MyMouseListener2 implements MouseListener {
		MyMouseListener1 lis = new MyMouseListener1();

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			text.setText("안녕");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			text.setText("곤니찌와");
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

}
