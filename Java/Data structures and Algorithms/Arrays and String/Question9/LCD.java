package Question9;
import java.util.*;
import java.lang.Character;
public class LCD {

	public static void main(String[] args) {
		String[] arrayTop={"-"," ","-","-"," ","-","-","-","-","-"};
		String[] arrayTopLeft={"|"," "," "," ","|","|","|"," ","|","|"};
		String[] arrayTopRight={"|","|","|","|","|"," "," ","|","|","|"};
		String[] arrayMiddle={" "," ","-","-","-","-","-"," ","-", "-"};
		String[] arrayBottomLeft={"|"," ","|"," "," "," ","|"," ","|"," "};
		String[] arrayBottomRight={"|","|"," ","|","|","|","|","|","|","|"};
		String[] arrayBottom={"-"," ","-","-"," ","-","-"," ","-"," "};

		Scanner sn=new Scanner(System.in);
		System.out.print("Enter a number: ");
		String num=sn.nextLine();
		System.out.println();
		System.out.print("Enter size: ");
		int size=sn.nextInt();
		
		for(int i=0;i<num.length();i++){
			char current=num.charAt(i);
			int index=Character.getNumericValue(current);
			System.out.print(" ");
			for(int k=0;k<size;k++){
				System.out.print(arrayTop[index]);
				}
			System.out.print(" ");
		}
		
		System.out.print(" ");
		System.out.println();
		
		for(int i=0;i<size;i++){
			for(int j=0;j<num.length();j++){
				char current=num.charAt(j);
				int index=Character.getNumericValue(current);
				System.out.print(arrayTopLeft[index]);
				for(int k=0;k<size;k++){
					System.out.print(" ");
				}
				System.out.print(arrayTopRight[index]);
			}
			System.out.print(" ");
			System.out.println();
		}		
		
		for(int i=0;i<num.length();i++){
			char current=num.charAt(i);
			int index=Character.getNumericValue(current);
			System.out.print(" ");
			for(int k=0;k<size;k++){				
				System.out.print(arrayMiddle[index]);
			}
			System.out.print(" ");
		}
		
		System.out.print(" ");
		System.out.println();
		
		for(int i=0;i<size;i++){
			for(int j=0;j<num.length();j++){
				char current=num.charAt(j);
				int index=Character.getNumericValue(current);
				System.out.print(arrayBottomLeft[index]);
				for(int k=0;k<size;k++){
					System.out.print(" ");
				}
				System.out.print(arrayBottomRight[index]);
			}
			System.out.print(" ");
			System.out.println();
		}
		
		for(int i=0;i<num.length();i++){
			char current=num.charAt(i);
			int index=Character.getNumericValue(current);
			System.out.print(" ");
			for(int k=0;k<size;k++){
				System.out.print(arrayBottom[index]);
			}
			System.out.print(" ");
		}
		System.out.print(" ");
		System.out.println();	
	}	
}


