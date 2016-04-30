//Question 3

//Write, compile, and test a program that stores two integers 
//and allow the user to enter a character.
//If the character is A, add the two integers. 
//If it is S, subtract the second integer from the first; 
//if it is M, multiply the integers. Display the results of the arithmetic. 
//The class name is Calculate.

import java.util.Scanner;

public class CalculaterWithChar 
{
	static Scanner value;
	static int firstInteger;
	static int SecongInteger;
	
	
	public static void main(String [] args)
	{
		
		char[] character;
		try
		{
			Scanner value = new Scanner(System.in);
			
			System.out.print("Enter the first integer: ");
			firstInteger = value.nextInt();

			System.out.print("Enter the first integer: ");
			SecongInteger = value.nextInt();

			System.out.print("Enter a character A or S or M: ");
			character = value.next().toCharArray();
			
			if (character[0] == 'A')
			{
				int answer = firstInteger + SecongInteger;
				System.out.println("The Multiplication is: "+ firstInteger + " + " + SecongInteger +" = " + answer);
			}
			
			else if (character[0] == 'S')
			{
				int answer = SecongInteger - firstInteger;
				System.out.println("The Multiplication is: "+ SecongInteger + " - " + firstInteger +" = " + answer);
			}
			
			else if((character[0] == 'M'))
			{
				int answer = firstInteger * SecongInteger;
				System.out.println("The Multiplication is: "+ firstInteger + " x " + SecongInteger +" = " + answer);
			}

			else
			{
				System.out.println("Enter A valid Choise: A or S or  M !!!");
			}
		}
		catch (java.util.InputMismatchException e)
		{
			System.out.println("Enter a valid Input");
		}
			
	}
	
		
			
		
}


