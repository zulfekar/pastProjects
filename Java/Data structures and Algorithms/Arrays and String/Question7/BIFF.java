package Question7;
import java.util.Scanner;
public class BIFF {

	public static String capitalizeString(String x){
		  char[] chars = x.toLowerCase().toCharArray();
		  boolean found = false;
		  for (int i=0;i<chars.length;i++){
		    if(!found && Character.isLetter(chars[i])){
		      chars[i]=Character.toUpperCase(chars[i]);
		      found=true;
		    } else if(Character.isWhitespace(chars[i]) || chars[i]=='.' || chars[i]=='\''){ // You can add other chars here
		      found = false;
		    }
		  }
		  return String.valueOf(chars);
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