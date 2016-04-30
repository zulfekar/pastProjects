// Question 8

// Write a program that accepts a positive integer. 
// Use a function to calculate the factorial of that number. 
// The value should be returned to the main function and displayed on the screen.

import java.util.Scanner;
public class Factorial 
{
	public static void main(String [] args)
	
	{
		Scanner value = new Scanner(System.in);
		
		System.out.print("Enter an integer value: ");
		int n = value.nextInt();
	
		Factorial FactorialObject = new Factorial();
		long c = FactorialObject.Factorial2(n);
		
		System.out.println("The Factorial of the number enterd is: " + c);
		
	}
	
	public long Factorial2(long n)
	
	{
		long sum = 1L;
		for (long counter = 1L ; counter <= n ; counter++)
		{
			sum = sum * counter;
		}
		
		return sum;
	}
	

}
