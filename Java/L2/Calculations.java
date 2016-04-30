// Question 6

// Write a program that allows the input of an integer value n and 
// displays all multiples of 3 which are less than or equal to n, 
// as well as the sum of the square of these values.


import java.util.Scanner;
public class Calculations 
{
	public static void main(String [] args)
	{
		Scanner value = new Scanner(System.in);
		System.out.print("Enter the integer value n :");
		
		int n;
		n = value.nextInt();
		int sum = 0, power;	
		
		for (int counter = 3; counter <= n; counter+=3)
		{
			System.out.println(counter);
			power = (int) Math.pow(counter, 2);
			
			sum = sum + power;
		}
		System.out.println("The sum of the square of these values is: " + sum);
		
	}

}
