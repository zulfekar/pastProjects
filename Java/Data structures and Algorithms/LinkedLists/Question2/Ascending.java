package Question2;
import java.util.*;

public class Ascending {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		LinkedList<Integer> myList=new LinkedList<Integer>();
		
		int input=sn.nextInt();
		if(input!=0){
			myList.add(input);

			input=sn.nextInt();
			while(input!=0){
				int i;
				for(i=0;i<myList.size();i++){
					if(input<myList.get(i)){
						myList.add(i,input);
						break;
					}
				}
				input=sn.nextInt();
			}
		}
		System.out.println("Linked List: ");
		for(int i=0;i<myList.size();i++){
			System.out.print(myList.get(i)+"\t");
		}
		
		//declaring a vector with the contents of the linked list
		List<Integer> myVector=new Vector<Integer>(myList);//we could use Vector<Integer> but interface List is reusable
		System.out.println();
		System.out.println("Vector List: ");
		for(int i=0;i<myVector.size();i++){
			System.out.print(myVector.get(i)+"\t");
		}
		//System.out.print('z'-'a');
	}		
}
