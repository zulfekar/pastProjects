package Question7;
import java.util.Scanner;
public class BIFF2 {

	public static String capitalizeString(String x){
		Scanner scan=new Scanner(x);
		String finalWord="";
		while(scan.hasNext()){
			String word=scan.next();
			String capital=word.substring(0,1);
			finalWord=finalWord+" "+capital.toUpperCase()+word.substring(1,word.length());
		}	
		return finalWord;
	}
	
	public static void main(String[] args) {
		Scanner scan1=new Scanner(System.in);
		System.out.print("Enter message: ");
		String input=scan1.nextLine();
		
		String inputModified=capitalizeString(input);
		
		for(int i=0;i<inputModified.length();i++){
			char current=inputModified.charAt(i);
			if(current=='A' || current=='a'){
					current='4';
			}
			else if(current=='B' || current=='b'){
				current='8';
			}
			else if(current=='E' || current=='e'){
				current='3';
			}
			else if(current=='I' || current=='i'){
				current='1';
			}
			else if(current=='O' || current=='o'){
				current='0';
			}
			else if(current=='S' || current=='s'){
				current='5';
			}
			System.out.print(current);
		}//end for
		System.out.print("!!!!!!!!!!");
	}
}

