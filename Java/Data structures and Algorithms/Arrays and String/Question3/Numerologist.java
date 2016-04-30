package Question3;
import java.util.*;
import java.lang.Character;

public class Numerologist {
	public static int personCharacter(String x){
		int sum=0;
		
		for(int i=0;i<x.length();i++){
			char current=x.charAt(i);
			sum+=(Character.getNumericValue(current))-9;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String input=sn.next();
		System.out.print("The numeric value of your name is: "+personCharacter(input));
	}
}
