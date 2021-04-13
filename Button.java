import javax.swing.*;
public class Button
{

public static void main(String Args[])

{
JFrame F1 = new JFrame("this is my first GUI");
JButton B1= new JButton ("click me");
JTextField T1=new JTextField();
T1.setBounds(150,150,150,150);
B1.setBounds(100,50,70,30);
F1.add(B1);
F1.add(T1); 
F1.setSize(230,320);
F1.setVisible(true);
//F1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}
