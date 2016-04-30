package Question5;
import java.util.Scanner;
public class Username {

	public static void main(String[] args) {
		String login="";
		Scanner sn=new Scanner(System.in);
		System.out.print("Please enter your first name followed by last name: ");
		String first=sn.next();
		String last=sn.next();
		String f,l="";
		f=first.substring(0,1);
		if(last.length()<=7){
			l=last;
		}
		else{
			l=last.substring(0,7);
		}
		login=(f+l).toLowerCase();
		System.out.print("Your username is: "+login+".");
	}
}


