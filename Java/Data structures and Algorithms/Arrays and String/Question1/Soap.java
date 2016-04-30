package Question1;
import java.util.*;
public class Soap {
	public static void main(String[] args) {
		int inputChoice;
		int count[]={0,0,0,0,0,0,0,0,0,0};
		int countInput=0;
		String soapOpera[]={"Dynasty", "C’est La Vie", "Kyunki Saas Bhi Kabhi Bahu Thi", "Santa Barbara", "The Bold and the Beautiful", "Melrose Place", "Desperate Housewife", "Family Pride","Beverly Hills", "For Poor For Richer"};

		Scanner sn=new Scanner(System.in);
		System.out.print("Please enter the choices: ");
		inputChoice=sn.nextInt();
		while(inputChoice!=-1){
			count[inputChoice-1]++;
			countInput++;
			inputChoice=sn.nextInt();
		}
		
		System.out.println("\nPercentage of persons having preference for each soap opera: ");
		
		for(int i=0;i<count.length;i++){
			System.out.print("\t");
			System.out.print(i+1+"\t");
		}
		System.out.println();
		
		for(int i=0;i<count.length;i++){
			System.out.print("\t");
			System.out.printf("%.2f",(((count[i])/((float)countInput))*100));
			System.out.print("%\t");
		}
		
		System.out.println();
		
		int max=count[0];
		int mostPopular=0;
		for(int j=1;j<count.length;j++){
			if (count[j]>max){
				max=count[j];
				mostPopular=j;
			}
		}
		System.out.println(soapOpera[mostPopular]+" is the most popular soap opera in Mauritius.");
	}
}
