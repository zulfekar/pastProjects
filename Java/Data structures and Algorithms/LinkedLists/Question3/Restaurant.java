package Question3;
import java.util.*;

public class Restaurant {
	public static void main(String[] args) {
		int table;
		LinkedList<Integer> myList=new LinkedList<Integer>();
		
		Scanner sn=new Scanner(System.in);	
		String todo=sn.next().toLowerCase();
		table=sn.nextInt();
		while(!todo.equals("x")){
			if(todo.equals("o")){
				myList.addLast(table);
				System.out.println("Table id "+table+" has been added");
			}
			else if(todo.equals("d")){
				myList.remove(myList.indexOf(table));
				System.out.println("Table id "+table+" has been delivered");
			}
			else if(todo.equals("q")){
				int temp=myList.indexOf(table);
				myList.indexOf(table);
				System.out.print("Before you, Table ");
				for(int i=0;i<temp;i++){
					System.out.print(myList.get(i)+", ");
				}
				System.out.print("are waiting.");
			}
			sn.nextLine();
			todo=sn.next().toLowerCase();
			table=sn.nextInt();
		}		
	}
}

