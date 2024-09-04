import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class sliderexample implements ChangeListener {
JFrame f;
JLabel l;
JPanel p;
JSlider s;
sliderexample() {


		f=new JFrame();
		l=new JLabel("Size");
		
		p=new JPanel();
		p.setLayout(null);
		s=new JSlider(0,50,20);
		p.setBounds(50,10,500,500);
		s.setPreferredSize(new Dimension(100,400));
		s.setBounds(10,10,50,400);
		s.setPaintTicks(true);
		s.setMinorTickSpacing(5);
		s.setPaintTrack(true);
		s.setMajorTickSpacing(10);
		s.setPaintLabels(true);
		s.setOrientation(SwingConstants.VERTICAL);
		l.setFont(new Font("corbel",Font.ITALIC, 20));
		l.setBounds(10,400,50,70);
		l.setText("C= "+s.getValue());
		s.addChangeListener(this);
		p.add(s);
		p.add(l);
		f.add(p);
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(600,600);
		f.setLayout(null);
		f.setVisible(true);
		
	}
@override
	public void stateChanged(ChangeEvent e) {
		l.setText("C= "+s.getValue());
		
	}

}
