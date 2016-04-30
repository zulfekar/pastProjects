/**
 * Zulfekar
 *
 */
// Question 1
// Write a program that allows you to input a temperature in 
// degrees Celsius and output the
// corresponding value in Fahrenheit.


// F = ( 9/5 *C ) + 32 

import java.util.Scanner;

public class TemperatureDegreesCelsiusToFahrenheit 
{
	public static void main(String [] arg)
	{
		Scanner inputUser = new Scanner(System.in);
		
		System.out.print("Please Enter the Temperature in Degrees: ");
		
		double degreeEntered , answer;
		degreeEntered = inputUser.nextDouble();
		answer = ((9.0/5.0) * degreeEntered ) + 32 ;
		
		System.out.println("The Value in Fahrenheit is " + answer);
	
	}

}
