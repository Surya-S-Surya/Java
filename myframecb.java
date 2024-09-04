import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class myframecb extends JFrame implements ActionListener{
	JButton b;
	JCheckBox c;
myframecb(){
	this.setLayout(new FlowLayout());
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(500,600);
	b=new JButton();
	b.setText("SUBMIT");
	b.addActionListener(this);
	c=new JCheckBox();
	c.setText("DO you agree our Terms and COnditions");
	c.setFont(new Font("lucida caligraphy",Font.ITALIC,10));
	c.setForeground(Color.orange);
	c.setBackground(Color.black);
	c.setFocusable(false);
	this.add(b);
	this.add(c);
	this.setVisible(true);

	
}
@override
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b) {
		System.out.println(c.isSelected());
		
	}
	}

	

}










