// Question 7 

// Write a program that accepts two positive integer values x and n, 
// and uses a function to calculate the value of x raised to the power n.
// The result should be returned to the main function and displayed.

import java.util.Scanner;

public class Power 
{
	public static void main(String [] args)
	{
		Scanner values = new Scanner(System.in);
		
		int firstNum,secondNum,answer;
		
		
		System.out.print("Enter the first integer value X:");
		firstNum = values.nextInt();
		
		System.out.print("Enter the second integer value N:");
		secondNum = values.nextInt();
		
		
		answer = (int) Math.pow(firstNum, secondNum);
		
		System.out.println("The value of x raised to the power n is:" + answer);
		
		
	}
	
}
