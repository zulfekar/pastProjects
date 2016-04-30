// Question 4

//   Write, compile, and test a program with methods which, when given an array of integers:
// • returns the biggest integer.
// • checks to see if a given integer is in the array.
// • turns the contents of the array into a string containing the integers separated by spaces.
// • returns an array with the elements in reverse order.
// • returns the average value of the integers.

import java.util.Scanner;
public class Arrays
{
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter an integer value for the size of the Array: ");
		int index = sc.nextInt(); 			// the length of value to be enter by user in array
	
		int [] arrayList = new int[index];	//create an arrayList with length index
		
		populateArrayList(arrayList); 		// to ask the user to enter value in the array
		
		int bigValue = biggestInteger(arrayList); // to call the method biggestInteger,also to find the 
		System.out.println("");//just to get an empty line					  // bigest value in the array
		System.out.println("The Biggest Value in the Array is: " + bigValue );	
		
		System.out.println("");
		checkedValue(arrayList);
		
		System.out.println("");
		arrayString(arrayList);
		
		System.out.println("");
		reversedArrayString(arrayList);
		
		System.out.println("");
		int average = averageArrayList(arrayList);
		System.out.println("The average of the array List in integer is: " + average );
	}
	
	
	

	// will know need to add the values in the array
	// to populate the array
	public static void populateArrayList(int []array)
	{
		for(int counter = 0; counter <array.length;counter++)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the Value in the array index[" +counter+ "]: ");
			array[counter] = sc.nextInt();

		}
		
	}
	
	//method to return the biggestInteger
	public static int biggestInteger(int array[])
	{
		int bigvalue = array[0];
		for(int counter =0; counter < array.length;counter++)
		{
			if (array[counter]>bigvalue)
			{
				bigvalue = array[counter];
			}
		}
		return bigvalue;
		
	}
	
	// to check if a given number is in the array
	public static void checkedValue(int array[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer value to be searched in the array: ");
		int value = sc.nextInt();
		boolean found = false;
		
		
		for (int counter =0; counter<array.length;counter++)
		{
			
			if (array[counter] == value)
			{
				
				found = true;
				break;
				
			}
		}
		if (found)
		{
			System.out.println("The value " + value + " is in the array list.");
		}
		if (!found)
		{
			System.out.println("The value " + value + " is NOT in the array list.");
		}
		
	}
	
	// turns the contents of the array into a string containing 
	// the integers separated by spaces.
	
	public static void arrayString(int [] array)
	{
		System.out.print("The array has value :" );// just printed once before looping
		for (int counter = 0;counter < array.length;counter++)
		{
			int tempValue = array[counter];
			System.out.print(tempValue + " ");
		}
		
	}
	
	
	public static void reversedArrayString(int array[])
	{
		int max = array.length;
		int arrayReverse[] = new int [array.length];
		
		System.out.print("The Reverse Array List is: ");
		for(int counter = 0;counter<array.length;counter++)
		{
			arrayReverse[counter]= array[max -1];
			max -= 1;
			int reverse =  arrayReverse[counter];
			System.out.print(reverse + " ");
		}
		
	}
	
	// • returns the average value of the integers.
	public static int averageArrayList(int array[])
	{
		int total = 0;
		for (int counter =0;counter<array.length;counter++)
		{
			total += array[counter];
			
		}
		return total/array.length;
	}
	
}
