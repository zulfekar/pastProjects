package Question4;
import java.util.*;

public class DateConverter {
	
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.print("Please enter a date dd/mm/yyyy: ");
		String input=sn.next();
		String[] temp;
		String delimiter = "/";
		temp = input.split(delimiter);
		String[] arrayCalendar={"January","February","March","April","May","June","July","August","September","October","November","December"};
		String thst="th";
		String dd=temp[0];
		if(dd.charAt(dd.length()-1)=='1' && (dd.charAt(0)!='1')){
			thst="st";
		}
		else if(dd.charAt(dd.length()-1)=='2' && (dd.charAt(0)!='1')){
			thst="nd";
		}
		else if(dd.charAt(dd.length()-1)=='3' && (dd.charAt(0)!='1')){
			thst="rd";
		}
		String mm=arrayCalendar[Integer.parseInt(temp[1]) - 1];
		String yyyy=temp[2];
		
		System.out.printf("Date in verbose format: "+dd+thst+" "+mm+" "+yyyy);
	}
}


 