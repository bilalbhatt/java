class Series
{
  public static void main(String args[])
  {
    float sum,a,b;
    int i;
    sum = 0;
    a = 1;
    b = 1;
    while(b<=20)
    {
        sum = sum + (a/b);
        b++;
    }
    System.out.print("\nSum of 1/1 + 1/2 + 1/3 + 1/4 + 1/5 + .................... + 1/20  is : "+sum+"\n\n");
  }  
}