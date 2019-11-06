package kosta.mvc.view;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrameView {
	JFrame frame;
	JPanel panel;
	JTextField jtf;
	JButton jbtn1;
	JButton jbtn2;
	
	public JFrameView() {
		frame = new JFrame();
		panel = new JPanel();
		jtf =new JTextField(10); 
		jbtn1 = new JButton("¹Ì¼¼¸ÕÁö");
		jbtn2 = new JButton("³¯¾¾");
		jbtn1.setSize(100, 30);
		jbtn2.setSize(100, 30);
		
		jtf.setFont(new Font("³ª´®°íµñ", 0, 40));
		jtf.setHorizontalAlignment(JTextField.CENTER);
		frame.setSize(new Dimension(600, 800));
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(jtf);
		panel.add(jbtn1);
		panel.add(jbtn2);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new JFrameView();
	}
}
