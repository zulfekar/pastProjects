/**
 * Zulfekar
 */

// Question 2
// Write a program to read an amount of currency in dollars and 
// the exchange rate of dollars (in Rupees). 
// The program should output the corresponding amount in rupees.

// 1 USD = RS 45.31 

import java.util.Scanner;
public class Convertion 
{
	public static void main (String [] args)
	{
		Scanner inputUser = new Scanner(System.in);
		
		double dollar , rupee;
		System.out.print("Enter the value in Dollar: ");
		dollar = inputUser.nextDouble();
		
		
		rupee = dollar * 45.31;
		
		System.out.println("The amount in Rupess is Rs" + rupee );
		
	}
	

}
