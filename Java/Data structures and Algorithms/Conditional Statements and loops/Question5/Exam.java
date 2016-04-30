package Question5;
import java.util.*;
public class Exam {
	int marks;
	
	public void calculateGrade(int marks){
		marks=marks/10;
		switch(marks){
		case 9:
			System.out.println("Letter Grade: A");
			break;
		case 8:
			System.out.println("Letter Grade: B");
			break;
		case 7:
			System.out.println("Letter Grade: C");
			break;
		case 6:
			System.out.println("Letter Grade: D");
			break;
		case 5:
			System.out.println("Letter Grade: E");
			break;
		default:
			System.out.println("Error");
		}
	}
		
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter Numerical Grade: ");
		int marks=sn.nextInt();
		Exam e=new Exam();
		e.calculateGrade(marks);

	}

}
