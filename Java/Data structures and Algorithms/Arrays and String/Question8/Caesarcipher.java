package Question8;
import java.util.Scanner;
public class Caesarcipher {
	
	public static String convertCypher(String x){
		String fullWord="";
		char character;
		Scanner scan1=new Scanner(x);
		
		String word=scan1.nextLine();
		for(int j=0;j<word.length();j++){
			char current=word.charAt(j);
			if(current=='y')
				character='a';
			else if(current=='Y')
				character='A';
			else if(current=='z')
				character='b';
			else if(current=='Z')
				character='B';
			else if(current==' ')
				character=' ';
			else{
				int ascii=(int)(current)+2;
				character=(char)(ascii);
			}
			fullWord+=character;
			}
		return fullWord;
	}
	
	public static void main(String[] args) {
		Scanner scan3=new Scanner(System.in);
		System.out.print("Original message: ");
		String input=scan3.nextLine();
		System.out.println("Encoded message: "+convertCypher(input));
	}
}