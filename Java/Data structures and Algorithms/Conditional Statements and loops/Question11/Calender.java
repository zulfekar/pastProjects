package Question11;
import java.util.*;
public class Calender {
	public static void month(int day,int week){
/*			if(week==1)
				System.out.print("1"+"\t");
			else if(week==2)
				System.out.print("\t"+"1"+"\t");
			else if(week==3)
				System.out.print("\t \t"+"1"+"\t");
			else if(week==4)
				System.out.print("\t \t \t"+"1"+"\t");
			else if(week==5)
				System.out.print("\t \t \t \t"+"1"+"\t");
			else if(week==6)
				System.out.print("\t \t \t \t \t"+"1"+"\t");
			else if(week==7)
				System.out.print(" \t \t \t \t \t \t"+"1"+"\n");*/
		
		for(int i=0;i<week-1;i++){
			System.out.print("\t");
		}
			
			for(int i=1;i<=day;i++){
				//if(week+i-1==8 || week+i==15 || week+i==22 || week+i==29){
				if ((week+i-1)%7==0){
					System.out.print(i+"\n");
				}
				else{
				System.out.print(i+"\t");
				}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter number of days in month: ");
		int day=sn.nextInt();
		System.out.print("Enter starting day of the week (1=Sun, 7=Sat): ");
		int week=sn.nextInt();
		month(day,week);
	}

}
