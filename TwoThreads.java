import java.util.*;
class TableThread extends Thread
{
  Scanner sc = new Scanner(System.in);
  int number;
  public void run()
  {
    System.out.print("Enter any number : ");
    number = sc.nextInt();
    for(int i=1;i<=10;i++)
      {
        try
        {

          System.out.println(number+" * "+i+" = "+(number*i));
          Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {}
      }
    } 
}
class CharacterThread extends Thread 
{
  Scanner sc = new Scanner(System.in);
  String s="";
  
  public void run()
  {
    System.out.print("Enter any string : ");
    s = sc.next();
    try
    {
      for(int i=0;i<s.length();i++)
      { 
        System.out.print(s.charAt(i));
        Thread.sleep(1000);
      }
    }
    catch(InterruptedException e)
    {}
  } 
}

class TwoThreads
{
  public static void main(String args[]) throws InterruptedException
  {
    TableThread tt = new TableThread();
    CharacterThread ct = new CharacterThread();
    tt.start();
    tt.join();
    ct.start();
    
  }
}