import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class myadd12 extends JFrame implements ActionListener{
	JTextField tf1;
	JTextField tf2;
	JTextField tf3;

	JLabel l1,l2,l3,l4;

	JButton b1,b2,b3,b4;
	myadd12(){
		JPanel p=new JPanel();
		p.setBackground(Color.orange);
		p.setBounds(30,30,350,300);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		tf1=new JTextField();
		tf1.setBounds(150,50,100,30);
		tf1.setHorizontalAlignment(JTextField.CENTER);
		l1=new JLabel("Number 1:");
		l1.setBounds(70,50,100,30);
		tf2=new JTextField();
		tf2.setBounds(150,100,100,30);		
		tf2.setHorizontalAlignment(JTextField.CENTER);
		l2=new JLabel("Number 2:");
		l2.setBounds(70,100,100,30);
		tf3=new JTextField();
		tf3.setBounds(150,200,100,30);		
		tf3.setHorizontalAlignment(JTextField.CENTER);
		l3=new JLabel("Output:");
		l3.setBounds(70,200,100,30);
		b1=new JButton();
		b1.setText("Add");
		b2=new JButton("Sub");
		b3=new JButton("Mul");
		b4=new JButton("Div");
		

		b1.setBounds(30,150,30,20);
		b1.setSize(60,20);
		b1.addActionListener(this);
		b2.setBounds(100,150,30,20);
		b2.setSize(60,20);
		b2.addActionListener(this);
		b3.setBounds(170,150,30,20);
		b3.setSize(60,20);
		b3.addActionListener(this);
		b4.setBounds(240,150,30,20);
		b4.setSize(60,20);
		b4.addActionListener(this);
		tf1.setSize(120,30);
		tf2.setSize(120,30);
		tf3.setSize(120,30);
		p.setLayout(new BorderLayout(10,10));
		l4=new JLabel();
		p.add(tf1);
		p.add(l1);
		p.add(tf2);
		p.add(l2);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(tf3);
		p.add(l3);
		p.add(l4);
		this.add(p,BorderLayout.NORTH);
		this.setSize(500,500);
		this.setVisible(true);
		
		
		
	}
@override
	public void actionPerformed(ActionEvent e) {
	int num1=Integer.parseInt(tf1.getText());
	int num2=Integer.parseInt(tf2.getText());
	int add=num1+num2;
	int sub=num1-num2;
	int mul=num1*num2;
	int div=num1/num2;
			if(e.getSource()==b1) {
				tf3.setText(String.valueOf(add));
				
			}
			if(e.getSource()==b2) {
				tf3.setText(String.valueOf(sub));
				
			}
			if(e.getSource()==b3) {
				tf3.setText(String.valueOf(mul));
				
			}
			if(e.getSource()==b4) {
				tf3.setText(String.valueOf(div));
				
			}
	}
	

}
