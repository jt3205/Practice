import java.awt.*;

import javax.swing.*;
import java.awt.event.*;

public class MoveTheBox extends JFrame {
	Container contentPane = getContentPane();
	JLabel lb_box = new JLabel("■");
	int x = 230;
	int y = 210;
	int x_move = 0;
	int y_move = 0;

	MoveTheBox() {
		setLayout(null);
		setSize(500, 500);
		setTitle("Bounds!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lb_box.setForeground(Color.red);
		lb_box.setSize(20, 20);
		lb_box.setLocation(230, 210);
		contentPane.add(lb_box);
		contentPane.addKeyListener(new keylisten());
		setVisible(true);
		contentPane.requestFocus();
	}

	class keylisten implements KeyListener {
		int speed = 5;
		boolean Lkey_on = false;
		boolean UPkey_on = false;
		boolean Rkey_on = false;
		boolean DOWNkey_on = false;

		@Override
		public void keyPressed(KeyEvent e) {
			if (Lkey_on == true && UPkey_on == true) { // 왼쪽 위
				x -= speed;
				y -= speed;
			} else if (Rkey_on == true && UPkey_on == true) { // 오른쪽 위
				x += speed;
				y -= speed;
			} else if (Lkey_on == true && DOWNkey_on == true) { // 왼쪽 아래
				x -= speed;
				y += speed;
			} else if (Rkey_on == true && DOWNkey_on == true) { // 오른쪽 아래
				x += speed;
				y += speed;
			} else if (e.getKeyCode() == 37 && x > 0) { // 왼쪽
				Lkey_on = true;
				x -= speed;
			} else if (e.getKeyCode() == 38 && y > 0) { // 위
				UPkey_on = true;
				y -= speed;
			} else if (e.getKeyCode() == 39 && x > 0) { // 오른쪽
				Rkey_on = true;
				x += speed;
			} else if (e.getKeyCode() == 40 && y > 0) { // 아래
				DOWNkey_on = true;
				y += speed;
			}
			lb_box.setLocation(x,y);
			contentPane.repaint();
		}

		@Override
		public void keyReleased(KeyEvent e) {
			if (e.getKeyCode() == 37) {
				System.out.println("Lkey_on = false");
				Lkey_on = false;
			}
			if (e.getKeyCode() == 38) {
				System.out.println("UPkey_on = false");
				UPkey_on = false;
			}
			if (e.getKeyCode() == 39) {
				System.out.println("Rkey_on = false");
				Rkey_on = false;
			}
			if (e.getKeyCode() == 40) {
				System.out.println("DOWNkey_on = false");
				DOWNkey_on = false;
			}
		}

		@Override
		public void keyTyped(KeyEvent e) {

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MoveTheBox();
	}

}
