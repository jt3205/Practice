package GUI;

import java.awt.*;
import javax.swing.*;


public class ContentPaneEx extends JFrame{

	ContentPaneEx() {	//생성자
		//제목달기
		setTitle("타이틀");
		//프레임 윈도우를 닫으면 프로그램 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ContentPane을 알아낸다.
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.blue);
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JButton("A"));
		contentPane.add(new JButton("B"));
		contentPane.add(new JButton("C"));
		
		setSize(300, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ContentPaneEx();
	}

}
