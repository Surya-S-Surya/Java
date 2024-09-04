

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class newwindow {
JFrame f=new JFrame();
JLabel l=new JLabel("go to sleep");
newwindow(){
	l.setBounds(100,100,200,50);
	l.setFont(new Font("MV boli",Font.BOLD,20));
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(500,500);
f.setLayout(null);
f.setVisible(true);
f.add(l);

}
}
