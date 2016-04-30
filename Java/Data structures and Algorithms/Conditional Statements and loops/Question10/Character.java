package Question10;
import java.util.*;
public class Character {
	public static void smallestCharacter(String input){
		int smallest;
		char chosen=input.charAt(0);
		smallest=(int)input.charAt(0);
		
		for(int i=1;i<input.length();i++){
			int ch=(int)input.charAt(i);
			if (ch<=smallest){
				chosen=input.charAt(i);
			}
		}
		System.out.println("Smallest character: "+chosen);
		
	}

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Input a string (low case): ");
		String input=sn.next();
		smallestCharacter(input);

	}

}
