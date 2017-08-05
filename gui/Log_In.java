package GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

import java.util.*;

public class Log_In extends JFrame {

	public static void main(String[] args) {
		new Log_In();

	}

	JLabel lb1 = new JLabel("ID");
	JLabel lb2 = new JLabel("Password");
	JTextField tf1 = new JTextField();
	JTextField tf2 = new JTextField();
	JButton bt1 = new JButton("로그인");
	JButton bt2 = new JButton("회원가입");

	Log_In() {
		Container contentPane = getContentPane();
		MouseListen mouseL = new MouseListen();

		lb1.setSize(50, 20);
		lb1.setLocation(75, 50);
		contentPane.add(lb1);

		tf1.setSize(150, 20);
		tf1.setLocation(75, 70);
		contentPane.add(tf1);

		lb2.setSize(100, 20);
		lb2.setLocation(75, 150);
		contentPane.add(lb2);
		
		tf2.setSize(150, 20);
		tf2.setLocation(75, 170);
		contentPane.add(tf2);
		
		
		bt1.setSize(90, 30);
		bt1.setLocation(275, 70);
		contentPane.add(bt1);
		bt1.addMouseListener(mouseL);

		bt2.setSize(90, 30);
		bt2.setLocation(275, 170);
		contentPane.add(bt2);
		bt2.addMouseListener(mouseL);

		setSize(450, 300);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("로그인");
		setVisible(true);

	}

	class MouseListen implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource() == bt1) {
				String get = hash.get(tf1.getText());
				if (get.equals(tf2.getText())) {
					getContentPane().removeAll();
					getContentPane().setVisible(false);
					new Log_In_OK();
				}
			} else if (e.getSource() == bt2) {
				new adduser();
			}
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

	JLabel id = new JLabel("환영합니다!");
	JButton exit = new JButton("종료");

	class Log_In_OK extends JFrame {
		Container contentPane = getContentPane();

		Log_In_OK() {
			contentPane.add(id);
			id.setSize(200, 20);
			id.setLocation(115, 50);
			
			exit.setLocation(105,145);
			exit.setSize(90,30);
			contentPane.add(exit);
			mouseListen mouseL = new mouseListen();
			exit.addMouseListener(mouseL);
			
			setTitle("로그인 완료");
			setSize(300, 250);
			setLayout(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}
		class mouseListen implements MouseListener {

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
	}

	HashMap<String, String> hash = new HashMap<String, String>();

	class adduser extends JFrame {

		JLabel lb1 = new JLabel("ID");
		JLabel lb2 = new JLabel("Password");
		JLabel lb3 = new JLabel("Check Password");
		JTextField tf1 = new JTextField();
		JTextField tf2 = new JTextField();
		JTextField tf3 = new JTextField();
		JButton bt1 = new JButton("회원가입");

		Container contentPane = getContentPane();

		adduser() {
			lb1.setSize(50, 20);
			lb1.setLocation(50, 25);
			contentPane.add(lb1);

			tf1.setSize(130, 20);
			tf1.setLocation(50, 45);
			contentPane.add(tf1);

			lb2.setSize(100, 20);
			lb2.setLocation(50, 85);
			contentPane.add(lb2);

			tf2.setSize(130, 20);
			tf2.setLocation(50, 105);
			contentPane.add(tf2);

			lb3.setSize(100, 20);
			lb3.setLocation(50, 145);
			contentPane.add(lb3);

			tf3.setSize(130, 20);
			tf3.setLocation(50, 165);
			contentPane.add(tf3);

			bt1.setSize(100, 140);
			bt1.setLocation(200, 45);
			contentPane.add(bt1);

			mouseListen mouseL = new mouseListen();
			bt1.addMouseListener(mouseL);

			setSize(350, 260);
			setLayout(null);
			setTitle("회원가입");
			setVisible(true);

		}

		JLabel lb = new JLabel("회원가입 완료.");
		JButton bt = new JButton("확인");

		class ok {
			ok() {
				Container contentPane = getContentPane();
				mouseListen mouseL = new mouseListen();
				lb.setSize(100, 20);
				lb.setLocation(130, 70);
				contentPane.add(lb);

				bt.setSize(90, 30);
				bt.setLocation(130, 150);
				contentPane.add(bt);
				bt.addMouseListener(mouseL);
				contentPane.setLayout(null);
				setSize(350, 260);
				setTitle("회원가입 완료");
				contentPane.setVisible(true);
			}
		}

		class mouseListen implements MouseListener {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getSource() == bt1) {
					if (tf2.getText().equals(tf3.getText())) {
						hash.put(tf1.getText(), tf2.getText());
						contentPane.removeAll();
						contentPane.setVisible(false);
						new ok();
					}
				}
				if (e.getSource() == bt) {
					setVisible(false);
				}

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
	}

}
