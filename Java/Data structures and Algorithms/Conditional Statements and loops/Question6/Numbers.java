package Question6;
import java.util.*;
public class Numbers {
	public static void convertNumber(int number){
		int number2=number%10;
		int number1=number/10;
		
		if(number1==1){
			switch(number1){
			case 1:
				System.out.print("Eleven");
				break;
			case 2:
				System.out.print("Twelve");
				break;
			case 3:			
				System.out.print("Thirteen");
				break;
			case 4:
				System.out.print("Fourteen");
				break;
			case 5:
				System.out.print("Fiftenn");
				break;
			case 6:
				System.out.print("Sixteen");
				break;
			case 7:
				System.out.print("Seventeen");
				break;
			case 8:
				System.out.print("Eighteen");
				break;
			case 9:
				System.out.print("Nineteen");
				break;
			}
		}
		else if(number1!=1){
			switch(number1){
			case 2:
				System.out.print("Twenty-");
				break;
			case 3:
				System.out.print("Thirty-");
				break;
			case 4:
				System.out.print("Forty-");
				break;
			case 5:
				System.out.print("Fifty-");
				break;
			case 6:
				System.out.print("Sixty-");
				break;
			case 7:
				System.out.print("Seventy-");
				break;
			case 8:
				System.out.print("Eighty-");
				break;
			case 9:
				System.out.print("Ninety-");
				break;
			case 0:
				System.out.print("");
				break;
			default:
				System.out.print("Error");
			}
			
			switch(number2){
			case 1:
				System.out.print("One");
				break;
			case 2:
				System.out.print("Two");
				break;
			case 3:
				System.out.print("Three");
				break;
			case 4:
				System.out.print("Four");
				break;
			case 5:
				System.out.print("Five");
				break;
			case 6:
				System.out.print("Six");
				break;
			case 7:
				System.out.print("Seven");
				break;
			case 8:
				System.out.print("Eight");
				break;
			case 9:
				System.out.print("Nine");
				break;
			case 0:
				System.out.print("");
				break;
			default:
				System.out.print("Error");
			}
		}
	}
		
	
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int number=sn.nextInt();
		convertNumber(number);
	}

}
