

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class myframe extends JFrame implements ActionListener {
	JButton b;
	static JLabel l;
	JTextField tf;
	int t=0;
	myframe(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(new FlowLayout());
b=new JButton();
tf=new JTextField();
tf.setFont(new Font("consolas",Font.BOLD,20));
tf.setForeground(Color.ORANGE);
tf.setBackground(Color.black);
tf.setCaretColor(Color.white);
l=new JLabel("Enter the age");

b.setText("SUBMIT");
b.addActionListener(this);
tf.setPreferredSize(new Dimension(300,50));
this.add(l);
this.add(b);
this.add(tf);
this.setSize(1000,500);
this.setVisible(true);

	}
	
	@override
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b) 
	{
			t=Integer.parseInt(tf.getText());
			try
			{
				checkAge(t);
			
			} catch (AgeException e1) {
					l.setText("AGE RESTRICTED");
			}
			finally{
				
			}
		
	}
}
	static void checkAge(int t)throws AgeException
	{
		if(t<18)
		{
			throw new AgeException();
		}
		else
		{
			l.setText("Enter the age");
		}
	}
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}
}

