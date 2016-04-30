package Test;
import java.util.*;

public class Initial {
	public static void main(String[] args){
		char current1,current2;
		int index1,index2;
		String f,l,initial;
		Scanner sn=new Scanner(System.in);
		String first=sn.next().toLowerCase();
		String last=sn.next().toLowerCase();
		int[] count1={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int[] count2={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		String[] alpha={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		for(int i=0;i<first.length();i++){
			current1=first.charAt(i);
			index1=Character.getNumericValue(current1);
			count1[index1-10]++;
		}
		//finding max count1
		int most1=count1[0];
		int freq1=0;
		for(int x=1;x<count1.length;x++){
			if(count1[x]>most1){
				freq1=x;
				most1=count1[x];
			}	
		}
		f=alpha[freq1];
        ////////////////////////////////////////////////////////////
		for(int j=0;j<last.length();j++){
			current2=last.charAt(j);
			index2=Character.getNumericValue(current2);
			count2[index2-10]++;
		}
		//finding max count2
		int most2=count2[0];
		int freq2=0;
		for(int y=1;y<count2.length;y++){
			if(count2[y]>most2){
				freq2=y;
				most2=count2[y];
			}
		}
		l=alpha[freq2];
		
		initial=f.toUpperCase()+l.toUpperCase();
		System.out.println(initial);
	}
}
