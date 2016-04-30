// Question 9


// Write a program that allows the entry of an integer value n, 
// followed by two sets of n integer values into arrays A and B. 
// The program should use a function to calculate the sum of 
// the square of corresponding values of A and B. 
// These values should then be displayed.
//

import java.util.Scanner;
public class Arrays 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter index for arrays: ");
		int index = sc.nextInt();
	
		int arrayA[] = new int[index];
		int arrayB[] = new int[index];
		
		populateArray(arrayA,"A");
		populateArray(arrayB, "B");
		
		sumSquareOfArrays(arrayA,"A");
		sumSquareOfArrays(arrayB, "B");
		
	}

/*******************************************************
	// instead i do this!!! all i need to do is enter two parameter (arrayA,"A")and (arrayB, "B")
   // and then create a method populateArray(int array[],String name)
    
    
	public static void populateArrayA(int [] array)
	{
		Scanner sc = new Scanner(System.in);
		for (int counter = 0; counter <array.length; counter++)	
		{
			
			System.out.print("Enter the value in arrayA["+counter+"]:");
			array[counter] = sc.nextInt();
			
		}
	}
	
	public static void populateArrayB(int [] array)
	{
		Scanner sc = new Scanner(System.in);
		for (int counter = 0; counter <array.length; counter++)
		{
			
			System.out.print("Enter the value in arrayB["+counter+"]:");
			array[counter] = sc.nextInt();
			
		}
	
*************************************************************/
	// here i populate the array of A and B
	public static void populateArray(int array[],String name)
	{
		Scanner sc = new Scanner(System.in);
		for (int counter = 0; counter <array.length; counter++)	
		{
			
			System.out.print("Enter the value in array"+name+"["+counter+"]:");
			array[counter] = sc.nextInt();
			
		}
		
	}
	
	public static void sumSquareOfArrays(int array[], String name)
	{
		int total = 0;
		for (int counter = 0 ; counter <array.length; counter++)
		{
			total = total + (array[counter] * array[counter]);
		}
		System.out.println("The Sum Square of the array" + name + " List is: "+total);
	}
	
	
}
