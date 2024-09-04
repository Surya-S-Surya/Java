import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class pblpractice extends JFrame


{
	private static final float CENTER = 0;

	pblpractice(){

this.setLayout(new FlowLayout(FlowLayout.LEADING,10,10));
JPanel p=new JPanel();
JTextField t=new JTextField(10);

		JButton  b1=new JButton("1");
		JButton  b2=new JButton("2");
		JButton  b3=new JButton("3");
		JButton  b4=new JButton("4");
		JButton  b5=new JButton("5");
		JButton  b6=new JButton("6");
		Border b=BorderFactory.createLineBorder(Color.GRAY,10);
		p.setLayout(new GridLayout(6,2,10,20));

		p.setPreferredSize(new Dimension(300,300));
		p.setBackground(Color.gray);
this.setLayout(new BorderLayout(10,10));
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.add(p,BorderLayout.WEST);
p.add(t);
p.setBorder(b);
p.add(b1);
p.add(b2);
p.add(b3);
p.add(b4);
p.add(b5);
p.add(b6);

this.setSize(500,500);
this.setVisible(true);

}

}