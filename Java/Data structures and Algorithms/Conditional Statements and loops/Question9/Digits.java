package Question9;
import java.util.*;
public class Digits {
	public static void howManyDigits(String input){
		int count=0;
		for(int i=0;i<input.length();i++){
			char x=input.charAt(i);
			switch(x){
			case '1':
				count++;
				break;
			case '2':
				count++;
				break;
			case '3':
				count++;
				break;
			case '4':
				count++;
				break;
			case '5':
				count++;
				break;
			case '6':
				count++;
				break;
			case '7':
				count++;
				break;
			case '8':
				count++;
				break;
			case '9':
				count++;
				break;
			default:
				break;	
			}
		}
		System.out.println("Number of digits in "+input+" is "+count);
	}
	
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String z=sn.next();
		howManyDigits(z);
	}
}
