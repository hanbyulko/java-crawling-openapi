package kosta.mvc.view;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrameView {
	JFrame frame;
	JPanel panel;
	JTextField jtf;;
	
	
	public JFrameView() {
		frame = new JFrame();
		frame.setSize(new Dimension(600, 800));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		
		
	}
	
	public static void main(String[] args) {
		new JFrameView();
	}
}
