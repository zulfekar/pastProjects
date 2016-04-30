package Question3;
import java.util.*;
public class OperationalResults {
	public static void main(String[] args){
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter Grade: ");
		double grade=sn.nextDouble();
		
		System.out.println((grade>4)?"Great!!":(grade>3 && grade<=4)?"Good!!":(grade>=2 && grade<=3)?"Average!!":"Work Harder");
		

	}	
}
