import javax.swing.*;
import java.awt.event.*;
public class Testing extends JFrame implements ActionListener
//public class Practice
{            

	 JTextField T1,T2,T3;
	 JButton B1,B2,B3,B4,B5;
	 JFrame F1;
	           Testing()
	             {
		       					F1 = new JFrame("this is my first GUI");               
		                      JButton B1= new JButton ("ADD");
		                      JButton B2= new JButton ("SUBTRACT");
		                      JButton B3= new JButton ("MULTIPLY");
		                      JButton B4= new JButton ("DIVIDE");
		                      JButton B5= new JButton ("clear");
		                      
		                            T1=new JTextField();
		                            T2=new JTextField();
		                            T3=new JTextField();
		                      B1.setBounds(10,10,100,30);
		                      B2.setBounds(10,50,100,40);
		                      B3.setBounds(10,100,100,30);
		                      B4.setBounds(10,150,100,40);
		                      B5.setBounds(10,200,100,40);
		                      T1.setBounds(10,250,50,30);
		                      T2.setBounds(10,300,50,30);
		                      T3.setBounds(100,250,50,30);
		                      
		                      F1.setSize(500,500);
		                      
		                      
		                      F1.add(B1);
		                      F1.add(B2);
		                      F1.add(B3);
		                      F1.add(B4);
		                      F1.add(B5);
		                      F1.add(T1);
		                      F1.add(T2);
		                      F1.add(T3);
		                      B1.addActionListener(this);
		                      B2.addActionListener(this);
		                     B3.addActionListener(this);
		                      B4.addActionListener(this);
		                      B5.addActionListener(this);
		                      F1.setLayout(null);
		                      F1.setVisible(true);
		                      F1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                      
		          }
			public void actionPerformed(ActionEvent e)
			{
				String str= e.getActionCommand();
				if (str.equals("ADD"))
				{
				int a =Integer.parseInt(T1.getText());
				int b=Integer.parseInt(T2.getText());
				int c=a+b;
				T3.setText(String.valueOf(c));
               //  T3.setText(String.valueOf(Integer.parseInt(T1.getText())+Integer.parseInt(T1.getText())));
				}
		       
               else if(str.equals("SUBTRACT"))
	           {
	                int a =Integer.parseInt(T1.getText());

	                int b=Integer.parseInt(T2.getText());
	                int c=a-b;
	                T3.setText(String.valueOf(c));
	            }

               else if(str.equals("MULTIPLY"))
            	{
		              int a =Integer.parseInt(T1.getText());

		              int b=Integer.parseInt(T2.getText());
		            	int c=a+b;
		            	T3.setText(String.valueOf(c));

              }

            else if(str.equals("DIVIDE"))
            {

               int a =Integer.parseInt(T1.getText());

            	int b=Integer.parseInt(T2.getText());
           		int c=a+b;
             	T3.setText(String.valueOf(c));
              }
             
	}
	public static void main(String Args[])
	{
		Testing T=new Testing();
	}
}