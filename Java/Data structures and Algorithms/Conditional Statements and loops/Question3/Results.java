package Question3;
import java.util.*;
public class Results {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter Grade: ");
		double grade=sn.nextDouble();
		
		if(grade>4)
			System.out.println("Great!!");
		else if(grade>3 && grade<=4)
			System.out.println("Good!!");
		else if(grade>=2 && grade<=3)
			System.out.println("Average!!");
		else if(grade<2)
			System.out.println("Work Harder!!");
}
}