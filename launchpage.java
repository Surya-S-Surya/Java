

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class launchpage implements ActionListener{
JFrame f=new JFrame();
JButton b=new JButton("hello");
	
	launchpage(){
	
		b.setBounds(100,100,200,40);
		b.setFocusable(false);
		b.addActionListener(this);
		f.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b)
		{
		newwindow mywindow  = new newwindow();
	}
		
	}
}
