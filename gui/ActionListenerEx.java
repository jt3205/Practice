package GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class ActionListenerEx extends JFrame{
	ActionListenerEx(){
		setTitle("ActionListener 예제 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.cyan);
		contentPane.setLayout(new FlowLayout());
		JButton bt = new JButton("BUTTON");
		
		MyActionListener actListener = new MyActionListener();
		bt.addActionListener(actListener);
		MyMouseListener mouseListener = new MyMouseListener();
		bt.addMouseListener(mouseListener);
		contentPane.add(bt);
		
		setSize(150,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ActionListenerEx();
	}

}

class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton bt = (JButton)e.getSource();	//버튼의 컴포넌트를 알아낸다
		
		if(bt.getText().equals("BUTTON")){
			bt.setText("버튼");
		}
		else{
			bt.setText("BUTTON");
		}
	}
	
}

class MyMouseListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		JButton bt = (JButton)e.getSource();
		bt.setBackground(Color.pink);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JButton bt = (JButton)e.getSource();
		bt.setBackground(Color.GRAY);
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