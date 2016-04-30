// Question 3

// In Wonderland a man distribute his monthly salary among his family as follows:
// • Half the salary goes on general expenditure in the house
// • one third of the remainder is spent on his car
// • Out of the rest, one third is saved while the remaining part 
// is shared among members of the family so that parents get twice as much as the children.
// Write a program that allows you to input the salary of a person 
// and the number of children he has and output the pocket money obtained 
// by one of the parents and one child.

import java.util.Scanner;

public class Salary 
{
	public static void main(String [] args)
	{
		
		double totalAmount ,numberOfChildren, halfAmount, expenditure , car , 
		outOfTheRest, saved, remaining,oneParent,oneChildren;
		
		
		Scanner value = new Scanner(System.in);
		
		System.out.print("Please enter the Salary you earned monthly: ");
		totalAmount = value.nextDouble();
		
		
		System.out.print("Please enter the number od Children you have: ");
		numberOfChildren = value.nextDouble();
		
		
		expenditure = 1.0/2.0 * totalAmount;
		halfAmount = totalAmount - expenditure;
		
		car = 1.0/3.0 * (halfAmount);
		 
		outOfTheRest = halfAmount - car;
		
		saved = 1.0/3.0 * outOfTheRest;
		
		remaining = outOfTheRest - saved;
		
		// ratio 1:1:1 one parent : oneparent : 
		oneParent = remaining/ 3.0;
		oneChildren = oneParent / numberOfChildren;
		
		System.out.println("The amount that ONE PARENT will have is: " + oneParent);
		System.out.println("The amount that ONE CHILDREN will have is: " + oneChildren);
		
	
	}
	
	

}
