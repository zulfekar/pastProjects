package Question1;
import java.util.*;

public class Smallest {

	public static void main(String[] args){
	int num1,num2,num3,smallest;
	
	Scanner sn=new Scanner(System.in);
	System.out.println("Enter number 1, 2 and 3: ");
	num1=sn.nextInt();
	num2=sn.nextInt();
	num3=sn.nextInt();
	
	smallest=num1;
	
	if (num2<smallest){
		smallest=num2;
	}
	if (num3<smallest){
		smallest=num3;
	}
	
	System.out.println("Largest is: "+smallest);
	}
}