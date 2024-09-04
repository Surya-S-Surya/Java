import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class projectbolditalic extends JFrame implements ActionListener{

JRadioButton r1,r2,r3;
JTextField t;
JLabel l;
JCheckBox c1,c2;
	projectbolditalic(){
	l=new JLabel("Enter text here -->");
	l.setBounds(50,30,150,30);
	t=new JTextField();
	t.setBounds(160,30,200,30);
	t.setFont(new Font("corbel",Font.PLAIN,17));
	r1=new JRadioButton();
	r2=new JRadioButton();
	c1=new JCheckBox("UPPERCASE");
	c1.setBounds(260,110,150,30);
	c1.addActionListener(this);
	c1.setFocusable(false);
	c2=new JCheckBox("LOWERCASE");
	c2.setBounds(260,70,150,30);
	c2.addActionListener(this);
	c2.setFocusable(false);
	ButtonGroup g=new ButtonGroup();
	g.add(c1);
	g.add(c2);
	r1.setText("BOLD");
	r1.setFocusable(false);
	r1.addActionListener(this);
	r1.setBounds(100,110,100,50);
	r1.setFont(new Font("corbel",Font.BOLD,18));
	r2.setText("Italic");
	r2.setFocusable(false);
	r2.setBounds(100,150,100,50);
	r2.addActionListener(this);
	r2.setFont(new Font("corbel",Font.ITALIC,18));
	r3=new JRadioButton();
	r3.setText("Regular");
	r3.setFocusable(false);
	r3.setBounds(100,70,100,50);
	r3.addActionListener(this);
	r3.setFont(new Font("corbel",Font.PLAIN,18));
	ButtonGroup bg=new ButtonGroup();
	bg.add(r1);
	bg.add(r2);
	bg.add(r3);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.add(l);
	
	this.add(t);
	this.add(c1);
	this.add(c2);
	this.add(r1);
	this.add(r2);
	this.add(r3);
	this.setSize(500,500);
	this.setLayout(null);
	this.setVisible(true);
}
	public void actionPerformed(ActionEvent e) {
		String text1=null;
		if(e.getSource()==r1)
		{
			text1=t.getText();
			t.setFont(new Font ("Corbel" , Font.BOLD , 18));
		}
		 if(e.getSource()==r2)
		{
			 text1=t.getText();
				t.setFont(new Font ("Corbel" , Font.ITALIC , 18));
		}
		if(e.getSource()==r3)
		{
			text1=t.getText();
			t.setFont(new Font ("Corbel" , Font.PLAIN , 18));
		}
		if(e.getSource()==c2)
		{text1=t.getText();
			String text2=text1.toLowerCase();
			t.setText(text2);
		}
		if(e.getSource()==c1)
		{text1=t.getText();
			String text2=text1.toUpperCase();
			t.setText(text2);
		}
	}
}
