package Question2;
import java.util.*;
public class Acronym {
	public static void main(String[] args) {
		String phrase;
		String acronym = "";
		
		Scanner sn=new Scanner(System.in);
		System.out.print("Please enter a phrase: ");
		phrase=sn.nextLine();
		
		Scanner scan=new Scanner(phrase);
		
		while(scan.hasNext()){
			String txt=scan.next();
			acronym += (txt.charAt(0));	
		}
		System.out.println(acronym.toUpperCase());
	}
}
