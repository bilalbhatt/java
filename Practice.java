import javax.swing.*;
import java.awt.event.*;
class Testing extends JFrame implements ActionListener
//public class Practice
{

	Testing

	{
		JFrame F1 = new JFrame("this is my first GUI");
		JButton B1= new JButton ("ADD");
		JButton B2= new JButton ("SUBTRACT");
		JButton B3= new JButton ("clear");
		
		JTextField T1=new JTextField();
		JTextField T2=new JTextField();
		JTextField T3=new JTextField();
		B1.setBounds(10,10,100,30);
		B3.setBounds(10,120,100,30);
		T1.setBounds(10,150,200,30);
		T2.setBounds(10,200,200,30);
		T3.setBounds(10,250,200,30);
		B2.setBounds(10,70,100,40);
		F1.setSize(500,500);
		
		F1.setLayout(null);
		F1.setVisible(true);
		F1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		F1.add(B1);
		F1.add(B2);
		F1.add(B3);
		F1.add(T1);
		F1.add(T2);
		F1.add(T3);
		B1.addActionListener(this();
			

		}
			public void actionPerformed(ActionEvent e)
			{
				int a =Integer.parseInt(T1.getText());

				int b=Integer.parseInt(T2.getText());
				int c=a+b;
				T3.setText(String.valueOf (c));
			}
		
		                     );
		
	
	
	
		
	

}
public static void main(String Args[])
{
	Testing T=new Testing();
}