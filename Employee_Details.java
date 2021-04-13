import java.util.*;
class Employee
{
  public float basic_pay,gross_pay,house_Rent,Prov_Fund,Net_Pay,dear_Allowance;
  Scanner s = new Scanner(System.in);
    
  
  void calcGross()
  {
    System.out.println("Enter employee basic pay : ");
    basic_pay = s.nextFloat();
    dear_Allowance = (21 * basic_pay)/100;
    house_Rent = (12 * basic_pay)/100;
    Prov_Fund = ((float)6.45 * basic_pay)/100;
    Net_Pay = basic_pay + dear_Allowance + house_Rent;
    gross_pay = Net_Pay - Prov_Fund;
    System.out.println("Employee gross pay is : "+gross_pay);
  }
}
class Employee_Details
{
  public static void main(String [] args)
  {
    Employee empOBJ = new Employee();
    empOBJ.calcGross();

  }
}