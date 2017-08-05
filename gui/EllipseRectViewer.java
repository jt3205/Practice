package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EllipseRectViewer {
	
	public static void main(String[] args) {
		final JFrame frame = new JFrame();

		final int FRAME_WIDTH = 400;
		final int FRAME_HEIGHT = 400;
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("Rectangle and Ellipse Draw");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		JPanel panel = new JPanel();
		frame.add(panel, BorderLayout.NORTH);

		class RectangleDrawListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				RectangleComponent r2 = new RectangleComponent();
				frame.add(r2);
			}
		}
		JButton rectButton = new JButton("Rectangle");
		ActionListener rectDrawListener = new RectangleDrawListener();
		rectButton.addActionListener(rectDrawListener);
		panel.add(rectButton);

		frame.setVisible(true);
	}
}
