package GUI;

import java.awt.*;
import javax.swing.*;


public class ContentPaneEx extends JFrame{

	ContentPaneEx() {	//������
		//����ޱ�
		setTitle("Ÿ��Ʋ");
		//������ �����츦 ������ ���α׷� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ContentPane�� �˾Ƴ���.
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
