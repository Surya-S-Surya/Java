import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class CourseCodeNotFoundException extends Exception
{
 CourseCodeNotFoundException()
 {super("course code missing");}
};

class feedback implements Runnable 
{
 ArrayList<String> ar = new ArrayList<String>();
 JLabel ll;
 Thread t;
 int rl=1;
 feedback()
 {
  JFrame f = new JFrame("FeedBack"); 
  f.setLayout(null);
  JLabel l1 = new JLabel("Course Code:");
  l1.setBounds(50,40,80,20);
  JLabel l2 = new JLabel("Name:");
  l2.setBounds(50,80,80,20);
  JLabel l3 = new JLabel("Whether all the required data are given?");
  l3.setBounds(50,120,250,20);
  JLabel l4 = new JLabel("Is any question from out of syllabus?");
  l4.setBounds(50,180,250,20);
  JLabel l5 = new JLabel("Standard of Questions in QP");
  l5.setBounds(50,240,250,20);
  JLabel l6 = new JLabel("Is time allotted sufficient?");
  l6.setBounds(50,320,250,20);
  JLabel l7 = new JLabel("Nature of QP");
  l7.setBounds(50,380,250,20);

  JTextField f1 = new JTextField();
  f1.setBounds(150,40,100,30);
  JTextField f2 = new JTextField();
  f2.setBounds(150,80,100,30);
  
  JRadioButton j1 = new JRadioButton("Yes");
  j1.setBounds(50,140,50,20);
  JRadioButton j2 = new JRadioButton("No"); 
  j2.setBounds(50,160,50,20);
  ButtonGroup bg1 = new ButtonGroup();
  bg1.add(j1);bg1.add(j2);
  
  JRadioButton j3 = new JRadioButton("Yes");
  j3.setBounds(50,200,50,20);
  JRadioButton j4 = new JRadioButton("No"); 
  j4.setBounds(50,220,50,20);
  ButtonGroup bg2 = new ButtonGroup();
  bg2.add(j3);bg2.add(j4);
  
  JRadioButton j5 = new JRadioButton("Good");
  j5.setBounds(50,260,70,20);
  JRadioButton j6 = new JRadioButton("Medium"); 
  j6.setBounds(50,280,70,20);
  JRadioButton j7 = new JRadioButton("Low"); 
  j7.setBounds(50,300,50,20);
  ButtonGroup bg3 = new ButtonGroup();
  bg3.add(j5);bg3.add(j6);bg3.add(j7);

  JRadioButton j8 = new JRadioButton("Sufficient");
  j8.setBounds(50,340,100,20);
  JRadioButton j9 = new JRadioButton("Insufficient"); 
  j9.setBounds(50,360,100,20);
  ButtonGroup bg4 = new ButtonGroup();
  bg2.add(j8);bg2.add(j9);

  JRadioButton j10 = new JRadioButton("Tough");
  j10.setBounds(50,400,70,20);
  JRadioButton j11 = new JRadioButton("Normal"); 
  j11.setBounds(50,420,70,20);
  JRadioButton j12 = new JRadioButton("Easy"); 
  j12.setBounds(50,440,70,20);
  ButtonGroup bg5 = new ButtonGroup();
  bg5.add(j10);bg5.add(j11);bg5.add(j12);
  
  JButton b1 = new JButton("Add");
  b1.setBounds(50,460,120,20);
  JButton b2 = new JButton("Display");
  b2.setBounds(190,460,120,20);

  JTextArea a1 = new JTextArea();  
  JScrollPane sc = new JScrollPane(a1);
  sc.setBounds(300,40,270,420);

  b1.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e1)
   { 
    try
    {
     String s1,s2,s3,s4,s5;
     s1=s2=s3=s4=s5=" ";
     
     if(f1.getText().equals(""))
     {throw new CourseCodeNotFoundException();}
	
     if(j1.isSelected())
     {s1="Yes";}
     else if(j2.isSelected())
     {s1="Not";}

     if(j3.isSelected())
     {s2="Yes";}
     else if(j4.isSelected())
     {s2="Not";}

     if(j5.isSelected())
     {s3="Good";}
     else if(j6.isSelected())
     {s3="Medium";}
     else if(j7.isSelected())
     {s3="Low";}

     if(j8.isSelected())
     {s4="Sufficient";}
     else if(j9.isSelected())
     {s4="Insufficient";}

     if(j10.isSelected())
     {s5="Tough";}
     else if(j11.isSelected())
     {s5="Normal";}
     else if(j12.isSelected())
     {s5="Easy";}
	
     String ss = "Course code: " + f1.getText() + " Name: " + f2.getText() + " Required data: " + s1 
     + " out of syllabus: " + s2 + " Standard: " + s3 + " time: " + s4 + " nature: " + s5;   
     ar.add(ss);
    }catch(CourseCodeNotFoundException e)
    {a1.setText("Course Code Missing");}
   }
  });
  b2.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e2)
   {
    Iterator itr = ar.iterator();
    String x = " ";
    while(itr.hasNext())
    {
     x = x + "\n"+itr.next();
    }
    a1.setText(x);
   }
  });
                t = new Thread(this);
  t.start();
  ll = new JLabel("FEEDBACK PORTAL");
  ll.setBounds(10,480,220,40);
  ll.setFont(new Font("Dialog",Font.BOLD,20));
  f.add(j1);f.add(j2);f.add(j3);f.add(j4);f.add(j5);f.add(j6);f.add(j7);
  f.add(j8);f.add(j9);f.add(j10);f.add(j11);f.add(j12);
  f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l6);f.add(l7);
  f.add(f1);f.add(f2);
  f.add(b1);f.add(b2);
  f.add(sc);
  f.add(ll);
  f.setVisible(true);
  f.setSize(600,600);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 public void run()
 { 
  try{
  int x = ll.getX();
  if(ll.getX()<380 && rl==1) 
  {
   ll.setBounds(x=x+10,480,220,20);
   t.sleep(50);
   if(ll.getX()==380)
   {rl=0;}
  }
  if(ll.getX()!=10 && rl==0)
  {
   ll.setBounds(x=x-10,480,220,20);
   t.sleep(50);
   if(ll.getX()==10)
   {rl=1;}
  }
  }catch(Exception e)
  {}
  run();
 }
 public static void main(String arg[])
 {
  new feedback();
 }
}