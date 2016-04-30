
//Question 7 
//Write a program that accepts two positive integer 
//values x and n, and uses a function to 
//calculate the value of x raised to the power n. 
//The result should be returned to the main function
//and displayed./*

import java.util.Scanner;

public class PowerWithFunction 
{

	public static void main (String[] args)

	{
		Scanner value = new Scanner(System.in);
		
		System.out.print("Enter value of x: ");
		int x = value.nextInt();
		
		System.out.print("Enter value of n: ");
		int n = value.nextInt();
		
		int numbers = power(x,n);
		
		System.out.println("x raised to the power n is: " + numbers);
	}
	

	public static int power(int value1 , int value2)
	{
		int sum = 1;
		for(int counter = 1 ; counter <= value2; counter++)
		{
			sum = sum * value1;
			
		}
		return sum;
	
	}
}