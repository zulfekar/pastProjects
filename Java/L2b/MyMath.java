// Question 5
// a) Define a class called MyMath. Include a doubled-typed constant called PI 
// that has a value of 3.14. Ensure that this member can be accessed without 
// instantiating an object.

// b) Include a method in the MyMath class called square that takes 
// in an integer argument and returns the square of the argument. 
// Ensure that this method can be called without instantiating an object.

// c) Include another method called divide that takes in two integer 
// parameters and divides the first number by the second number and 
// returns the quotient. Note: You may not use the / and the % operators. 
// Again, ensure that this method can be called without instantiating an object.

// d) Include a recursive routine called factorial that takes in one 
// integer argument and returns the factorial of that number.

public class MyMath  
{
	static final double  PI = 3.14; 
	//use static so that it can be accessed without instantiating an object.
	// PI capital letters Convention for Constant
	
	public static int square(int x)
	{
		int sqrt = x*x;
		return sqrt;
		
	}
	
	public static int divide(int fNum, int sNum)
	{
		int total = fNum;
		int diviser = 0;
		
		while (sNum<=total)
		{
			total = total - sNum;
			diviser++;
		}

		return (diviser); 
	}
	
	public static int factorial(int x)
	{
		if (x == 0)
		{
			return 1;
		}
		else if(x<0)
			return -1;
		
		else
		{
			return x * factorial(x-1);
		}
	}
		
}
