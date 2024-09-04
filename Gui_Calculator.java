import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Gui_Calculator extends JFrame implements ActionListener{
	float a=0,n1=0,n2=0;
	char op = 0;
	JButton addd,sub,mul,div,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,beq,bc,bd,bp;
	JTextField tf;
	JPanel pm,p1,p2,p3;

Gui_Calculator()
{
	this.setLayout(null);
	tf=new JTextField();
	tf.setBackground(Color.LIGHT_GRAY);
	tf.setForeground(Color.DARK_GRAY);
	tf.setEditable(false);
	tf.setFont(new Font("verdana",Font.PLAIN,30));
	tf.setBounds(100,50,300,50);
	
	addd=new JButton("+");
	addd.setBackground(Color.GRAY);
	addd.setForeground(Color.red);
	addd.setFont(new Font("calibiri",Font.PLAIN,30)); 
	addd.setFocusable(false);
	
	sub=new JButton("-");	
	sub.setBackground(Color.GRAY);
	sub.setForeground(Color.red);
	sub.setFont(new Font("calibiri",Font.PLAIN,30));
	sub.setFocusable(false);
	
	mul=new JButton("x");
	mul.setBackground(Color.GRAY);
	mul.setForeground(Color.red);
	mul.setFont(new Font("calibiri",Font.PLAIN,30));
	mul.setFocusable(false);
	
	div=new JButton("/");
	div.setBackground(Color.GRAY);
	div.setForeground(Color.red);
	div.setFont(new Font("calibiri",Font.PLAIN,30));
	div.setFocusable(false);
	
	b1=new JButton("1"); 
	b1.setFont(new Font("calibiri",Font.PLAIN,30));
	b1.setFocusable(false);
	
	b2=new JButton("2");
	b2.setFont(new Font("calibiri",Font.PLAIN,30));
	b2.setFocusable(false);
	
	b3=new JButton("3");
	b3.setFont(new Font("calibiri",Font.PLAIN,30));
	b3.setFocusable(false);
	
	b4=new JButton("4");
	b4.setFont(new Font("calibiri",Font.PLAIN,30));
	b4.setFocusable(false);
	
	b5=new JButton("5");
	b5.setFont(new Font("calibiri",Font.PLAIN,30));
	b5.setFocusable(false);
	
	b6=new JButton("6");
	b6.setFont(new Font("calibiri",Font.PLAIN,30));
	b6.setFocusable(false);
	
	b7=new JButton("7");
	b7.setFont(new Font("calibiri",Font.PLAIN,30));
	b7.setFocusable(false);
	
	b8=new JButton("8");
	b8.setFont(new Font("calibiri",Font.PLAIN,30));
	b8.setFocusable(false);
	
	b9=new JButton("9");
	b9.setFont(new Font("calibiri",Font.PLAIN,30));
	b9.setFocusable(false);
	
	b0=new JButton("0");
	b0.setFont(new Font("calibiri",Font.PLAIN,30));
	b0.setFocusable(false);
	
	beq=new JButton("=");
	beq.setFont(new Font("calibiri",Font.PLAIN,30));
	beq.setFocusable(false);
	
	bp=new JButton(".");
	bp.setFont(new Font("calibiri",Font.PLAIN,30));
	bp.setFocusable(false);

	
	bc=new JButton("CE");
	bc.setFont(new Font("calibiri",Font.PLAIN,30));
	bc.setFocusable(false);
	bc.setBounds(100,400,140,50);
	
	bd=new JButton("<-");
	bd.setFont(new Font("calibiri",Font.PLAIN,30));
	bd.setFocusable(false);
	bd.setBounds(260,400,140,50);
	
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);
	b0.addActionListener(this);
	addd.addActionListener(this);
	sub.addActionListener(this);
	mul.addActionListener(this);
	div.addActionListener(this);
	beq.addActionListener(this);
	bd.addActionListener(this);
	bp.addActionListener(this);
	bc.addActionListener(this);
	
	this.add(bc);
	this.add(bd);
	
	p1=new JPanel();
	p1.setBounds(100,120,300,260);
	p1.setLayout(new GridLayout(4,4,5,5));

	this.add(tf);
	
	p1.add(b1);
	p1.add(b2);
	p1.add(b3);
	p1.add(addd);
	
	p1.add(b4);
	p1.add(b5);
	p1.add(b6);
	p1.add(sub);
	
	p1.add(b7);
	p1.add(b8);
	p1.add(b9);
	p1.add(mul);
	
	p1.add(bp);
	p1.add(b0);
	p1.add(beq);
	p1.add(div);
	


this.add(tf);
this.add(p1);
this.setForeground(Color.black);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setSize(500,600);
this.setVisible(true);

}
@override
public void actionPerformed(ActionEvent e) 
{
	
	if(e.getSource()==b1)
	{
		tf.setText(tf.getText().concat(String.valueOf(1)));
	}
	else if(e.getSource()==b0)
	{
		tf.setText(tf.getText().concat(String.valueOf(0)));
	}
	else if(e.getSource()==b2)
	{
		tf.setText(tf.getText().concat(String.valueOf(2)));
	}
	else if(e.getSource()==b3)
	{
		tf.setText(tf.getText().concat(String.valueOf(3)));
	}
	else if(e.getSource()==b4)
	{
		tf.setText(tf.getText().concat(String.valueOf(4)));
	}
	else if(e.getSource()==b5)
	{
		tf.setText(tf.getText().concat(String.valueOf(5)));
	}
	else if(e.getSource()==b6)
	{
		tf.setText(tf.getText().concat(String.valueOf(6)));
	}
	else if(e.getSource()==b7)
	{
		tf.setText(tf.getText().concat(String.valueOf(7)));
	}
	else if(e.getSource()==b8)
	{
		tf.setText(tf.getText().concat(String.valueOf(8)));
	}
	else if(e.getSource()==b9)
	{
		tf.setText(tf.getText().concat(String.valueOf(9)));
	}
	if(e.getSource()==bp)
	{
		tf.setText(tf.getText().concat("."));
	}
	
	 if(e.getSource()==addd)
	{
		n1=Float.parseFloat(tf.getText());
		System.out.println(n1);
		op='+';
		tf.setText("");
	}
	 if(e.getSource()==sub)
	{
		n1=Float.parseFloat(tf.getText());	
		op='-';
		tf.setText("");
	}
	 if(e.getSource()==mul)
	{
		n1=Float.parseFloat(tf.getText());	
		op='*';
		tf.setText("");
	}
	 if(e.getSource()==div)
	{
		n1=Float.parseFloat(tf.getText());	
		op='/';
		tf.setText("");
	}
	 if(e.getSource()==beq)
	{
		 n2=Float.parseFloat(tf.getText());
		 switch(op){
		 case '+':
			 a=n1+n2;
			 break;
		 case '-':
			 a=n1-n2;
			 break;	
		 case '*':
			 a=n1*n2;
			 break;
		 case '/':
			 a=n1/n2;
			 break;
		 }
		 tf.setText(String.valueOf(a));
		 n1=a;
	}
	 if(e.getSource()==bc)
			  {
		 	tf.setText("");
	 }
	 if(e.getSource()==bd) {
		 String s=tf.getText();
		 tf.setText("");
		 int num=s.length();
		 for(int i=0;i<num-1;i++)
		 {
			 tf.setText(tf.getText()+s.charAt(i));
	 }
	
}


}

}
