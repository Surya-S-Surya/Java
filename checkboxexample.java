import javax.swing.JComboBox;
import javax.swing.JFrame;

public class checkboxexample {

	public static void main(String[] args) {
		JFrame f=new JFrame();

		String[] animals= {"cat","dog","cow","goat"};
		JComboBox c=new JComboBox(animals);
		c.setBounds(10,10,100,40);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(c);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		
		
		
		
	}

}
