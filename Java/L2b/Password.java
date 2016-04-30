// Question 2


// Write, compile, and test a program that prompts the user for a four-character password, 
// accepts four characters, and then echoes the characters to the screen. 
// Test all four characters. If the characters spell B O L T, 
// then issue a message that the password is valid; 
// otherwise issue a message that the password is not valid. 
// The class name is Password.

import java.util.Scanner;
public class Password 
{
	
	static String password;
	
	public static void main(String [] args)
	{
		
		Scanner text = new Scanner(System.in);
		System.out.print("Enter four-character password: ");
		password = text.nextLine();
		
		while(password.length() > 4)
		{
			System.out.println("Enter four-character password: ");
			password = text.nextLine();
			 
		}
		
		if (password.equals("BOLT"))
		{
			System.out.println("Password valid");
		
		}
			
			
		else
		{
				System.out.println("Password Invalid");
		}
		
		
	}
		
	
		
}
		

	
	

