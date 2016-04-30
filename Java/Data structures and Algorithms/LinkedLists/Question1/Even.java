package Question1;
import java.util.*;

public class Even {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int start=sn.nextInt();
		int end=sn.nextInt();
		
		LinkedList<Integer> myList=new LinkedList<Integer>();
		
		for(int i=start;i<=end;i++){	
			if(i%2==0){
				myList.addLast(i);
			}
		}
		
		//sum of all even numbers
		int sum=0;
		for(int i=0;i<myList.size();i++){
			sum+=myList.get(i);
		}
		System.out.println("Sum: "+sum);
		int lastIndex=myList.size();
		myList.add(lastIndex,sum);

		//print myList
		for(int i=0;i<myList.size();i++){
			System.out.print(myList.get(i)+"\t");
		}
		//or
		System.out.println();
		Iterator<Integer> it=myList.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+"\t");
		}
	}//end main
}//end Even
