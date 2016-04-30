/**
 * Zulfekar
 * 
 */

package File;

import java.io.*;
import java.util.*;

public class InputText 
{

	private static Scanner outfile;
	private static Formatter infile;
	
	static String fname;
	static String lname;
	static String gender;
	static float cpa;
	static String dummy = "";
	
	public static void main(String[] args)
	{
		try
		{
		
			outfile = new Scanner (new File("C:/Users/Z/Desktop/zText.txt"));
		}
		catch (FileNotFoundException fnfe)
		{
			System.out.println("File does not exist!");
			System.exit(1);
		}
		
		try
		{
			infile = new Formatter("C:/Users/Z/Desktop/zText2.txt");
		}
		catch (FileNotFoundException fnfe)
		{
			System.out.println("File does not exists and cannot be created!");
			System.exit(1);
		}
		catch (SecurityException se)
		{
			System.out.println("You do not have permission to access this file!");
			System.exit(1);
		}
		
		while (outfile.hasNext())
		{
			fname = outfile.next();
			lname = outfile.next();
			gender = outfile.next();
			cpa = outfile.nextFloat();
			dummy = outfile.nextLine();
			
			infile.format("%s %s %s %.2f %n", fname, lname, gender, cpa, dummy);
		}
		
		infile.close();
		System.out.println("Success! :-)");

	}
}
