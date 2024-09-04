import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class studentresponse extends JFrame implements ActionListener{
	int i=0,k=1970;
	String[] degree= {"B.TECH","B.E","B.SC","B.ARCH"};
	String[] branch= {"CSE","ECE","MECH","EEE","BIO"};
	String[] years= {"1","2","3","4"};
	String[] date=new String[32],year=new String[40];
	String[] month= {"january","February","March","April","May","June","July","August","September","October","November","December"};
	JFrame f;
	JLabel lreg,lname,lgender,ldegree,lbranch,lyear,ldob,laddress,lemail,lhobby,lextra,ltf;
	JTextField tfreg,tfname,tfaddress,tfemail;
	JRadioButton rm,rf;
	ButtonGroup bgr,bgc;
	JComboBox cbdegree,cbbranch,cbyears,cbyear,cbdate,cbmonth;
	JPopupMenu pmextra;
	JCheckBox cbstamp,cbnovel,cbtennis;
	DefaultListModel <String> l1;
	JList<String> list;
	JTextArea tf;
	studentresponse()
	{
		
		lreg=new JLabel("Register NO.");
		lreg.setBounds(10,10,100,30);
		
		
		lname=new JLabel("Name");
		lname.setBounds(10,60,100,30);
		
		lgender=new JLabel("Gender");
		lgender.setBounds(10,110,100,30);
		
		
		ldegree=new JLabel("Degree");
		ldegree.setBounds(10,160,100,30);
		
		lbranch=new JLabel("Branch");
		lbranch.setBounds(10,210,100,30);
		
		lyear=new JLabel("Year of Study");
		lyear.setBounds(10,260,100,30);
		
		ldob=new JLabel("Date of Birth");
		ldob.setBounds(10,310,100,30);
		
		laddress=new JLabel("Address");
		laddress.setBounds(10,360,100,30);
		
		lemail=new JLabel("E-Mail ID");
		lemail.setBounds(10,510,100,30);
	
		lhobby=new JLabel("Hobby");
		lhobby.setBounds(350,10,100,30);
		
		
		
		lextra=new JLabel("Extra curricular Activities");
		lextra.setBounds(350,60,200,30);
		
		
		ltf=new JLabel("you Entered");
		ltf.setBounds(350,200,100,30);
		
		tfreg=new JTextField();
		tfreg.setBounds(120,10,100,30);
		
		
		tfname=new JTextField();
		tfname.setBounds(120,60,100,30);
		

		tfaddress=new JTextField();
		tfaddress.setBounds(120,360,150,100);
		
		tfemail=new JTextField();
		tfemail.setBounds(120,510,200,30);
		
		
		rm=new JRadioButton("Male");
		rm.setBounds(120,110,70,30);
		
		rf=new JRadioButton("Female");
		rf.setBounds(200,110,90,30);
		
		
		bgr=new ButtonGroup();
		bgr.add(rm);
		bgr.add(rf);
		
		
		cbdegree=new JComboBox(degree);
		cbdegree.setBounds(120,160,80,20);
		
		
		
		cbbranch=new JComboBox(branch);
		cbbranch.setBounds(120,210,80,20);
		
		
		
		cbyears=new JComboBox(years);
		cbyears.setBounds(120,265,50,20);
		
		
		l1=new DefaultListModel<String>();

		l1.addElement("Tennis");

		l1.addElement("Cricket");

		l1.addElement("Football");

		l1.addElement("basketball");

		list=new JList<>(l1);
		list.setBounds(400,100,100,75);

		


		cbstamp=new JCheckBox("Stamp Collector");
		cbstamp.setBounds(400,10,120,30);
		

		cbtennis=new JCheckBox("Tennis Player");
		cbtennis.setBounds(630,10,120,30);
		

		cbnovel=new JCheckBox("Novel reader");
		cbnovel.setBounds(530,10,100,30);
		
		
		
		tf=new JTextArea();
		tf.setBounds(400,250,200,200);
		
		
		
		
		
		
		
		
		
		while(i<31)
		{
			String j=null;
			j=String.valueOf(i+1);
			date[i]=j;
			i++;
		}
		i=0;
		while(i<40)
		{
			String j=null;
			j=String.valueOf(k);
			year[i]=j;
			k++;
			i++;
		}
		

	
		cbdate=new JComboBox(date);
		cbdate.setBounds(100,310,50,20);
		
		
		cbmonth=new JComboBox(month);
		cbmonth.setBounds(160,310,100,20);
		cbyear=new JComboBox(year);
		cbyear.setBounds(270,310,70,20);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		this.add(lreg);
		this.add(lname);
		this.add(lgender);
		this.add(ldegree);
		this.add(lbranch);
		this.add(lyear);
		this.add(ldob);
		this.add(laddress);
		this.add(lemail);
		this.add(lhobby);
		this.add(lextra);
		this.add(ltf);
		this.add(tfreg);
		this.add(tfname);
		this.add(tfaddress);
		this.add(tfemail);
		this.add(rm);
		this.add(rf);
		this.add(cbdegree);
		this.add(cbbranch);
		this.add(cbyears);
		this.add(cbdate);
		this.add(cbmonth);
		this.add(cbyear);
		this.add(list);
		this.add(cbtennis);
		this.add(cbnovel);
		this.add(cbstamp);
		this.add(tf);

		
		
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,800);
		this.setLayout(null);
		this.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e) {
				if(e.getSource()==list)
				{
					System.out.println(list.getSelectedIndex());
				}
	}
	
	
}
