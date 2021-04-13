import java.awt.event.*;
import javax.SuppressWarnings.*;
class Dava extends JFrame 
{
	JLabel l1,l2;
	JTextField t1;
	JButton b1,b2;
	Dava()
	{  
	 JFrame f1= new JFrame("factorial");
		l1=new JLabel("enter the number ");
		l2=new JLabel("RESULT");
		t1= new JTextField();
		b1=new JButton("factorial");
		b2= new JButton("clear");
		l1.setBounds(100,100,50,40);
		t1.setBounds(160,100,50,40);
		l2.setBounds(160,150,50,40);
		b1.setBounds(160,200,50,40);
		b2.setBounds(160,250,50,40);
        f1.add(l1);f1.add(l2);f1.add(t1);f1.add(b1);f1.add(b2);
        f1.setSize(400,400);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
      public static void main(String args[])
      {
      	Dava d=new Dava();
      }

}