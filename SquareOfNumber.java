// Java Program to Find Square of a Number
import java.util.Scanner;

class SquareofNumber 
{
	
	public static void main(String[] args) 
	{
		int number, square;
		Scanner sc=new Scanner(System.in);
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();		
		
		square = number * number;
		
		System.out.println("\n The Square of a Given Number  " + number + "  =  " + square);
	}
}