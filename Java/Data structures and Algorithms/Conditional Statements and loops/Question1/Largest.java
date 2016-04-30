package Question1;
import java.util.*;

public class Largest {
	public static void main(String[] args){
	int num1,num2,num3,largest;
	
	Scanner sn=new Scanner(System.in);
	System.out.println("Enter number 1, 2 and 3: ");
	num1=sn.nextInt();
	num2=sn.nextInt();
	num3=sn.nextInt();
	
	largest=num1;
	
	if (num2>largest){
		largest=num2;
	}
	if (num3>largest){
		largest=num3;
	}
	
	System.out.println("Largest is: "+largest);
	}
}