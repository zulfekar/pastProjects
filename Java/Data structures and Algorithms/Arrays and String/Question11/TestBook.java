package Question11;
import java.util.*;
public class TestBook {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter number of books: ");
		int num=sn.nextInt();
		
		Book[] arrayBook = new Book[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("Enter isbn: ");
			long isbn = sn.nextLong();
			sn.nextLine();
			System.out.print("Enter title: ");
			String title = sn.nextLine();
			System.out.print("Enter author: ");
			String author = sn.nextLine();
			System.out.print("Enter year of publication: ");
			int yearPublication = sn.nextInt();
			System.out.print("Enter price: ");
			double price = sn.nextDouble();
			
			arrayBook[i] = new Book (isbn, title, author, yearPublication, price);
		}
		System.out.println();
		for (int i = 0; i < num; i++) {
			System.out.println(arrayBook[i]);
		}
	}
}
