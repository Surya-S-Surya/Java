import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyEmployee extends JFrame implements ActionListener{
	JTextField empnametf,empnotf,sextf,qutf,depttf,dobtf1,dobtf2,dobtf3,mailtf;
	JPanel p;
	JTextField[] grouptf;
	JLabel lname,lno,lsex,lqu,ldept,ldob1,ldob2,ldob3,lmail,ldob;
	JLabel[] groupl;
	
	
	MyEmployee()
	{
		p=new JPanel();
		p.setBounds(100,70,500,600);
		p.setBackground(Color.cyan);
		
		empnametf=new JTextField();
		empnotf=new JTextField();
		sextf=new JTextField();
		qutf=new JTextField();
		depttf=new JTextField();
		dobtf1=new JTextField();
		dobtf2=new JTextField();
		dobtf3=new JTextField();
		mailtf=new JTextField();
		
		p.setLayout(null);

		p.add(empnametf);


		p.add(empnotf);
		p.add(sextf);
		p.add(qutf);
		p.add(depttf);
		p.add(dobtf1);
		p.add(dobtf2);
		p.add(dobtf3);
		p.add(mailtf);
		
		empnametf.setBounds(230,60,200,40);
		empnotf.setBounds(230,120,200,40);
		sextf.setBounds(230,180,200,40);
		qutf.setBounds(230,240,200,40);
		depttf.setBounds(230,300,200,40);
		dobtf1.setBounds(230,390,50,40);
		dobtf2.setBounds(305,390,50,40);
		dobtf3.setBounds(380,390,50,40);
		mailtf.setBounds(230,460,200,40);
		
		grouptf=new JTextField[9];
		

		grouptf[0]=empnametf;
		grouptf[1]=empnotf;
		grouptf[2]=sextf;
		grouptf[3]=qutf;
		grouptf[4]=depttf;
		grouptf[5]=dobtf1;
		grouptf[6]=dobtf2;
		grouptf[7]=dobtf3;
		grouptf[8]=mailtf;
		
		for(int i=0;i<9;i++)
		{
			 grouptf[i].setFont(new Font("Corbel",Font.PLAIN,20));
			 grouptf[i].setForeground(new Color(0,12,123));
		}
		

		lname=new JLabel("Employee Name:");
		lno=new JLabel("Employe Number:");
		lsex=new JLabel("Sex:");
		lqu=new JLabel("Qualification:");
		ldept=new JLabel("Department:");
		ldob1=new JLabel("Day");
		ldob2=new JLabel("Month");
		ldob3=new JLabel("Year");
		lmail=new JLabel("Mail:");
		groupl=new JLabel[10];
		
		lname.setBounds(50,60,200,40);
		lno.setBounds(50,120,200,40);
		lsex.setBounds(50,180,200,40);
		lqu.setBounds(50,240,200,40);
		ldept.setBounds(50,300,200,40);
		ldob1.setBounds(235,360,50,40);
		ldob2.setBounds(300,360,80,40);
		ldob3.setBounds(385,360,50,40);
		lmail.setBounds(50,460,200,40);
		ldob=new JLabel("DOB:");
		ldob.setBounds(50,390,200,40);
		
		groupl[0]=lname;
		groupl[01]=lno;
		groupl[02]=lsex;
		groupl[03]=lqu;
		groupl[4]=ldept;
		groupl[05]=ldob1;
		groupl[06]=ldob2;
		groupl[07]=ldob3;
		groupl[8]=lmail;
		groupl[9]=ldob;
		for(int i=0;i<10;i++)
		{
			groupl[i].setForeground(new Color(0,10,125));
			groupl[i].setFont(new Font("Corbel",Font.BOLD,22));
			p.add(groupl[i]);
		}
		
		
		
		this.add(p);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,800);
		this.setLayout(null);
		this.setVisible(true);
		
		
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
