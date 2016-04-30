package Question6;
import java.util.Scanner;
public class NameSimilarity {

	public static void main(String[] args) {
		Scanner scan1=new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String yourname=scan1.next();
		System.out.print("Please enter the first names of your friends: ");
		
		Scanner scan2=new Scanner(System.in);
		String friends = scan2.nextLine();
		
		int similar=0;
		Scanner scan3=new Scanner(friends);
		while(scan3.hasNext()){
			String hisname=scan3.next();
			if(yourname.equals(hisname))
				similar++;
		}
		
		if(similar>0){
			System.out.print("You have "+similar+" friends in your class having the same first name as yours.");
		}
		else{
			System.out.println("No one has the same name as you in your class.");
		}
	}
}

