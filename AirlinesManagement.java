import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Airlines 
{
 String Passenger_Name, Source, Destination;
 int Passenger_ID;
 int Flight_Number;
 Airlines(){}
 Airlines(String p, int id, int fi, String s, String d)
 {
  Passenger_Name=p;
  Passenger_ID=id;
  Flight_Number=fi;
  Source=s;
  Destination=d;
 }
 public int getpid()
 {
  return Passenger_ID;
 }
  
};
class PassengerNotFoundException extends Exception
{
	private static final long serialVersionUID = 1L;

PassengerNotFoundException()
 {
  super("Passenger not found");
 }
};
class NameCompare implements Comparator<Airlines>
{
 public int compare(Airlines a, Airlines b)
 {
  return a.Passenger_Name.compareTo(b.Passenger_Name);
 }
};
class AirlinesManagement
{
 ArrayList<Airlines> alm = new ArrayList<Airlines>();
	
 void AddPassenger(Airlines a)
 {
  alm.add(a);
 }
 Airlines SearchPassenger(int pid) throws PassengerNotFoundException
 { 
	
  Iterator itr = alm.iterator();
  while(itr.hasNext())
  {
   Airlines x = (Airlines)itr.next();
   if(x.Passenger_ID==pid)
   {return x;}
   else if(itr.hasNext()==false)
   {throw new PassengerNotFoundException();}
  }
  return null;
 }
 ArrayList<Airlines> DisplayPassenger()
 {
  ArrayList<Airlines> a1= new ArrayList<Airlines>(alm);
  Collections.sort(a1,new NameCompare());
  return a1;
 }
 AirlinesManagement()
 {
  JFrame f = new JFrame("Airlines");
  f.setLayout(null);
  JLabel l1 = new JLabel("Passenger name:");
  l1.setBounds(50,50,150,30);
  JLabel l2 = new JLabel("Passenger id:");
  l2.setBounds(50,100,150,30);
  JLabel l3 = new JLabel("Passenger Flight no:");
  l3.setBounds(50,150,150,30);
  JLabel l4 = new JLabel("Passenger source:");
  l4.setBounds(50,200,150,30);
  JLabel l5 = new JLabel("Passenger destination:");
  l5.setBounds(50,250,150,30);

  JButton b1 = new JButton("Add Passenger");
  b1.setBounds(100,300,180,30);

  JButton b2 = new JButton("Search Passenger");
  b2.setBounds(100,400,180,30);
  JButton b3 = new JButton("Display Passenger");
  b3.setBounds(300,300,180,30);
  JLabel l6 = new JLabel("Enter Passenger ID to Search:");
  l6.setBounds(50,350,200,30);

  JTextField f1 = new JTextField();
  f1.setBounds(185,50,100,30); 
  JTextField f2 = new JTextField();
  f2.setBounds(185,100,100,30);
  final JTextField f3 = new JTextField();
  f3.setBounds(185,150,100,30);
  final JTextField f4 = new JTextField();
  f4.setBounds(185,200,100,30);
  final JTextField f5 = new JTextField();
  f5.setBounds(185,250,100,30);
  final JTextField f6 = new JTextField();
  f6.setBounds(230,350,100,30);
  
  JTextArea a1 = new JTextArea(20,20);
  

  JScrollPane sc1 = new JScrollPane(a1);
  sc1.setBounds(300,100,200,180);
  
  f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);
  f.add(f1);f.add(f2);f.add(f3);f.add(f4);f.add(f5);
  f.add(b1);f.add(l6);f.add(f6);f.add(b2);
  f.add(b3);f.add(sc1);
  b1.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e1)
   {
    String a = f1.getText();
    int b = Integer.parseInt(f2.getText());
    int c = Integer.parseInt(f3.getText());
    String d = f4.getText();
    String e = f5.getText();
    Airlines x1 = new Airlines(a,b,c,d,e);
    AddPassenger(x1);
   }
  });
  b2.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e1)
   {
    try
    {
     String x = f6.getText();
     Airlines aa = SearchPassenger(Integer.parseInt(x));
     String s1 = "\nPassenger Name:"+aa.Passenger_Name+" Passenger ID: "+aa.Passenger_ID+" Flight no: "+aa.Flight_Number+" Source: "+aa.Source+" Destination: "+aa.Destination;
     a1.setText(s1);
    }catch(PassengerNotFoundException e)
    {
     a1.setText("passenger not found");
    }
   }
  });
  b3.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e1)
   {
    ArrayList<Airlines> x2 = DisplayPassenger();
    String a = " ";
    Iterator itr = x2.iterator();
    while(itr.hasNext())
    {
     Airlines x = (Airlines)itr.next();
     a = a+"\nPassenger Name:"+x.Passenger_Name+" Passenger ID: "+x.Passenger_ID+" Flight no: "+x.Flight_Number+" Source: "+x.Source+" Destination: "+x.Destination;
    } 
    a1.setText(a);
   }
  });
    
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  f.setSize(600,600);
  f.setVisible(true);


  
 }
 public static void main(String arg[])
 { new AirlinesManagement();}
}