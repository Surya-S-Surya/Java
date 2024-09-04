import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class employeedetails extends JFrame implements ActionListener{
	
	JFrame f;
	JLabel lage,lname,lid,ldept,lemail;
	static JLabel linvalidage,linvalidname,linvalidid,linvaliddept,linvalidemail;
	JTextField tfage,tfname,tfid,tfdept,tfemail;
	static JButton b;
	int a=0,id=0;
	String text=null,d=null,em=null;
	static String gm="@gmail.com";
	static String n1=null,n2=null,n3=null,n4=null,n5=null;
	JTextArea t1,t2,t3,t4,t5;
	static JTextArea[] gta;
	static int naa=0,idd=0,depp=0,agee=0,emm=0;
	int j=0;
	String search=null;
	JLabel lsearch;
	JButton bsearch;
	JTextField tfsearch;
	
	JTextArea tasearch;
	employeedetails(){
		
		f=new JFrame();
		t1=new JTextArea();
		t2=new JTextArea();
		t3=new JTextArea();
		t4=new JTextArea();

		
		t1.setBounds(400,50,200,150);
		t2.setBounds(400,250,200,150);
		t3.setBounds(650,50,200,150);
		t4.setBounds(650,250,200,150);

		
		
		gta=new JTextArea[5];
		

		gta[0]=t1;
		gta[1]=t2;
		gta[2]=t3;
		gta[3]=t4;
		gta[4]=t5;
		
		for(int i=0;i<4;i++)
		{
			gta[i].setBackground(Color.white);
			gta[i].setForeground(Color.black);
			gta[i].setEditable(false);
		}
		
		lage=new JLabel("Your age:");
		tfage=new JTextField();
		b=new JButton("SUBMIT");
		
		linvalidage=new JLabel();
		linvalidname=new JLabel();
		linvalidid=new JLabel();
		linvaliddept=new JLabel();
		linvalidemail=new JLabel();
		
		lname=new JLabel("Your Name:");
		lid=new JLabel("Your ID:");
		ldept=new JLabel("Your Department:");
		lemail=new JLabel("Your E-Mail:");

		tfname=new JTextField();
		tfid=new JTextField();
		tfdept=new JTextField();
		tfemail=new JTextField();
		
		lname.setBounds(50,50,100,50);
		lid.setBounds(50,100,100,50);
		ldept.setBounds(50,150,100,50);
		lemail.setBounds(50,250,100,50);
		
		tfname.setBounds(170,65,150,30);
		tfid.setBounds(170,115,150,30);
		tfdept.setBounds(170,165,150,30);
		tfemail.setBounds(170,265,150,30);
		
		linvalidage.setBounds(330,200,100,50);
		linvalidname.setBounds(330,50,100,50);
		linvalidid.setBounds(330,100,300,50);
		linvaliddept.setBounds(330,150,200,50);
		linvalidemail.setBounds(330,250,100,50);
		
		lage.setBounds(50,200,100,50);
		tfage.setBounds(170,215,150,30);
		b.setBounds(80,360,90,30);
		b.addActionListener(this);
		
		lsearch=new JLabel("Enter existing id:");
		lsearch.setBounds(900,150,100,30);
		tfsearch=new JTextField();
		tfsearch.setBounds(1020,150,100,30);
		
		tasearch=new JTextArea();
		tasearch.setBounds(900,250,200,200);
		
		bsearch=new JButton("Search");
		bsearch.setBounds(900,200,80,30);
		
		
		tfsearch.setEditable(false);
		bsearch.setEnabled(false);
		
		f.add(lsearch);
		f.add(tfsearch);
		f.add(tasearch);
		
		f.add(lname);

		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(bsearch);
		
		f.add(lid);
		f.add(ldept);
		f.add(lemail);
		f.add(tfdept);
		f.add(tfemail);
		f.add(tfname);
		f.add(linvalidid);
		f.add(linvalidname);
		f.add(linvaliddept);
		f.add(linvalidemail);
		f.add(tfid);
		f.add(linvalidage);
		f.add(b);
		f.add(lage);
		f.add(tfage);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setSize(1700,700);
		f.setLayout(null);
		f.setForeground(Color.red);
		f.setVisible(true);
	}
	

	
	
	public void actionPerformed(ActionEvent e) {
		while(j!=5)
		{
		n1=tfname.getText();
		n2=tfid.getText();
		n3=tfdept.getText();
		n4=tfage.getText();
		n5=tfemail.getText();
		if(e.getSource()==b)
		{
			
			a=Integer.parseInt(tfage.getText());
			text=tfname.getText();
			id=Integer.parseInt(tfid.getText());
			d=tfdept.getText();
			em=tfemail.getText();
			try {
			
				checkName(text);
				
			}
			catch(NameException e2)
			{
				linvalidname.setText("Fill Your Name");
				linvalidname.setForeground(Color.red);			}
			
			try
			{
				checkid(id);
			}
			catch(Exception e2)
			{
				linvalidid.setText("Your ID must contain 4 digits");
			
				linvalidid.setForeground(Color.red);
				
					}
			
			
			try 
			{
				checkdept(d);
				
			}
			catch(DeptException e4)
			{
				linvaliddept.setText("Fill Your Department");
				linvaliddept.setForeground(Color.red);			}
			
			
	
			try {
				checkage(a);
			}
			catch(Exception e1)
			{
				linvalidage.setText("Invalid age");
				linvalidage.setForeground(Color.red);
				
			}
			
			try {
				checkemail(em);
			}
			catch(Exception e5)
			{
				linvalidemail.setText("Invalid Email");
				linvalidemail.setForeground(Color.red);
				
			}

				if(naa==1 && idd==1 && agee==1 && depp==1 && emm==1)
				{
					gta[j].append(n1+"\n"+n2+"\n"+n3+"\n"+n4+"\n"+n5);

					tfname.setText("");

					tfid.setText("");

					tfdept.setText("");

					tfage.setText("");

					tfemail.setText("");
					
					naa=0;idd=0;depp=0;agee=0;emm=0;
					j=j+1;
					
					if(j==4)
					{
						tfname.setEditable(false);
						tfid.setEditable(false);
						tfdept.setEditable(false);
						tfage.setEditable(false);
						tfemail.setEditable(false);
						b.setEnabled(false);
						bsearch.setEnabled(true);
						tfsearch.setEditable(true);
						
						
						if (e.getSource()==bsearch)
						{
						String g1=gta[0].getText();
						String g2=gta[1].getText();
						String g3=gta[2].getText();
						String g4=gta[3].getText();
						String s1=tfsearch.getText();
							
						boolean r1=g1.contains(s1);
						boolean r2=g2.contains(s1);
						boolean r3=g3.contains(s1);
						boolean r4=g4.contains(s1);
						
						if(r1)
						{
							tasearch.setText(g1);
						}

						if(r2) {
							tasearch.setText(g2);

						}
						if(r3) {
							tasearch.setText(g3);

						}
						if(r4) {
							tasearch.setText(g4);

						}
							
						
					}
			
}
		

			}
		}
		
		}
			
		}


	static void checkName(String text)throws NameException
	{
		if(text.length()==0||text.length()==1)
		{
			throw new NameException();
		}
		else
		{
			linvalidname.setText("");
		naa=1;
		}
		
	}
	
	static void checkid(int id)throws IdException
	{
		if(id<1000||id>9999)
		{
			throw new IdException();
			
		}
		else
		{
			linvalidid.setText("");
				idd=1;
		}
	}

	static void checkdept(String d)throws DeptException
	{
		if(d.length()==0||d.length()==1)
		{
			throw new DeptException();
		}
		else
		{
			linvaliddept.setText("");
	depp=1;

		}
	}
	
	static void checkage(int a)throws AgeException
	{
		if(a<18 || a>39 )
		{
			throw new AgeException();
		}
		else
		{
			linvalidage.setText("");
			agee=1;
		}
		
	}
	static void checkemail(String em)throws emailException
	{
		boolean r=em.contains(gm);
		if(r)
		{
			linvalidemail.setText("");
	emm=1;
			
		}
		
		else {
			
			throw new emailException();		}
		
		
		
	}
		
		
		
	}


