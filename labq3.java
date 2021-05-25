import java.util.*;

class Methods extends Thread
{
    String name;
    Methods(String name)
    {
        this.name=name;
    }
    
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try{
                System.out.println(name+"'s "+Thread.currentThread().getName()); 
                sleep(100);
            }catch(InterruptedException e){System.out.println(e);}   
        }
    }
}

class labq3
{
    public static void main (String[] args) {
        Scanner bh=new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String str=bh.nextLine();
        Methods t1=new Methods(str);
        Methods t2=new Methods(str);
        System.out.println("Thread1 priority : " + t1.getPriority());   
        System.out.println("Thread2 priority : " + t2.getPriority());
        t1.start();
        try{
            t1.join();
        }catch(Exception e){}
        t2.start();
    }
}