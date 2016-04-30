// Question 1
// Write, compile, and test a Java program that declares variables to represent 
// the length and width of a room in feet, and the price of carpeting per square foot in dollar. 
// Use Carpet as the class name. Assign appropriate values to the variables. 
// Compute and display, with explanatory text, the cost of carpeting the room. 
// Save the program as Carpet.java.

public class Carpet 
{
	public static void main (String [] args)
	
	{
		int lenghtRoom = 15 , widthRoom = 25 , costCarpet = 5 , carpetLenght = 8 , carpetWidth = 8;
		
		double costCarpeting , theAreaRoom, theAreaCarpet;
		
		
		theAreaRoom = lenghtRoom * widthRoom;
		
		theAreaCarpet = carpetLenght * carpetWidth ;
		
		 costCarpeting = (theAreaRoom / theAreaCarpet)* costCarpet;
		 
		 System.out.println("The cost for carpeting the room is " + costCarpeting);

		 
	}

}
