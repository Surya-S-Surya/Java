package newgui;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class newwindow {
JFrame f=new JFrame();
JLabel l=new JLabel();
newwindow(){
	l.setBounds(100,100,200,50);
	l.setFont(new Font("MV boli",Font.BOLD,20));
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(50,50);
f.setLayout(null);
f.setVisible(true);

}
}
