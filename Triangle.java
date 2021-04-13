import java.util.*;
class Triangle
{
  int SideA,SideB,SideC;
  Scanner sOBJ = new Scanner(System.in);
  void TypeOfTriangle()
  {
    System.out.print("Enter three sides of a triangle : ");
    SideA = sOBJ.nextInt();
    SideB = sOBJ.nextInt();
    SideC = sOBJ.nextInt();
    
    if(((SideA + SideB) > SideC) || ((SideA + SideC) > SideB) || ((SideB + SideC) > SideA))
    {  
      System.out.println("Acc. to given 3 sides, Triangle is Valid");
      if(((SideA*SideA)+(SideB*SideB)) == (SideC*SideC) || ((SideB*SideB) + (SideC*SideC)) == (SideA*SideA) || ((SideA*SideA) + (SideC*SideC))== (SideB*SideB))
        System.out.println("And this is a Right Angle Triangle");
      else if((SideA*SideA) > ((SideB*SideB) + (SideC*SideC)) || (SideB*SideB) > ((SideA*SideA) + (SideC*SideC)) || (SideC*SideC) > ((SideA*SideA) + (SideB*SideB)))
        System.out.println("And this is an Obtuse Angle Triangle");
      else
        System.out.println("And this is an Acute Angle Triangle");
    }
    else
      System.out.println("Acc. to given 3 sides,Triangle is not Valid");
    
  }  
  public static void main(String args[])
  {
    Triangle Tobj = new Triangle();
    Tobj.TypeOfTriangle();
  }
}