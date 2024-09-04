package newgui;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class myframe extends JFrame {
	myframe(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,400);

JTextField tf=new JTextField();

tf.setPreferredSize(new Dimension(200,50));

this.add(tf);
this.setVisible(true);
	

}
}