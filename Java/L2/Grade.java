// Question 4

// The Department of Computer Science requires a program 
// for the conversion of exam marks to grades. Write a program 
// that will ask the user for his/mark for a subject and display the corresponding grade.


import java.util.Scanner;

public class Grade 
{
	public static void main(String [] args)
	{
		Scanner marks = new Scanner(System.in);
		
		double studentMark;
	
		
		
		System.out.print("Please enter the mark of a particular Subjects:");
		studentMark = marks.nextDouble();
		
		if (studentMark >=0 && studentMark <40)
		{
			System.out.println("Your Grade is: F");
		}
		
		else if (studentMark >=40 && studentMark <50)
		{
			System.out.println("Your Grade is: E");
		}
		
		else if (studentMark >=50 && studentMark <60)
		{
			System.out.println("Your Grade is: D");
		}
		
		else if (studentMark >=60 && studentMark <70)
		{
			System.out.println("Your Grade is: C");
		}
		
		else if (studentMark >=70 && studentMark <80)
		{
			System.out.println("Your Grade is: B");
		}
		
		else if (studentMark >=80 && studentMark <90)
		{
			System.out.println("Your Grade is: A");
		}
		
		else if (studentMark >=90 && studentMark <=100)
		{
			System.out.println("Your Grade is: A+");
		}
		
		else	
		{
			System.out.println("Please Enter a VALID number from 0 to 100");
		}
		

		
	}


}
